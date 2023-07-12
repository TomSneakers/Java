import java.util.Date;

public class Commande {
    private int numero;
    private Date date;
    private Client client;
    private Article[] articles;
    private int[] quantites;

    public Commande(int numero, Date date, Client client, Article[] articles, int[] quantites) {
        this.numero = numero;
        this.date = date;
        this.client = client;
        this.articles = articles;
        this.quantites = quantites;
    }

    public int getNumero() {
        return numero;
    }

    public Date getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public Article[] getArticles() {
        return articles;
    }

    public int[] getQuantites() {
        return quantites;
    }

    public double calculerTotal() {
        double total = 0;
        for (int i = 0; i < articles.length; i++) {
            total += articles[i].getPrix() * quantites[i];
        }
        return total;
    }
}
