package td4Heritage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Livre l1 = new Livre("l1",  "Comedie", 155);
	      Roman r1 = new Roman("r1",  "Tragidi", 370, "Francois C", "Jean F");
	      Magazine mag1 = new Magazine("boule et bill", "enfant", 100, 2);

		System.out.println(l1);
		System.out.println(r1);
		System.out.println(mag1);
		System.out.println();
		
		Librairie lib = new Librairie(4);
		lib.ajouLiv(l1);
		lib.ajouLiv(r1);
		lib.ajouLiv(mag1);
		lib.inventaire();
        System.out.println();
    	
        Roman r2 = new Roman("r2", "Policier et thriller.", 134, "Abu", "BioEdi");
        lib.ajouLiv(r2);
        lib.inventaire("Roman");
        System.out.println();
       // librairie.inventaire("Magazine");
      
        System.out.println("prix total roman: "+ lib.CalculPrixRomans());
        
        //quest:  
        /* Le libraire vient de recevoir un nouveau magazine. Peut-il l’ajouter dans sa
        librairie ? Pourquoi ? Comment y remédier ? */
        
        //rep
       /* il ne peut pas car capacite=4 et on a deja ajouter 4. on peut supprimer avec la 
        methode suppLiv et ajouter un autre.
*/
        
        
        System.out.println();      
        lib.suppLiv(2);
        lib.inventaire();
        Magazine mag2 = new Magazine("CNRS", "scientifiques", 2009, 4);
        lib.ajouLiv(mag2);
        System.out.println();      
        System.out.println();      
        lib.inventaire();
        
	}
	

}
