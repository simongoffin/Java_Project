
public class Metier {
	protected String job;
	static int nombre_M=0;
	protected int id;
	
	public Metier(String job){
		this.job=job;
		this.id=nombre_M;
		nombre_M++;
	}
	
	public String get_job(){
		return job;
	}
	
	public int get_id(){
		return id;
	}
	
	public String toString(){
		return "Mon metier est "+job;
	}

}
