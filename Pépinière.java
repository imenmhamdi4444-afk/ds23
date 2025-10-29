package ds2023;
 // inventaire est une variable qui contient toutes les plantes de la pépinière.
//C’est une liste (ou un tableau) où on range chaque plante ajoutée.
public class Pépinière {
    private final int MAX_PLANTES = 1000;
    //inventaire est un tableau d’objets (array) qui va contenir des plantes.
    private Plante[] inventaire;
    private int nombreDePlantes;

    public Pépinière() {
        inventaire = new Plante[MAX_PLANTES];
        nombreDePlantes = 0;
    }

    public void ajoutPlante(Plante p) {
        if (nombreDePlantes < MAX_PLANTES) {
            inventaire[nombreDePlantes] = p;
            nombreDePlantes++;
        } else {
            System.out.println("⚠️ Impossible d’ajouter : inventaire plein !");
        }
    }

    public void afficherInventaire() {
        for (int i = 0; i < nombreDePlantes; i++) {
            inventaire[i].description();
            System.out.println("-----------");
        }
    }

    public double totalAbsorptionTotaleCO2() {
        double total = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            if (inventaire[i] instanceof Arbre) {
                Arbre a = (Arbre) inventaire[i];
                total += a.absorptionCO2();
            }
        }
        return total;
    }

    public int compterArbresCaduques() {
        int nb = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
        	//instanceof sert à savoir si l’objet est d’un certain type (ici, de type Arbre).
            if (inventaire[i] instanceof Arbre) {
                Arbre a = (Arbre) inventaire[i];
                //equalsIgnoreCase("caduque") compare le texte sans tenir compte des majuscules/minuscules.
                if (a.getTypeFeuillage().equalsIgnoreCase("caduque"))
                    nb++;
            }
        }
        return nb;
    }
}
