package ds2023;

public class Arbre extends Plante{
	private String type_Feuillage;
	
	//  final :  cette variable ne peut plus être modifiée après sa première affectation.
    private final double AbsorMoyenne = 22;
    
    public Arbre(String nom, double hauteur, int age, double prix, String type_Feuillage) {
        super(nom, hauteur, age, prix);
        this.type_Feuillage = type_Feuillage;
    }
    @Override
    public void description() {
        System.out.println(this.toString());
    }
	
    @Override
    public String toString() {
        return super.toString() + ", Type de feuillage : " + type_Feuillage;
    }
    public double absorptionCO2() {
        if (hauteur > 50)
            return AbsorMoyenne + 3;
        else
            return AbsorMoyenne;
    }
    
    //Un getter est une méthode spéciale qui permet de lire la valeur d’un attribut privé.
    public String getTypeFeuillage() {
        return type_Feuillage;
    }

}
