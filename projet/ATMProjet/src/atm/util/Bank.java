package atm.util;

import database.Sqlite;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Client> clients;

    public void ajouterClient(String nom, String prenom, int codePin, double solde) {
        Client client = new Client(nom, prenom, codePin, solde);
        clients.put(codePin, client);
    }

    public Client getClientByPin(int codePin) {
        var sql = "SELECT nom, prenom, pcode, solde from client where pcode = ?";
        var result = Sqlite.getInstance().ExecuteQueryRow(sql, codePin);
        return new Client((String) result[0], (String)result[1], (int) result[2], (double) result[3]);
    }

    /*public Bank() {
        clients = new HashMap<>();
        ajouterClient("Dupont", "Jean", 9999, 1000);
        ajouterClient("Martin", "Sophie", 4321, 2000);
        ajouterClient("Sophie", "Benna", 6666, 1456);
        ajouterClient("Mounir", "Prof", 6900, 10000000);
    }*/
}
