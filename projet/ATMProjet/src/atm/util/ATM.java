package atm.util;
import database.Sqlite;
import java.util.Scanner;

public class ATM {
    private Bank bank;
    private int currentPin;

    public ATM(Bank bank) {
        this.bank = bank;
        this.currentPin = 0;
    }

    public boolean authenticate(int pin) {
        Client client = bank.getClientByPin(pin);
        if (client != null) {
            currentPin = pin;
            return true;
        }
        return false;
    }

    public void displayMenu() {
        System.out.println("Menu :");
        System.out.println("1. Consulter le solde");
        System.out.println("2. Déposer de l'argent");
        System.out.println("3. Retirer de l'argent");
        System.out.println("4. Quitter");
        System.out.print("Veuillez choisir : ");
    }

    public void performOperation(int choice) {
        Scanner scanner = new Scanner(System.in);
        Client client = bank.getClientByPin(currentPin);

        switch (choice) {
            case 1:
                System.out.println("Solde actuel : " + client.getSolde());
                break;

            case 2:
                System.out.print("Montant à déposer : ");
                double depositAmount = scanner.nextDouble();
                client.setSolde(client.getSolde() + depositAmount);

                Sqlite.getInstance().ExecuteNonQuery("UPDATE client SET solde = ? WHERE pcode = ?", client.getSolde(), currentPin);

                System.out.println("Dépôt effectué. Nouveau solde : " + client.getSolde());
                break;

            case 3:
                System.out.print("Montant à retirer : ");
                double withdrawAmount = scanner.nextDouble();

                if (withdrawAmount <= client.getSolde()) {
                    client.setSolde(client.getSolde() - withdrawAmount);
                    Sqlite.getInstance().ExecuteNonQuery("UPDATE client SET solde = ? WHERE pcode = ?", client.getSolde(), currentPin);

                    System.out.println("Retrait effectué. Nouveau solde : " + client.getSolde());
                } else {
                    System.out.println("Solde insuffisant.");
                }
                break;

            case 4:
                System.out.println("Merci d'utiliser notre ATM. Au revoir !");
                currentPin = 0;
                break;


            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
