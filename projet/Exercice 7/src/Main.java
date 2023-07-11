// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Dupont", "Jean", "1 rue de la Paix", "75008", "Paris");
        System.out.println(client + "\n");
        Article pc = new Article("ref123", "Ordinateur portable", 999.99);
        System.out.println(pc);

    }
}