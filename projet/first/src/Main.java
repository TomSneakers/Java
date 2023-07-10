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

        Date naissanceTom = new Date( 103, 1, 11 );
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
        final double PI= 3.14159265358979323846264338327950288419716939937510582;
        System.out.println(PI);
        //Exercice Dalton
        Dalton temel = Dalton.JACK;
        System.out.println(temel.toString());
        System.out.println(temel);
        Dalton data = Dalton.valueOf("Jack");
        System.out.println(data.taille());
        for (Dalton dalton: Dalton.values())
    }
    }
    //Pour creer un dalton:
 enum Dalton{
        JOE (1.40, 52),
        WILLIAM (1.68, 72),
        JACK (1.93, 83),
        AVERELL (2.13, 89);
        private final double taille;
        private final double poids;
        private Dalton (double taille, double poids)
        {
            this.taille = taille;
            this.poids = poids;
        }
        public double taille() { return taille; } public double poids() { return poids; }


        double imc() {
            return poids/(taille+taille);
        }
        }
