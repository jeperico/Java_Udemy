package fundamentos;

import java.util.Objects;

public class UsuarioTeste {

	String nome;
	String email;
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioTeste other = (UsuarioTeste) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	
}
