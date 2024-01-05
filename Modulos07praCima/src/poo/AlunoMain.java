package poo;

public class AlunoMain {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Maivon");
		Aluno a2 = new Aluno("Marcelinho");
		Aluno a3 = new Aluno("BrunoMa");
		
		Curso c1 = new Curso("HTML e CSS");
		Curso c2 = new Curso("Java");
		Curso c3 = new Curso("PHP");
		
		c1.addAluno(a1);
		c1.addAluno(a2);
		c1.addAluno(a3);
		
		c2.addAluno(a1);
		c2.addAluno(a2);
		
		a1.addCurso(c3);
		
		for(Aluno aluno: c1.alunos) {
			System.out.println(c1.nome + ": " + aluno.nome);
		}
	}
}
