import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Les clients
        Client dupont = new Client("Dupont", "Jean", "1 rue de la Paix", "75008", "Paris");
        Client jack = new Client("jack", "michel", "69 la trique mon pote", "69001", "Lyon");
        Client sophie = new Client("sophine", "radin", "3 rue de la Défense", "75008", "Paris");
        //System.out.println(dupont + "\n");


        //Article :
        Article pc_HP = new Article("ref101", "Ordinateur portable HP", 1049);
        Article pc_lenovo = new Article("ref123", "Ordinateur portable Lenovo", 999.99);
        Article manette = new Article("ref111", "manette", 99.90);

        Commande commande = new Commande(1, new Date(), dupont, new Article[]{pc_lenovo, manette, pc_HP}, new int[]{1, 2, 1});

        System.out.println("Numéro de commande : " + commande.getNumero());
        System.out.println("Date de commande : " + commande.getDate());
        System.out.println("Client : " + commande.getClient());
        System.out.println("Articles commandés : ");

        for (int i = 0; i < commande.getArticles().length; i++) {
            Article article = commande.getArticles()[i];
            int quantite = commande.getQuantites()[i];
            System.out.println("Article : " + article.getDesignation() + ", Quantité : " + quantite);
        }
        System.out.println("Total de la commande : " + commande.calculerTotal());
    }
}
