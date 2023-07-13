import atm.util.ATM;
import atm.util.Bank;
import database.Sqlite;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        // Crée une nouvelle instance de la classe Bank
        Bank bank = new Bank();

        // Crée une nouvelle instance de la classe ATM en lui passant l'objet bank en paramètre
        ATM atm = new ATM(bank);

        // Connecte à la base de données en utilisant la méthode connect de la classe Sqlite
        Sqlite.getInstance().connect();

        // Crée une instance de la classe Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        while (true) {  // Boucle principale
            //Menue principal
            System.out.println("1 - se connecter");
            System.out.println("2 - créer un compte");
            System.out.print("Veuillez enrter votre choix : ");
            int choix = scanner.nextInt();
            switch (choix){
                case 1:
                    login(atm, scanner);
                    break;
                case 2:
                    bank.ajouterClient();
                    break;
                default:
                    System.out.println("Option inconnue");
            }
        }

    }

    private static void login(ATM atm, Scanner scanner){
        // Affiche le message demandant au utilisateur d'entrer son code PIN
        System.out.print("Veuillez entrer votre code PIN : ");

        // Lit l'entier entré et le stocke dans la variable pin
        int pin = scanner.nextInt();

        // Vérifie si le code PIN est valide en appelant la méthode authenticate de l'objet atm
        if (atm.authenticate(pin)) {

            // Si la methode qui verifie le code pin retourne true alors il affiche le menue de l'objet atm
            atm.displayMenu();

            // Lit l'entier entré par l'utilisateur et le stocke dans la variable choice
            int choice = scanner.nextInt();

            // Exécute l'opération choisie par l'utilisateur en appelant la méthode performOperation de l'objet atm
            atm.performOperation(choice);
        } else {
            // si l'authent echoue
            System.out.println("Authentification échouée. Veuillez réessayer.");
        }


        System.out.print("Voulez-vous effectuer une autre opération ? oui ou non ");
        String option = scanner.next();

        // Vérifie si option est l'entrer est egal a oui
        if (!option.equalsIgnoreCase("oui")) {
            exit(0);
        }
    }
}
