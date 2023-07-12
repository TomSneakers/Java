import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de la classe Bank
        Bank bank = new Bank();
        // Création d'une instance de la classe ATM avec la banque
        ATM atm = new ATM(bank);
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        //Boucle de la méthode main qui permet de ce dépllacer et ne pas recommencer les opération
        while (true) {
            //Identification
            System.out.print("Veuillez entrer votr code PIN : ");

            // Lecture du code PIN saisi par l'utilisateur
            int pin = scanner.nextInt();

            if (atm.authenticate(pin)) {
                // Affiche le menue grace à la ckasse ATM
                atm.displayMenu();


                // Lecture du choix de l'utilisateur
                int choice = scanner.nextInt();

                // Appel de la méthode performOperation de la classe ATM pour effectuer l'opération choisie
                atm.performOperation(choice);
            } else {
                System.out.println("Authentification échouée. Veuillez réessayer.");
            }
            System.out.print("Voulez-vous effectuer une autre opération ? yes or non ");
            // Lecture de l'option de l'utilisateur pour continuer ou quitter
            String option = scanner.next();
            if (!option.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
