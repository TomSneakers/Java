import javax.xml.namespace.QName;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Premier pas avec JAVA, le fameux hello and welcome
        System.out.println("Hello and welcome!");
        // Voir les type de variable (valeur)
        int ageDeTom = 20;
        int ageDeTemel = ageDeTom;
        ageDeTom = 44;
        System.out.println("\nage de Temel : " + ageDeTemel);
        System.out.println("\nNage de Tom : " + ageDeTom);


        //Voir les types de variables (reférences)
        Date naissanceTom = new Date(103, 1, 11);
        Date autreDate = naissanceTom;
        //Changer la varible afin de tester la variable et savoir si c'est une variable types valeur ou référence
        naissanceTom.setTime(1);
        System.out.println("\nDate de naissance de Tom : " + naissanceTom);
        System.out.println("\nAutre date de naissance : " + autreDate);


        //Nombre entier
        byte someByte = 120;
        System.out.println("Variable byte : " + someByte);

        //Nombre décimaux
        float someFloat = -150.324f;
        System.out.println("variable float" + someFloat + "\n");


        //Variable constant
        final double PI = 3.14159265358979323846264338327950288419716939937510582;
        System.out.println("Nombre PI : " + PI + "\n");


        //Exercice Dalton
        Dalton temel = Dalton.JACK;
        System.out.println(temel.toString());
        System.out.println(temel);
        Dalton data = Dalton.valueOf("JACK");
        System.out.println(data.taille() + "\n");
        //for (Dalton dalton : Dalton.values())
        //{}


        //Exercice 1 sans la fonction
        System.out.println("Exercice 1");
        String[] adressesMail = {
                "fzne@gmail.com",
                "zejnfzj@sfr.com",
                "tom@sfr.com",
                "evan@sfr.com",
                "zefn@gmail.com",
                "helodi@orange.com",
                "hello@sfr.com",
                "ttpv@gmail.com",
                "sttmz@sfr.com",
                "didier@gmail.com"
        };
        int totalAdresse = adressesMail.length;
        //Pour trouver le nombre d'adresse Total, on prend la longueur du tableau
        System.out.println("Nombre total d'adresses mail: " + totalAdresse);
        //On initialise des variables type valeur à 0 qu'on se servira pour le pourcentage
        int gmailCount = 0;
        int sfrCount = 0;
        int orangeCount = 0;
        //On utilise une boucle for pour parcourir toute les adresses mail une par une
        for (String adresse : adressesMail) {
            //On utise la fonction endsWith pour recuperer la fin des mail
            if (adresse.endsWith("@gmail.com")) {
                //on utilise "++" pour ajouté 1 a la variable
                gmailCount++;
            } else if (adresse.endsWith("@sfr.com")) {
                sfrCount++;
            } else if (adresse.endsWith("@orange.com")) {
                orangeCount++;
            }
        }
        // on creer une varibale pour le porcentage et mettons le calcul du pourcentage
        double pourcentageGmail = (double) gmailCount / totalAdresse * 100;
        double pourcentageSfr = (double) sfrCount / totalAdresse * 100;
        double pourcentageOrange = (double) orangeCount / totalAdresse * 100;
        //Affichage du pourcentage
        System.out.println("Pourcentage de fournisseurs de sercie mail (sfr) : " + pourcentageSfr + "%");
        System.out.println("Pourcentage de fournisseurs de sercie mail (sfr) : " + pourcentageOrange + "%");
        System.out.println("Pourcentage de fournisseurs de service mail (gmail) : " + pourcentageGmail + "%");

        //Exercice 1 avec la fonction ce trouvre dans le fichier /ExerciceTest
        
    }
    }
            //Pour creer un dalton:
            enum Dalton {
                JOE(1.40, 52),
                WILLIAM(1.68, 72),
                JACK(1.93, 83),
                AVERELL(2.13, 89);
                private final double taille;
                private final double poids;

                private Dalton(double taille, double poids) {
                    this.taille = taille;
                    this.poids = poids;
                }

                public double taille() {
                    return taille;
                }

                public double poids() {
                    return poids;
                }


                double imc() {
                    return poids / (taille + taille);
                }
            }
