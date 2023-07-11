import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Création d'une instance de la classe Random pour générer des nombres aléatoires
        //lien utile: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/random/package-summary.html
        Random random = new Random();
        // Création d'une instance de la classe Scanner pour lire les entrées de l'utilisateur
        // lien utile: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html
        // scanner est une objet (une instance) // Le mot new sert a creer une instance
        Scanner scanner = new Scanner(System.in);


        // Génération du nombre aléatoire à deviner entre 1 et 100
        int justePrix = random.nextInt(201);
        int tentative = 0;
        // Temps au début du jeu, prend la l'heure actuelle en milliseconde
        long debut = System.currentTimeMillis();
        // Affichage du message de bienvenue
        System.out.println("Bienvenue dans le jeu du Juste Prix !");
        System.out.println("Devinez le nombre entre 1 et 200.");

        // Boucle principale du jeu
        while (true) {
            // Demande à l'utilisateur d'entrer sa proposition
            System.out.print("Entrez votre proposition : ");
            //Scanner permet les entrées dans la console
            int proposition = scanner.nextInt();
            tentative++;


            // Vérification de la proposition de l'utilisateur
            if (proposition == justePrix) {
                // Si la proposition est correcte, enregistrement du temps de fin et calcul du temps écoulé
                long fin = System.currentTimeMillis();
                // On divice par mile pour avoir le temps en second
                double tempsEnSecondes = (fin - debut) / 1000.0;

                // Affichage du message de réussite avec le nombre de tentatives et le temps écoulé
                System.out.println("Bravo ! Vous avez trouvé le juste prix en " + tentative + " tentatives.");
                System.out.println("Temps écoulé : " + tempsEnSecondes + " secondes.");
                    break;
            } else if (proposition < justePrix) {
                // Si la proposition est inférieure au juste prix, affichage du message "C'est plus !"
                System.out.println("C'est plus !");
            } else {
                // Si la proposition est supérieure au juste prix, affichage du message "C'est moins !"
                System.out.println("C'est moins !");
            }
        }
    }
}
