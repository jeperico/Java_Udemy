package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class BuildStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "Rustle ", "Kobol ", "JS\n");
		langs.forEach(print);
		
		String[] otherLanguages = { "Pearl ", "Go ", "C ", "C# ", "C++\n"};
		
		Stream.of(otherLanguages).forEach(print);
		Arrays.stream(otherLanguages).forEach(print);
		Arrays.stream(otherLanguages, 0, otherLanguages.length).forEach(print);
		
		List<String> othersOthersLanguages = Arrays.asList("PHP ", "Kotlin ", "Ruby ", "Pascal ", "Assembly\n");
		othersOthersLanguages.parallelStream().forEach(print);
		
		Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}
