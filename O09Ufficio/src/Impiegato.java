
public class Impiegato {

	
	String nome;
	int salario;
	String ufficio;
	
	
	public Impiegato(String nome, int salario, String ufficio) {
		this.nome = nome;
		this.salario = salario;
		this.ufficio = ufficio;
	}


	public String toString() {
		return "Manager [nome=" + nome + ", salario=" + salario + ", ufficio=" + ufficio + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public String getUfficio() {
		return ufficio;
	}


	public void setUfficio(String ufficio) {
		this.ufficio = ufficio;
	}
	
}
