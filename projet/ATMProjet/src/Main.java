import atm.util.ATM;
import atm.util.Bank;
import database.Sqlite;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dbPath = "./atm.db";
        Bank bank = new Bank();
        ATM atm = new ATM(bank);
        Sqlite.getInstance().connect();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Veuillez entrer votre code PIN : ");
            int pin = scanner.nextInt();

            if (atm.authenticate(pin)) {
                atm.displayMenu();

                int choice = scanner.nextInt();
                atm.performOperation(choice);
            } else {
                System.out.println("Authentification échouée. Veuillez réessayer.");
            }

            System.out.print("Voulez-vous effectuer une autre opération ? yes or non ");
            String option = scanner.next();

            if (!option.equalsIgnoreCase("yes")) {
                break;
            }
        }

        Sqlite.getInstance().close();
    }
}