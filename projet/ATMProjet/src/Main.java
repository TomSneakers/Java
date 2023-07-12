import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Dupont", "Jean", 4545, 500);
        System.out.println(client);


        System.out.print("Veuillez entrer votre code pin:");
        Scanner scPin = new Scanner(System.in);
        int pin = scPin.nextInt();

        while (true) {
            if (client.getPin() == pin) {
                System.out.println("Le code entré est correct.");
                System.out.println("Veuillez choisir : ");
                System.out.println("1. Consulter le solde");
                System.out.println("2. Déposer de l'argent");
                System.out.println("3. Retirer de l'argent");
                System.out.println("4. Sortir du distributeur");
                System.out.print("Faite votre choix : ");
                break;

            } else {
                System.out.println("Le code n'est pas le bon.");
                System.out.print("Veuillez resaisir votre code pin:");
                pin = scPin.nextInt();
            }
        }
    }
}
