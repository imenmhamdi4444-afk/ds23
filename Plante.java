package ds2023;

public class Plante {
	protected String nom;
	protected double hauteur;
	protected int age ;
	protected double prix;
	public Plante ( String nom,double hauteur,int age,double prix) {
		this.nom=nom;
		this.hauteur=hauteur;
		this.age=age;
		this.prix=prix;
	}
	  // Méthode toString() : toString() assemble une chaîne avec les infos de la plante.
    public String toString() {
        return "Nom : " + nom + ", Hauteur : " + hauteur + " cm, Âge : " + age + " mois, Prix : " + prix + " DT";
    }
	
    // Méthode description()
    public void description() {
        System.out.println(this.toString());
    }

}
