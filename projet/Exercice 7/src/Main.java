// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Dupont", "Jean", "1 rue de la Paix", "75008", "Paris");
        System.out.println(client + "\n");
        Article pc = new Article("ref123", "Ordinateur portable", 999.99);
        Article manette = new Article("ref111", "manette", 99.90);
        System.out.println(pc);

        // Créer un objet de la classe Commande
        Commande commande = new Commande();

        // Ajouter les articles à la commande
        commande.ajouterArticle(pc);
        commande.ajouterArticle(manette);

        // Afficher le total de la commande
        System.out.println("Total de la commande : " + commande.calculerTotal());
    }
}