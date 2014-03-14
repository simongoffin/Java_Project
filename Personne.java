
public abstract class Personne implements Nationalite {
	static int nombre_P=0;
	protected String nom;
	protected String prenom;
	protected String nation="Belgique";
	protected int id;
	
	public void get_nationalite(){
		System.out.println("Je viens de "+nation); 
	}
	
	
	public String toString(){
		return "Je m'appelle "+prenom+" "+nom+" "+"et mon id est "+id;
	}
	

}
