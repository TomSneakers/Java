package atm.util;

import database.Sqlite;

import java.util.Scanner;

public class Bank {


    public void ajouterClient() {
        var scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre Prenom : ");
        String prenom = scanner.next();
        System.out.println("Veuillez entrer votre nom : ");
        String nom = scanner.next();
        System.out.println("pin :");
        int pin = scanner.nextInt();

        var sql = "INSERT INTO client (nom, prenom, pcode, solde) VALUES (?,?,?,0)";
        Sqlite.getInstance().ExecuteNonQuery(sql, nom, prenom, pin);
    }

    public Client getClientByPin(int codePin) {
        var sql = "SELECT nom, prenom, pcode, solde from client where pcode = ?";
        var result = Sqlite.getInstance().ExecuteQueryRow(sql, codePin);
        return new Client((String) result[0], (String)result[1], (int) result[2], (double) result[3]);
    }


    //private Map<Integer, Client> clients;
    /*public void ajouterClient(String nom, String prenom, int codePin, double solde) {
        Client client = new Client(nom, prenom, codePin, solde);
        clients.put(codePin, client);

        try {
            Sqlite.getInstance().ExecuteNonQuery("INSERT INTO client (nom, prenom, pcode, solde) VALUES (?, ?, ?, ?)",
                    nom, prenom, codePin, solde);
            System.out.println("Compte créé avec succès.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erreur lors de la création du compte.");
        }
    }*/

    /*public Bank() {
        clients = new HashMap<>();
        ajouterClient("Dupont", "Jean", 9999, 1000);
        ajouterClient("Martin", "Sophie", 4321, 2000);
        ajouterClient("Sophie", "Benna", 6666, 1456);
        ajouterClient("Mounir", "Prof", 6900, 10000000);
    }*/
}
