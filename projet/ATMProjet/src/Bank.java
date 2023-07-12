import java.util.HashMap;
import java.util.Map;

public class Bank {

    // Utilisez le code PIN comme clé pour accéder aux clients
    //Lien utile de la doc: https://igm.univ-mlv.fr/~juge/javadoc-19/java.base/java/util/package-summary.html
    private Map<Integer, Client> clients;
    //Map est une interface générique de la bibliothèque Java qui représente une collection d'objets associés à des clés uniques.
    //Integer est le type des clés dans cette map, ce qui signifie que chaque client sera associé à un code PIN unique de type entier.
    //Client est le type des valeurs dans cette map, indiquant que chaque client sera un objet de la classe Client.


    //Initialisation de la Methode permettant d'ajouter un client
    public void ajouterClient(String nom, String prenom, int codePin, double solde) {

        // Crée un nouvel objet Client avec les informations fournies
        Client client = new Client(nom, prenom, codePin, solde);

        // Ajoute le client à la Map en utilisant le code PIN comme clé
        //put(codePin, client) : C'est une méthode de la classe Map qui permet d'ajouter une entrée à la Map.
        // Elle prend deux arguments : la clé codePin de type Integer et la valeur client de type Client.
        //la clé codePin permet d'identifier un client car elle est propre a chaque client
        clients.put(codePin, client);
    }

    // Récupère le client en utilisant le code PIN comme clé dans la Map
    public Client getClientByPin(int codePin) {
        return clients.get(codePin);
    }

    public Bank(
    ) {

        // Initialise une nouvelle instance de HashMap pour stocker les clients
        //comme on utilise Map comme interface nous somme obliger d'utilisé une instace HashMap<>();
        clients = new HashMap<>();

        // Ajoutez les clients de la banque ici
        ajouterClient("Dupont", "Jean", 1234, 1000);
        ajouterClient("Martin", "Sophie", 4321, 2000);
        ajouterClient("Sophie", "Benna", 6666, 1456);
        ajouterClient("Mounir", "Prof", 6900, 10000000);
    }

}
