import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int nombreEssaie = 0;

        while(true){
            int nombre1 = random.nextInt(1001);
            int nombre2 = random.nextInt(1001);
            int nombre3 = random.nextInt(1001);

            nombreEssaie++;
            // Visuel pour le test
            System.out.println(nombre1);
            System.out.println(nombre2);
            System.out.println(nombre3);
            System.out.println("Nombre d'essaie : " + nombreEssaie);
        }
    }
}
