import java.time.LocalDate;

public class Client {

    // Les attributs de la classe Client
    private String nom;
    private String prenom;
    private int pin;

    private int solde;

    //Le constructeur de l'age du client:
    //public int getAge(){
    //  return dateNaissance.until(LocalDate.now()).getYears();}


    // Le constructeur de la classe Client
    public Client(String nom, String prenom, int pin, int solde) {
        // Initialisation des attributs de la classe avec les paramètres du constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.pin = pin;
        this.solde = solde;


    }

    // Les méthodes get pour récupérer les valeurs des attributs
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public int getPin(){
        return pin;
    }

    // La méthode toString pour afficher une représentation textuelle de l'objet Client
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' + ",solde=" + solde + "€" +
                '}';
    }
}

