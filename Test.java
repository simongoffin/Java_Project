
public class Test {
	public static void main(String args[]){
		System.out.println("Coucou!");
		Homme simon=new Homme("Simon","Goffin");
		Femme francoise=new Femme("Francoise","Brix");
		Homme anthony=new Homme("Anthony","Mormont");
		Homme mathieu=new Homme("Mathieu","Volpe","Italie");
		System.out.println(simon.toString());
		simon.get_nationalite();
		System.out.println(francoise.toString());
		francoise.get_nationalite();
		System.out.println(anthony.toString());
		anthony.get_nationalite();
		System.out.println(mathieu.toString());
		mathieu.get_nationalite();
		
		
		
	}

}
