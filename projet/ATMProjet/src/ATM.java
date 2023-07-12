import java.util.Scanner;

public class ATM {

    // Instance de la classe Bank pour accéder aux informations des clients
    private Bank bank;

    // Code PIN du client actuellement authentifié
    private int currentPin;

    //Constructeur ATM avec intialisation de la variable currentPin à zero, cela signifie qu'aucun code pin est entre,
    //donc pad de client authentifier
    public ATM(Bank bank) {
        this.bank = bank;
        this.currentPin = 0;
    }

    //methode authenticate qui prend en parametre un entier pin, et qui renvoie une valeur booléen
    //Elle est directement utilisé dans la classe Main
    public boolean authenticate(int pin) {
        // Vérifie si le code PIN fourni correspond à un client de la banque
        Client client = bank.getClientByPin(pin);
        // Verifie si la variable client n'est pas null, si c'est le cas alors le codePin correspond à un client
        if (client != null) {
            // Enregistre le code PIN actuellement authentifié
            currentPin = pin;
            // Authentification réussie
            return true;
        }
        // Authentification échouée
        return false;
    }

    //Methode displauMenu, elle ne retourne rien et permet d'afficher le menue (donc que du texte dans la console)
    //elle est directelent utilisé dans la classe Main
    public void displayMenu() {
        // Affiche le menu
        System.out.println("Menu :");
        System.out.println("1. Consulter le solde");
        System.out.println("2. Déposer de l'argent");
        System.out.println("3. Retirer de l'argent");
        System.out.println("4. Quitter");
        System.out.print("Veuillez choisir : ");
    }

    public void performOperation(int choice) {
        //initialisation de l'objet scanner de la classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Récupère le client correspondant au code PIN actuellement authentifié garce à la méthode créer dans la classe Bank
        Client client = bank.getClientByPin(currentPin);

        switch (choice) {
            //Lien utile pour le menue switch :
            //https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html#GUID-BA4F63E3-4823-43C6-A5F3-BAA4A2EF3ADC
            case 1:
                // Affiche le solde du client
                System.out.println("Solde actuel : " + client.getSolde());
                break;

            case 2:
                // Lit le montant à déposer
                System.out.print("Montant à déposer : ");

                //declaration d'une varibale double -> depositAMount  qui prend pour valeur l'entrer de l'utilisateur
                double depositAmount = scanner.nextDouble();

                // Ajoute le montant déposé au solde du client
                client.setSolde(client.getSolde() + depositAmount);

                // Affiche le nouveau solde après le dépôt
                System.out.println("Dépôt effectué. Nouveau solde : " + client.getSolde());
                break;

            case 3:
                System.out.print("Montant à retirer : ");

                //declaration d'une varibale double -> withdrawAmount  qui prend pour valeur l'entrer de l'utilisateur
                double withdrawAmount = scanner.nextDouble();

                //Verifie si le montant retirer est inférieur ou egale au solde du cleint
                if (withdrawAmount <= client.getSolde()) {

                    //Si le montant retirer est inférieur au solde alors il deduit le montant retirer au solde du client
                    client.setSolde(client.getSolde() - withdrawAmount);
                    //Puis l'affiche
                    System.out.println("Retrait effectué. Nouveau solde : " + client.getSolde());
                } else {
                    //Sinon message d'erreur
                    System.out.println("Solde insuffisant.");
                }
                break;

            case 4:
                //Case de sortie du programm en remettant le currentPin a 0 c'est a dire en deconnectant le client
                System.out.println("Merci d'utiliser notre ATM. Au revoir !");
                currentPin = 0;
                break;
            //Si l'ulisateur ne renseigne pas les bon choix c'est a dire 1,2,3 ou 4, un message par default s'affiche
            default:
                System.out.println("Choix invalide."); // Affiche un message d'erreur pour un choix invalide
                break;
        }
    }
}
