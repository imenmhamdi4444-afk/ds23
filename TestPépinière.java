package ds2023;

public class TestPépinière {
    public static void main(String[] args) {
    	Pépinière pep = new Pépinière();

        Fleur f1 = new Fleur("Rose", 30, 12, 15, "Rouge", 5);
        Fleur f2 = new Fleur("Tulipe", 25, 8, 10, "Jaune", 9);
        Arbre a1 = new Arbre("Chêne", 60, 120, 200, "caduque");
        Arbre a2 = new Arbre("Pin", 40, 100, 180, "persistant");

        pep.ajoutPlante(f1);
        pep.ajoutPlante(f2);
        pep.ajoutPlante(a1);
        pep.ajoutPlante(a2);

        pep.afficherInventaire();

        System.out.println("Absorption totale CO2 : " + pep.totalAbsorptionTotaleCO2());
        System.out.println("Nombre d'arbres caduques : " + pep.compterArbresCaduques());
    }
}
