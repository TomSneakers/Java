import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int nombreEssaie = 0;

        while (true) {
            // Attribution au variable nombre1, nombre2, nombre3, des valeur aléatoire qui ne dépasse pas 1000
            int nombre1 = random.nextInt(1001);
            int nombre2 = random.nextInt(1001);
            int nombre3 = random.nextInt(1001);

            nombreEssaie++;
            // Visuel pour le test
            System.out.println(nombre1);
            System.out.println(nombre2);
            System.out.println(nombre3);
            System.out.println("Nombre d'essaie : " + nombreEssaie + "\n");
            //Test de division et reste avec d'autre variable:
            //int testNombre1 = 202;
            //int testNombre2 = 203;
            //int testNombre3 = 402;
            // test avec une variable boolean de résultat pair sur un nombre pair
            //boolean resultatPair = testNombre1 % 2 == 0;
            //System.out.println("   TEST  :  " + resultatPair);
            // test avec une variable boolean de résultat impair sur un nombre impair
            //boolean resultatImpair = testNombre2 % 2 == 1;
            //System.out.println("   TEST  :  " + resultatImpair);
            // test avec une variable boolean de résultat pair sur un nombre impair
            //boolean resultatPair1 = testNombre2 % 2 == 0;
            //System.out.println("   TEST  :  " + resultatPair1);

            //Nombre 1 et 2  sont divisible par 2 et reste 0, nombre 3 divisible par 2 et il y a un reste
            if (nombre1 % 2 == 0 && nombre2 % 2 == 0 && nombre3 % 2 == 1) {
                System.out.println("Combinaison trouvée après " + nombreEssaie + " essais.");
                System.out.println("Nombre 1 : " + nombre1);
                System.out.println("Nombre 2 : " + nombre2);
                System.out.println("Nombre 3 : " + nombre3);
                break;
            }
        }
    }
}
