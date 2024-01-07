package poo;

public class Pessoa {

	private int age;
	private String name;
	private String lastname;
	
	public Pessoa(String name, String lastname, int age) {
		setAge(age);
		setLastname(lastname);
		setName(name);
	}
	
	public Pessoa() {
		this("Anomiado", "Sem Nome" ,20);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int newAge) {
		newAge = Math.abs(newAge);
		if(newAge >= 0 && newAge <= 120) {
			this.age = newAge;
		}
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFullName() {
		return getName() + " " + getLastname(); 
	}
	
	public String toString() {
		return "My name is " + getFullName() + " and I have " + getAge() + " years.";
	}
}
