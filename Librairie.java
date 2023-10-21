package td4Heritage;

public class Librairie {
	private int capacite;
	private int nb;
	private Livre[] tabLivre;
	private int i=0;

    public Librairie(int capacite) {
        this.capacite = capacite;
        this.tabLivre = new Livre[capacite];
        this.nb=0;
    }
    public int getNb() {
        return nb;
    }
    public void inventaire() {
    	for (i=0;i<nb;i++) {
    		Livre l =tabLivre[i];
    		System.out.println(l.toString() + " son prix est : " + l.CalculPrix());    
    	}
    }
    public void inventaire(String categ) {
    	for (i=0;i<nb;i++) {
    		Livre l1 =tabLivre[i];
    		  if(l1.getClass().getSimpleName().equals (categ)) {
    			  System.out.println(l1.toString() + " son prix est : " + l1.CalculPrix());    
    		  }
    	}
    	
    }
    void ajouLiv(Livre liv) {
    	if (nb < capacite) {
    		tabLivre[nb]=liv;
            nb++;
        } else {
            System.out.println(" Impossible !");
        }
    }
    void suppLiv(int num) {
    	for (i =0;i<nb;i++) {
            if (tabLivre[i].id == num) {
                for (int j=i;j<nb-1;j++) {
                	tabLivre[j] = tabLivre[j+1];
                }
                nb--;
                

    }
    	}}
    
    public double CalculPrixRomans() {
    	double mt=0;
    	for (i =0;i<nb;i++) {
    		if (tabLivre[i] instanceof Roman) {
    			mt += tabLivre[i].CalculPrix();
            }
    	}
    	return mt;
    	
    }
}
