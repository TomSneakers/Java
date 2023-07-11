Note pour JAVA:

Quelque def et explication:
-language système simple orienté objet et interpréter .
-optimisation du temps des cycle de dev (compilation et exectution)
-Les application produites sont potables: Compatible sur plusieurs plate-forme (cross-plateform) - Gestion de mémoir et erreur par rapport au C++ sont simplifiées
-Possibilité de créer des application multi threadés - Les apps sont robustes et sécurisé grâce à des vérif du bytecode avant éxecution -
-    public static void main(String[] args) est le point d'entrer du programme/ Methode main
    Plateform Java:
    JDK: java dev kit
        -API JDK
        -Outil: javac, javadoc
    JRE: (java runtime env) environnement d'exécution
        -API JAVA
        -Outils: java, javaw
    JVM: (java virtuel machine) permet l'exécutuion du programme passe en paramètre de la commande java
        -Compiltateur

    La machine virtuel Java:
    Elle est mise a disposition pour de multiple OS
    Ses roles sont multiples Os
        -elle change des classes( et leur bytecode ), a l'instanciation d'une classe c'est elle qui change le bytecode à interpréter
        -elle gère la mémoire: les pointeurs et les références
        -elle gère la libération de la mémoire:  garbage collector
        -elle gère aussi la sécurité
        -interfacage avec du code natif

    L'api java
    Ensemble de logiciel pré-concu pour fournir un grand nombre de focntionnalités


    L'API Java 17:
        -21 modules
        -220 packages (l'equibalent des bibliotèque de classes en C# ou de librairies en langage C)
        -Plus de 4000 Classes et interfaces mise à disposition

    Deux implémentations pour une platerform
        -orcale jdk
        -openJdk

    Consigne de post install:
    Voici les consignes afin d'installé java avec homebrew sur mac
    installation de la version 17 d'openjdk
    -brew install openjdk@17
    - echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
    - export CPPFLAGS="-I/opt/homebrew/opt/openjdk@17/include"

Première ligne de code en java: 
System.out.printf("Hello and welcome!"); --> pour faire apparaitre hello word en console

Consigne pour installé mySql:
    -brew install mysql
    -mysql_secure_installation
    -mysql -u root
    -brew services start mysql

Il faut + etapes pour exe un programme java:
    -compilation: code source (en java) -> bytecode (langage intermédiaire). Le bytecode n'est pas en binaire, cela veut dire qu'il ne peux pas etre interpreter par la machine.
    C'est la jvm qui charge le bytecode et le compile à la volée pour executer du code qui sera compréhensible par la machine hote

Utilisé le comilateur:
javac nom_de_votre_projet.java --> obtenue du byteCode: nom_de_votre_projet.class --> lancer par la jvm --> ensuite java nom_de_votre_projet.class

Instance de class: l'objet créé à partir d'une classe
Les catégorie de variables:

-Les varibale d'instance: nexiste que si une intance de classe est disponible. chaque instance possède sa propre version de la variable

-les variables de classes:elles sont aussi declarer à l'interieur d'une classe avec le mot cle static. La variable de classe est disponible directement depuis la classe et existe en un unique exemplaire. On peut avoir 50 instance d'une meme classe mais la valeur d'une variable de classe est unique.

-Les variable locales sont déclarer a l'interieur d'une methode 

Pour écrire du code propre, avec peu d'erreur, suivre la convention d'écriture JAVA qui est un document officiel montrant comment écrire du JAVA propement: Quelque exemple:
        -Nomenclature des variable:
            - Le nom du variable commence par une lettre
            - Lettres, chiffre et underscore
            - Nombre illimité de caractère
            - sensible à la casse avec les majuscule 
            - keywords
            - camel case: le nom commence par une minuscule et chaque nouveau mot par une majuscule

Les types de variable:
    On distingue deux types de variable
        -les types de valeur: celle qui stockent des valeurs
        - les types réérences: celle qui ne stockent pas réelement de valeur
    Les types valeurs designent les types primitifs, on en compte quatre en java: entiers, decimaux, les chars et les booleen
    Les types de références designent un types plus complexe: un ensemble cohérent de variables 

La déclarition
En java:
[modificateur] type maVariable;
On peut declarer plusieurs variables du meme types sur la meme ligne:
type var1,var2,var3, ...;
Exemple:
int ageDeTom;
Date armistice, noel;

Pour initialiser une varible, on utilise l'opérateur '='
int nombreDeTacos = 1;

exemple:
int ageDeTom = 20;
int ageDeTemel = ageDeTom;
ageDeTom = 44;
System.out.println(ageDeTemel);
System.out.println(ageDeTom);

Résultat: 
20
44

Ce code a pour but de prouver que la variable ageDeTom et ageDeTemel sont bien de varaible types valeur et non référence


 Date naissanceTom = new Date( 103, 1, 11 );
 Date autreDate = naissanceTom;
 //Changer la varible afin de tester la variable et savoir si c'est une variable types valeur ou référence
 naissanceTom.setTime(1);
 System.out.println(naissanceTom);
 System.out.println(autreDate);

 Ce code a pour but de prouver que la variable autreDate et naissanceTom sont bien de varaible types reférence et non valeur

Nombre entier:
...

Nombre décimaux:
Exemple:
    float someFloat = -150.324;
    System.out.println(someFloat);
    Resultat:
    java: incompatible types: possible lossy conversion from double to float

    float someFloat = -150.324f;
    System.out.println(someFloat);
    Résultat:
    -150.324

Les constantes:
Variable qui ne doit pas être modifier au cours de l'execution du programme, il convient alors de définir des constantes.

Pour définir une constante on utilise le mot clé: final
Exemple: 
final double PI = 3,14159265358979323846264338327950288419716939937510582;

L'initialisation de la constante est obligaoire lors de sa déclaration.
Souvent les constante sont définies comme membre statique
Par convention on les écrit en MAJUSCULES

Les enumération
Elles permettent de definir un ensemble de constantes
Exemple:
public enum Month{
    JANVIER,
    FEVRIER,
    MARS,
    AVRIL,
    MAI,
    JUIN,
    JUILLET,
    AOUT,
    SEPTEMBRE,
    OCTOBRE,
    NOVEMBRE,
    DECEMBRE
}
 L'équivalent avec une classe:

 public class Month{
    public static final int JANVIER = 0, FEVRIER = 1, ...
 }
La déclaration d'une enum peut etre considere comme l'utilisation d'une "classe cacher"
Cette classe herite de java.lang.Enum

Les tableaux
Exemple de syntaxe:
//declaration du tableau
int[] unTableau;
//Initialisation avec 122 de taille ( Possible de mettre 122 objet dans ce tableau )
unTableau = new int[122];
//Autre facon d'initialiser
int[] autreSyntaxe = {2,3,14,124,2};

On peut acceder au element d'un tableau de cette maniere:
autreSyntxe[4]
Si vous tenter d'acceder a un index inexistant vous allez obtenir une exception de type:
ArrayIndexOutOfBoundException

Il est possible de travailler avec des tableaux a plusieurs dimension 
La syntaxe pour recuperer des element dans un tableau a 2 dimension est la suivante:
int elemTableau2D = tableau2D[0][1];

Autre methode de creation:
int [][] matrice;
matrice = new int[2][];
matrice[0] = new int[4];
matrice[1] = new int[2];

Encore une autre syntaxe:
int [][] encoreUneAutreSyntaxe = {{1,2,3}{1,3,6}}
Tableau a deux lignes et trois colonnes

Les chaines de caractère: 
En general on a tendance a considerer les String comme des types primitifs, mais ce n'est pas le cas. En realite, lorsqu'on cree une string on cree une instance de la classe String qui contient un tableau de char.
String chaine = new String("une chaine de caracteres");

Apres sa creation une chaine de caracteres ne peut plus etre modifiee. On dit qu'elle est immutable.
\* cette instruction ne compile pas *\
chaine = chaine + " et une autre chaine";

La classe String nous met a disposition de nombreux outils pour manupuler les chaines de caracteres.

String chaine = "une chaine de caracteres";
chaine.length(); // retourne la taille de la chaine
chaine.charAt(0); // retourne le caractere a l'index 0
chaine.substring(0, 4); // retourne la sous chaine de caracteres de l'index 0 a 4
chaine.indexOf("chaine"); // retourne l'index de la premiere occurence de "chaine"
chaine.replace("chaine", "string"); // remplace la premiere occurence de "chaine" par "string"
chaine.toUpperCase(); // retourne la chaine en majuscule
chaine.toLowerCase(); // retourne la chaine en minuscule
chaine.trim(); // supprime les espaces en debut et fin de chaine
chaine.split(" "); // retourne un tableau de String en decoupant la chaine a chaque espace
chaine.equals("une chaine de caracteres"); // retourne true si les deux chaines sont identiques
chaine.equalsIgnoreCase("UNE CHAINE DE CARACTERES"); // retourne true si les deux chaines sont identiques en ignorant la casse
chaine.startsWith("une"); // retourne true si la chaine commence par "une"
chaine.endsWith("res"); // retourne true si la chaine se termine par "res"

Comparer les chaines de caracteres:

En java il est impossible de comparer deux chaines de caracteres avec l'operateur ==
String chaine1 = "une chaine de caracteres";
String chaine2 = "une chaine de caracteres";
chaine1 == chaine2; // retourne false

Pour comparer deux chaines de caracteres il faut utiliser la methode equals
String chaine1 = "une chaine de caracteres";
String chaine2 = "une chaine de caracteres";
chaine1.equals(chaine2); // retourne true

Cette fonction compare les chaines de caracteres caractere par caractere.

La methode format permet de formater une chaine de caracteres en utilisant des marqueurs de position.
boolen estVrai = true;
int entier = 10;
double decimal = 10.5;
String chaine = "une chaine de caracteres";
System.out.println("un booleen : %b, un entier : %d, un decimal : %f, une chaine : %s", estVrai, entier, decimal, chaine);

ou encore

boolean b=true;
String s="chaine";
int i=56;
double d=5.5;
System.out.println(String.format("boolean : %b %n" +
                 "chaine de caractères : %s %n" +
                 "entier : %d %n" +
                 "entier en hexadécimal : %x %n" +
                 "entier en octal : %o %n" +
                 "décimal : %f %n" +
                 "décimal précis au dixième : %.1f %n" +
                 "décimal au format scientifique : %e %n",
                 b,s,i,i,i,d,d,d));
