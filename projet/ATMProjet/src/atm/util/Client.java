package atm.util;

public class Client {
    //La classe atm.util.Client possède des attributs privés: nom prenom solde codepin
    // Le nom du client
    private String nom;

    // Le prénom du client
    private String prenom;

    // Le code PIN du client
    private int codePin;

    // Le solde du client
    private double solde;

    //constructeur de la classe client
    public Client(String nom, String prenom, int codePin, double solde) {
        // Initialise le nom prenom codepin et solde avec la valeur fournie en paramètre
        this.nom = nom;
        this.prenom = prenom;
        this.codePin = codePin;
        this.solde = solde;
    }

    public String getNom() {
        // Retourne le nom
        return nom;
    }

    public String getPrenom() {
        // Retourne le prenom
        return prenom;
    }

    public int getCodePin() {
        // Retourne le code PIN
        return codePin;
    }

    public double getSolde() {
        // Retourne le solde
        return solde;
    }
    //setteur du solde, permet de mettre a jou rla valeur de solde lorsque atm l'utilise
    public void setSolde(double solde) {
        this.solde = solde;
    }
}


