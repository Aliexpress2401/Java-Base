
public class Manager extends Impiegato{

	int telefonoUfficio;

	public Manager(String nome, int salario, String ufficio, int telefonoUfficio) {
		super(nome, salario, ufficio);
		this.telefonoUfficio = telefonoUfficio;
	}


	public String toString() {
		return "Manager [telefonoUfficio=" + telefonoUfficio + "]";
	}

	public int getTelefonoUfficio() {
		return telefonoUfficio;
	}

	public void setTelefonoUfficio(int telefonoUfficio) {
		this.telefonoUfficio = telefonoUfficio;
	}





}
