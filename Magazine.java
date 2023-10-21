package td4Heritage;

public class Magazine extends Livre{

	private int moisParu;

	public Magazine(String titre,  String domaine, int nbPages,int moisParu) {
		super(titre,  domaine, nbPages);
		this.moisParu=moisParu;
		
	}
	public String toString() {
		return (super.toString()+" le moisParu : "+moisParu );
	}
	
	  public double CalculPrix(int bonus) {
        return (0.35 * nbPages) * (1 + tva) + bonus;
    }
	  
}
