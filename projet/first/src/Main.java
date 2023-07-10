import javax.xml.namespace.QName;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int ageDeTom = 20;
        int ageDeTemel = ageDeTom;
        ageDeTom = 44;
        System.out.println(ageDeTemel);
        System.out.println(ageDeTom);

        Date naissanceTom = new Date(103, 1, 11);
        Date autreDate = naissanceTom;
        //Changer la varible afin de tester la variable et savoir si c'est une variable types valeur ou référence
        naissanceTom.setTime(1);

        System.out.println(naissanceTom);
        System.out.println(autreDate);

        //Nombre entier
        byte someByte = 120;
        System.out.println(someByte);

        //Nombre décimaux
        float someFloat = -150.324f;
        System.out.println(someFloat);

        //Variable constant
        final double PI = 3.14159265358979323846264338327950288419716939937510582;
        System.out.println(PI);
        //Exercice Dalton
        Dalton temel = Dalton.JACK;
        System.out.println(temel.toString());
        System.out.println(temel);
        Dalton data = Dalton.valueOf("JACK");
        System.out.println(data.taille());
        //for (Dalton dalton : Dalton.values())
        //{}


        //Exercice 1
        System.out.println("Exercice 1\n");
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
        System.out.println("Nombre total d'adresses mail: " + totalAdresse);

        int gmailCount = 0;
        int sfrCount = 0;
        int orangeCount = 0;

        for (String adresse : adressesMail) {
            if (adresse.endsWith("@gmail.com")) {
                gmailCount++;
            } else if (adresse.endsWith("@sfr.com")) {
                sfrCount++;
            } else if (adresse.endsWith("@orange.com")) {
                orangeCount++;
            }
        }

        double pourcentageGmail = (double) gmailCount / totalAdresse * 100;
        double pourcentageSfr = (double) sfrCount / totalAdresse * 100;
        double pourcentageOrange = (double) orangeCount / totalAdresse * 100;
        System.out.println("Pourcentage de fournisseurs de sercie mail (sfr) : " + pourcentageSfr + "%");
        System.out.println("Pourcentage de fournisseurs de sercie mail (sfr) : " + pourcentageOrange + "%");
        System.out.println("Pourcentage de fournisseurs de service mail (gmail) : " + pourcentageGmail + "%");
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
