import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Demande à l'utilisateur un nombre entier
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entir: ");
        int nombre = scanner.nextInt();
        scanner.close();

        //Conversion
        String binaire = Integer.toBinaryString(nombre);
        String octal = Integer.toOctalString(nombre);
        String hexadecimal = Integer.toHexString(nombre);

        System.out.println("Valeur en binaire : " + binaire + "\n");
        System.out.println("Valeur en octal : " + octal + "\n" );
        System.out.println("Valeur en hexadécimal : " + hexadecimal);
        }
    }
