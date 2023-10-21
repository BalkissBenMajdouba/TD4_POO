package td4Heritage;

public class Roman extends Livre {
	private String nomAut;
	private String nomEdit;

	public Roman(String titre, String domaine, int nbPages,String nomAut, String nomEdit) {
		super(titre, domaine, nbPages);
		this.nomAut=nomAut;
		this.nomEdit=nomEdit;
	}
	public String toString() {
		return (super.toString()+" le nom d'editeur: "+nomEdit+ " nom d'auteur: "+nomAut);
	}
	@Override 
	public double CalculPrix() {
		double prix=  (0.05 * nbPages)*(1+tva);
		return prix;
		
	}
}
