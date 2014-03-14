
public class Employe {
	public Personne p;
	public Metier m;
	static int nombre_E=0;
	public int id;
	
	public Employe(Personne p,Metier m){
		this.p=p;
		this.m=m;
		this.id=nombre_E;
		nombre_E++;
		
	}
	
	public void affiche(){
		System.out.println("Mon id employe est "+id);
		System.out.println(p.toString());
		p.get_nationalite();
		System.out.println(m.toString());
	
	}

}
