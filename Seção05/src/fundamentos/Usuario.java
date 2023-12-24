package fundamentos;

public class Usuario {

	String nome;
	String email;
	
	Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;	
			
			boolean nomeIngual = outro.nome.equals(this.nome);
			boolean emailIngual = outro.email.equals(this.email);
			
			return nomeIngual && emailIngual;
		}
		return false;
	}
	
	public int hashCode() {
		return this.nome.length();
	}
}
