
import java.util.ArrayList;

public class Commande {
    // L'attribut de la classe Commande
    private ArrayList<Article> articles;
    private double total;

    // Le constructeur de la classe Commande
    public Commande() {
        // Initialisation de l'attribut articles avec une liste vide
        articles = new ArrayList<Article>();
        // Initialisation de l'attribut total à 0
        total = 0;
    }

    // La méthode pour ajouter un article à la commande
    public void ajouterArticle(Article article) {
        // Ajout de l'article à la liste des articles
        articles.add(article);
        // Mise à jour du total de la commande
        total += article.getPrix();
    }

    // La méthode pour calculer le total de la commande
    public double calculerTotal() {
        // Initialisation du total à 0
        double total = 0;
        // Pour chaque article dans la liste des articles
        for (Article article : articles) {
            // Ajout du prix de l'article au total
            total += article.getPrix();
        }
        // Retourne le total de la commande
        return total;
    }

    // La méthode pour afficher les articles de la commande
    public void afficherArticles() {
        // Pour chaque article dans la liste des articles
        for (Article article : articles) {
            // Affichage de l'article
            System.out.println(article.toString());
        }
    }

    // La méthode pour afficher le total de la commande
    public void afficherTotal() {
        // Affichage du total de la commande
        System.out.println("Total : " + total);
    }
}