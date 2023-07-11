import java.util.Random;

public class Exercice3 {
    public static void Exercice3(String[] args){
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
            System.out.println(nombreEssaie);
        }
    }

    }

