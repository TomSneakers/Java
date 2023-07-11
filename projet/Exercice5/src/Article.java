public class Article {

    // Les attributs de la classe Article
    private String reference;
    private String designation;
    private double prix;

    // Le constructeur de la classe Article
    public Article(String reference, String designation, double prix) {
        // Initialisation des attributs de la classe avec les paramètres du constructeur
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    // Les méthodes get pour récupérer les valeurs des attributs
    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    // La méthode set pour modifier la valeur de l'attribut prix
    public void setPrix(double prix) {
        this.prix = prix;
    }

    // La méthode toString pour afficher une représentation textuelle de l'objet Article
    public String toString() {
        return "Article{" +
                "reference='" + reference + '\'' +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }
}