package ds2023;

public class Fleur extends Plante  {
	private String couleur;
	private int moisF;
	
    public Fleur(String nom, double hauteur, int age, double prix, String couleur, int moisF) {
    	//super(...) appelle le constructeur de Plante
    	
    	super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }
    @Override
    public void description() {
        System.out.println(this.toString());
        fleurir();
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Couleur : " + couleur + ", Mois de floraison : " + moisF;
    }
 
    //fleurir() vérifie le moisF
    public void fleurir() {
        if (moisF == 4 || moisF == 5 || moisF == 6)
            System.out.println(" La fleur est en fleurs ");
        else
            System.out.println(" La fleur n’est pas en fleurs");
    }
}
