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

    public boolean authenticate(int pin) {
        // Vérifie si le code PIN fourni correspond à un client de la banque
        Client client = bank.getClientByPin(pin);
        if (client != null) {
            currentPin = pin; // Enregistre le code PIN actuellement authentifié
            return true; // Authentification réussie
        }
        return false; // Authentification échouée
    }

    public void displayMenu() {
        // Affiche le menu des options disponibles
        System.out.println("Menu :");
        System.out.println("1. Consulter le solde");
        System.out.println("2. Déposer de l'argent");
        System.out.println("3. Retirer de l'argent");
        System.out.println("4. Quitter");
        System.out.print("Veuillez choisir : ");
    }

    public void performOperation(int choice) {
        Scanner scanner = new Scanner(System.in);

        if (currentPin == 0) {
            System.out.println("Authentification requise."); // Si aucun client n'est authentifié, affiche un message d'erreur
            return;
        }

        Client client = bank.getClientByPin(currentPin); // Récupère le client correspondant au code PIN actuellement authentifié

        switch (choice) {
            case 1:
                System.out.println("Solde actuel : " + client.getSolde()); // Affiche le solde du client
                break;
            case 2:
                System.out.print("Montant à déposer : ");
                double depositAmount = scanner.nextDouble(); // Lit le montant à déposer
                scanner.nextLine(); // Vide le tampon de lecture
                client.setSolde(client.getSolde() + depositAmount); // Ajoute le montant déposé au solde du client
                System.out.println("Dépôt effectué. Nouveau solde : " + client.getSolde()); // Affiche le nouveau solde après le dépôt
                break;
            case 3:
                System.out.print("Montant à retirer : ");
                double withdrawAmount = scanner.nextDouble(); // Lit le montant à retirer
                scanner.nextLine(); // Vide le tampon de lecture

                if (withdrawAmount <= client.getSolde()) {
                    client.setSolde(client.getSolde() - withdrawAmount); // Déduit le montant retiré du solde du client
                    System.out.println("Retrait effectué. Nouveau solde : " + client.getSolde()); // Affiche le nouveau solde après le retrait
                } else {
                    System.out.println("Solde insuffisant."); // Affiche un message d'erreur si le solde est insuffisant pour le retrait
                }
                break;
            case 4:
                System.out.println("Merci d'utiliser notre ATM. Au revoir !"); // Affiche un message de sortie
                currentPin = 0; // Réinitialise le code PIN actuellement authentifié (déconnexion)
                break;
            default:
                System.out.println("Choix invalide."); // Affiche un message d'erreur pour un choix invalide
                break;
        }
    }
}
