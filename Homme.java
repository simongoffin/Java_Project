public class Homme extends Personne{
	
	public Homme(String prenom,String nom){
		this.prenom=prenom;
		this.nom=nom;
		this.id=Personne.nombre_P;
		Personne.nombre_P++;
	}

}
