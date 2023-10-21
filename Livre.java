package td4Heritage;

public class Livre {
	protected String titre;
	protected int id;
	protected final double tva=0.10;
	protected String domaine;
	protected int nbPages;
	protected static int count;
	
	public Livre(String titre, String domaine, int nbPages) {
		
		this.id=++count;
		this.titre=titre;
		this.domaine=domaine;
		this.nbPages=nbPages;
		
	}
	@Override
	public String toString() {
		return ("LE " +getClass().getSimpleName()+": "+ titre +" son id : "+id +" son domaine : " +domaine+ " son nbPAge : "+nbPages);
	}
	public double CalculPrix() {
		double prix= (0.075 * nbPages)*(1+tva);
		return prix;
		
	}

}
