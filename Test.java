//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;


public class Test {
	public static void main(String args[]){
		System.out.println("Coucou!");
		Homme simon=new Homme("Simon","Goffin");
		Homme anthony=new Homme("Anthony","Mormont");
		Femme francoise=new Femme("Francoise","Brix");
		Homme mathieu=new Homme("Mathieu","Volpe","Italie");
		Metier ingenieur=new Metier("Ingenieur");
		Employe goffin=new Employe(simon,ingenieur);
		System.out.println("*****HERITAGE*****");
		System.out.println(simon.toString());
		simon.get_nationalite();
		System.out.println("*****VARIABLE STATIQUE*****");
		System.out.println(anthony.toString());
		anthony.get_nationalite();
		System.out.println("*****POLYMORPHISME*****");
		System.out.println(francoise.toString());
		francoise.get_nationalite();
		System.out.println("*****INTERFACE+SURCHARGE*****");
		System.out.println(mathieu.toString());
		mathieu.get_nationalite();
		System.out.println("*****APPARTENANCE*****");
		goffin.affiche();
		//Creation DB
		DB data=new DB();
		//Insertions 
		data.insert_personne(simon);
		data.insert_personne(anthony);
		data.insert_personne(francoise);
		data.insert_personne(mathieu);
		data.insert_metier(ingenieur);
		
		
	}

}
