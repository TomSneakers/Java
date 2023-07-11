import java.util.HashMap;
import java.util.Map;

public class ExerciceTest {
    public static void calculerPourcentageFournisseursMail(String[] adressesMail) {
        int totalAdresse = adressesMail.length;
        System.out.println("Nombre total d'adresses mail : " + totalAdresse);

        // Map pour stocker les compteurs par fournisseur
        Map<String, Integer> fournisseurCounts = new HashMap<>();

        // Parcours des adresses mail pour compter les fournisseurs
        for (String adresse : adressesMail) {
            // Extraction du fournisseur en utilisant les index de '@' et '.'
            String fournisseur = adresse.substring(adresse.lastIndexOf('@') + 1, adresse.lastIndexOf('.'));

            // Mise à jour du compteur pour le fournisseur actuel
            fournisseurCounts.put(fournisseur, fournisseurCounts.getOrDefault(fournisseur, 0) + 1);
        }

        // Calcul et affichage des pourcentages par fournisseur
        for (Map.Entry<String, Integer> entry : fournisseurCounts.entrySet()) {
            String fournisseur = entry.getKey();
            int count = entry.getValue();
            double pourcentageFournisseur = (double) count / totalAdresse * 100;
            System.out.println("Pourcentage de fournisseurs de service mail (" + fournisseur + ") : " + pourcentageFournisseur + "%");
        }
    }

    public static void main(String[] args) {
        // Tableau d'adresses mail
        String[] adressesMail = {
                "fzne@gmail.com",
                "zejnfzj@wifi.com",
                "tom@sfr.com",
                "evan@sfr.com",
                "zefn@gmail.com",
                "helodi@orange.com",
                "hello@sfr.com",
                "ttpv@gmail.com",
                "sttmz@sfr.com",
                "didier@hey.com",
        };

        // Appel de la fonction pour calculer les pourcentages des fournisseurs de service mail
        calculerPourcentageFournisseursMail(adressesMail);
    }
}
