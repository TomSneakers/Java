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
        System.out.println("Veuillez entrer votre solde :");
        int solde = scanner.nextInt();

        var sql = "INSERT INTO client (nom, prenom, pcode, solde) VALUES (?,?,?,?)";
        Sqlite.getInstance().ExecuteNonQuery(sql, nom, prenom, pin, solde);
    }

    public Client getClientByPin(int codePin) {
        var sql = "SELECT nom, prenom, pcode, solde from client where pcode = ?";
        var result = Sqlite.getInstance().ExecuteQueryRow(sql, codePin);
        return new Client((String) result[0], (String)result[1], (int) result[2], (double) result[3]);
    }

}
