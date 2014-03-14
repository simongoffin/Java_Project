
public abstract class Personne {
	static int nombre_P=0;
	protected String nom;
	protected String prenom;
	protected int id;
	
	
	public String toString(){
		return "Je m'appelle "+prenom+" "+nom+" "+"et mon id est "+id;
	}
	

}
