import java.time.LocalDate;

public class Client {

    // Les attributs de la classe Client
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private LocalDate dateNaissance;
    //Le constructeur de l'age du client:
    public int getAge(){
        return dateNaissance.until(LocalDate.now()).getYears();
    }


    // Le constructeur de la classe Client
    public Client(String nom, String prenom, String adresse, String codePostal, String ville) {
        // Initialisation des attributs de la classe avec les paramètres du constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;

    }

    // Les méthodes get pour récupérer les valeurs des attributs
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    // La méthode toString pour afficher une représentation textuelle de l'objet Client
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}

