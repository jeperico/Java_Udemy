package fundamentos;

//import java.util.Objects;

public class Usuario {

	String nome;
	
	Usuario(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Meu nome é " + this.nome + "!"; 
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(nome);
//	}

	@Override
	public boolean equals(Object obj) {
		Usuario other = (Usuario) obj;
		return this.nome.equals(other.nome);
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usuario other = (Usuario) obj;
//		return Objects.equals(nome, other.nome);
	}
	
	
}
