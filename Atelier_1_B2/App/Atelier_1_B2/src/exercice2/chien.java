package exercice2;

public class chien {
	private String nom;
	
	public chien(String nom) {
		this.nom = nom;
	}

	public String aboyer(String aboyer) {
		return "aboyer " +aboyer+" est ";
	}
	public String manger(String manger) {
		return "aboyer" +manger;
	}
	@Override
	public String toString() {
		return "chien [nom=" + nom + "]";
	}


}
