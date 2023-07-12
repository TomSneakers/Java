# JAVA

JAVA :

- Langage systeme simple, orienté objet et interprété,
- otpimisation du temps des cycles de dev. (compilation et execution)
- Les applications produites sont portables : cross platform.
- Par rapport au C++ gestion de la memoire et des erreurs sont simplifiées.
- Il est possible de creer des applications multi threadés
- Les applications sont trés robustes et sécurisées grâce à des verifications du bytecode avant exécution.

## La plateforme JAVA

![Alt text](image.png)

- JDK : Java Dev Kit
- API
- javac : le compilateur java
- JRE (Java runtime env) : l'environnement d'execution installe sur la machine cliente. Il propose notamment l'outil Java qui permet d'executer les programmaes java
- JVM (Java virtual machine): permet l'execution du programme passe en param. de la commande `java`

## La machine virtuelle Java

Elle est mise a disposition pour de multiples OS.

##### Ses roles sont multiples:

- elle charge des classes (et leur bytecode), a l'instanciation d'une classe c'est elle qui charge le bytecode à interpréter
- elle gère la mémoire:
  les pointeurs et les références. Elle gère aussi la libération de la mémoire : `Garbage Collector`
- Elle gere aussi la securité
- interfaçage avec du code natif

## L'API JAVA

Ensemble de logiciels pre conçu pour fournir un grand nombre de fonctionnalités.
L'API Java 17 :

- 21 modules
- 220 packages (l'equivalent des bibliotheques de classes en C# ou des librairies en langage C)
- Plus de 4000 classes et interfaces mises a disposition

### Deux implementations pour une plateforme

- Oracle JDK
- OpenJDK

Il est recommandé d'ajouter `JAVA_HOME` en tant que variable d'environnement:

```
C:\Users\Dev\Desktop\Java\jdk-17.0.2
```

Ensuite vous modifiez la variable d'environnement PATH avec l'entrée:

```
...;%JAVA_HOME%\bin
```

### L'IDE

Eclipse ou IntelliJ

### MySQL

Vous devez installer mySQL :

- `on premise`
- avec wamp (mamp, xamp, ...)
- avec Docker
- dans le cloud
- ...

![Alt text](image-1.png)

### Votre premier programmae en JAVA

Un programme java est une collection de fichiers java destinés à fonctionner ensemble.

![Alt text](image-2.png)

Il faut plusieurs étapes pour l'exécution d'un programme JAVA :

- compilation: code source (en java) -> bytecode (langage intermédiaire). Le bytecode n'est pas du binaire
- C'est la JVM qui charge le bytecode et le compile à la volée (JIT: just in time) pour exécuter du code qui sera compréhensible par la machine hote

Popur utliser le compilateur:

```sh
javac nom_de_votre_fichier_source
```

Pour executer le bytecode :

```
java nom_de_votre_fichier_bytecode
```

## Structure des programmes JAVA

En java, tout est objet:

```java
public class Nom
{
    // votre super code java
    public static void main(String[] args)
    {
        // votre super code java
    }
    //votre super code java
}
```

### Les variables en java

instance de classe : l'objet créé à partir d'une classe

Les categories de variables:

- **les variables d'instance**: n'existe que si une instance de classe est disponible. Chaque instance possède sa propre version de la variable
- **Les variables de classe**: elles sont aussi declarees a l'interieur d'une classe mais avec le mot clé `static` . La variable de classe est disponible directement depuis la classe et existe en un exemplaire unique. On peut avoir 50 instances d'une meme classe, mais la valeur d'une variable de classe est unique.
- **les variables locales** sont déclarées a l'interieur d'une methode

##### La nomenclature des variables:

- le nom d'une variable commence par une lettre
- lettres, chiffres et underscore
- nombre illimité de caractères
- case Sensitive / sensible a la casse
- keywords
- camel case: le nom commence par une minuscule et chaque nouveau mot commence par une maj.

#####Les types de variables :

On distingue deux types de variables:

- Les types valeurs : celles qui stockent des valeurs
- les types references : celles qui ne stockent pas reelleement de valeur

![Alt text](image-3.png)

Les types valeurs designent les types primitifs, on en compte 4 en java : entiers, decimaux, les chars et les bool.

Les types references designent un type plus complexe : un ensemble coherent de variables.
Ils contiennent une reference vers ces variables.

![Alt text](image-4.png)

##### La declaration

En java :

```java
[modificateurs] type maVariable;
```

On peut declarer plusieurs variables du meme type sur la meme ligne:

```
type var1, var2, var3, var4;
```

Exemple:

```java
int ageDeTom;
Date armistice, noel;
```

Pour initialiser une variable:

```java
int frenchWorldCupYear = 1998;
```

Les types d'entiers

![Alt text](image-5.png)

Les types decimaux

![Alt text](image-6.png)

Les constantes

Il arrive que des variables ne doivent pas etre modifiees au cours de l'execution du programme: il convient alors de definir des constantes

Pour definir une constante on utilise le mot cle `final`:

```java
    final double PI = 3,1415926535897932384626433832795028841971693993751058;
```

L'initialisation de la constante est obligatoire lors de sa declaration.
Souvent les constantes sont definies comme membres statiques.
Par convention on les ecrit en majuscules.

Les enumerations :
Elles permettent de definir un ensemble de constantes :

```java
    public enum Month
    {
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
```

L'equivalent avec une classe :

```java
public class Month
{
    public static final int JANVIER = 0;
}
```

La declaration d'ume enum peut etre considere commue l'utilisation d'une "classe cachee". Cette classe herite de `java.lang.Enum`

Pour creer un dalton :

```java
Dalton temel = Dalton.AVERELL;
```

### Les tableaux

```java

int[] unTableau;

// on doit preciser la taille du tableau
// entre crochets
unTableau = new int[122];

// avec cette syntaxe pas besoin de preciser
// la taille, elle est automatiquement determinee
// lorsque
int[] autreSyntaxe = {3, 4, 5, 6, 8};
```

On peut acceder aux elements d'un tableau de cette maniere :

```java
autreSyntaxe[4];
```

Si vous tentez d'acceder a un index inexistant vous allez obtenir une exception de type : `ArrayIndexOutOfBoundException`

Il est possible de travailler avec des tableaux a plusieurs dimensions :
![Alt text](image-7.png)

La syntaxe pour recuperer des elements dans un tableau a 2D est la suivante:

```java
int elemTableau2D = tableau2D[0][1];
```

autre methodes de creation :

```java
int[][] matrice;
matrice = new int[2][];
matrice[0] = new int[4];
matrice[1] = new int[4];
```

```java
// permet de definir un tableau 2D avec deux lignes et
// trois colonnes
int [][] encoreUneAutreSyntaxe = {{1, 3, 4}, {23, 21, 22}};
```

Creez un tableaux contenant 10 `String`, et remplir ce tableau avec des adresses mail, exemple

```
"jpp@sfr.fr";
"tom@gmail.com";
"fred@sfr.fr";
"victor@sfr.fr";
"chris@sfr.fr";
"robert@orange.fr";
"paul@sfr.fr";
"lise@gmail.com";
"thierry@isitech.fr";
"marie@isitech.fr";
```

Calculez le pourcentage de fournisseurs de services mail.
(pour une adresse @gmail.com le fournisseur est gmail).

Consultez la javadoc :

- String : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

Pour aller plus loin :

- placer ce code dans une fonction
- elle doit prendre en parametre un tableau de String qui contient des adresses mail
- la fonction de doit pas avoir connaissance du nom des fournisseurs
- elle doit toujours afficher le pourcentage de fournisseurs de services mail, quel que soit le nombre de fournisseurs

### Les chaines de caracteres

Les chaines de caracteres sont des objets en java, elles sont donc soumises aux regles de la programmation orientee objet.

```java
String chaine = "une chaine de caracteres";
```

En memoire voici ce que ca donne :
![Alt text](image-8.png)

En general on a tendance a considerer les String comme des types primitifs, mais ce n'est pas le cas.
En realite, lorsqu'on cree une string on cree une instance de la classe `String` qui contient un tableau de char.

```java
String chaine = new String("une chaine de caracteres");
```

Apres sa creation une chaine de caracteres ne peut plus etre modifiee. On dit qu'elle est `immutable`.

```java
\* cette instruction ne compile pas *\
chaine = chaine + " et une autre chaine";
```

La classe String nous met a disposition de nombreux outils pour manupuler les chaines de caracteres.

```java
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
```

#### Comparer les chaines de caracteres

En java il est impossible de comparer deux chaines de caracteres avec l'operateur `==`

```java
String chaine1 = "une chaine de caracteres";
String chaine2 = "une chaine de caracteres";
chaine1 == chaine2; // retourne false
```

Pour comparer deux chaines de caracteres il faut utiliser la methode `equals`

```java
String chaine1 = "une chaine de caracteres";
String chaine2 = "une chaine de caracteres";
chaine1.equals(chaine2); // retourne true
```

Cette fonction compare les chaines de caracteres caractere par caractere.

La methode format permet de formater une chaine de caracteres en utilisant des marqueurs de position.

```java
boolen estVrai = true;
int entier = 10;
double decimal = 10.5;
String chaine = "une chaine de caracteres";
System.out.println("un booleen : %b, un entier : %d, un decimal : %f, une chaine : %s", estVrai, entier, decimal, chaine);
```

ou encore

```java
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
```

Exercice 2 :

Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux nombres pairs suivis par un nombre impair. Si ce n’est pas le cas, recommencer jusqu’à ce que vous ayez la combinaison pair, pair, impair. Afficher ensuite le nombre d’essais nécessaires pour obtenir cette combinaison.

Exercice 3 :

Creez un juste prix en console avec un affichage du temps et du nombre de tentatives mises par l'utilisateur pour trouver le juste prix.

### Les conversions

En java il existe deux types de conversions :

- les conversions implicites
- les conversions explicites

#### Les conversions implicites

Les conversions implicites sont des conversions qui sont faites automatiquement par le compilateur.

```java
int entier = 10;
double decimal = entier; // conversion implicite
```

#### Les conversions explicites

Les conversions explicites sont des conversions qui sont faites par le programmeur.

```java
double decimal = 10.5;
int entier = (int) decimal; // conversion explicite
```

La conversion entre types numeriques est possible si le type de destination est plus grand que le type source.

```java
int entier = 10;
double decimal = entier; // conversion implicite
```

La conversion vers des chaines de caractères est possible pour tous les types.

```java
int entier = 10;
String chaine = String.valueOf(entier); // conversion explicite
```

Dans certains cas il n'y a pas besoin d'utiliser une methode pour convertir un type en chaine de caracteres.

```java
int entier = 10;
String chaine = "" + entier; // conversion implicite
```

Exercice 4 :

Ecrire un programme qui demande à l’utilisateur de saisir un nombre entier et qui affiche sa valeur en binaire, octale et hexadécimale.

La conversion depuis une chaine de caractères: la classe Integer

La classe Integer permet de convertir une chaine de caractères en un entier.

```java
String chaine = "10";
int entier = Integer.parseInt(chaine); // conversion explicite
```

L'inférence de type

Depuis Java 10, il est possible de déclarer une variable sans préciser son type. Le compilateur va alors inférer le type de la variable en fonction de la valeur qui lui est affectée.

```java
var entier = 10;
var decimal = 10.5;
var chaine = "une chaine de caracteres";
```

La programmatin orientee objet

Exercice 5 :

Créer une classe représentant un article d’un magasin de vente par en ligne. Un article est caractérisé par sa référence, sa désignation, son prix. Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

Exercice 6 :

Créer une classe représentant un client d’un magasin de vente par en ligne. Un client est caractérisé par son nom, son prénom, son adresse, son code postal et sa ville. Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

Exercice 7 :

Créer une classe représentant une commande d’un magasin de vente par en ligne. Une commande est caractérisée par son numéro, sa date, le client qui passe la commande, le tableau des articles commandés et le tableau des quantités commandées pour chaque article. Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

### La programmation orientee objet

La programmation orientee objet est un paradigme de programmation qui permet de representer des objets du monde reel en utilisant des classes et des objets.

#### Les classes

Voici la syntaxe pour creer une classe en java :

```java
public class NomDeLaClasse {
    // attributs / champs
    // constructeurs
    // methodes
}
```

Les classes sont constituees de champs, de constructeurs et de methodes. Les champs representent les donnees de la classe, les constructeurs permettent de creer des objets et les methodes permettent de manipuler les objets.

A ces notions fondamentales vont s'ajouter trois concepts importants :

- l'encapsulation
- l'heritage
- le polymorphisme

L'encapsulation permet de proteger les donnees d'une classe en les rendant privees.
On va ainsi cacher certains elements qui ne sont pas necessaire a l'utilisateur de la classe, mais necessaire a son bon fonctionnement.
Dans le cas d'une classe Article, l'utilisateur n'a pas besoin de connaitre le prix de revient de l'article, mais il a besoin de connaitre son prix de vente.
Dans le cas d'une voiture, l'utilisateur n'a pas besoin de connaitre la vitesse de rotation du moteur, mais il a besoin de connaitre la vitesse de la voiture.

Les elements de la classes visibles depuis l'exterieur constitue l'interface de la classe.

L'heritage permet de creer des classes filles a partir d'une classe mere. Autrement dit on cree un nouvelle classe a partir d'une classe existante. La classe fille herite de tous les elements de la classe mere. On peut alors ajouter des elements supplementaires a la classe fille.

Le polymorphisme permet de manipuler des objets de classes differentes avec une meme interface.
Ce concept est un peu difficile a comprendre au depart, mais il est tres important en programmation orientee objet.
Il est possibles d'utiliser plusieurs classes differentes qui ont une meme interface.
Deux autres concepts sont souvent associes au polymorphisme : la surcharge et la substitution.

Mise en pratique avec JAVA:

![Alt text](image-9.png)

Declaration d'une classe :

```java
[modificateur] class NomDeLaClasse [extends NomDeLaClasseMere] [implements NomDeLinterface  ]  {

    // Code source de la classe
    // attributs / champs
    // constructeurs
    // methodes
}
```

Les modificateurs de classes :

- public : la classe est visible depuis n'importe quel autre classe. Sans ce modificateur, la classe est visible uniquement depuis le package dans lequel elle est declaree.
- abstract: la classe est abstraite. Une classe abstraite ne peut pas etre instanciee.
- final: la classe ne peut pas etre heritee.

Les methodes de classes :

```java
    [modificateur] typeDeRetour nomDeLaMethode([parametres]) {
        // code source de la methode
    }
```

Les modificateurs de methodes :

- public : la methode est visible depuis n'importe quel autre classe. Sans ce modificateur, la methode est visible uniquement depuis le package dans lequel elle est declaree.
- protected : la methode est visible depuis la classe, le package et les classes filles.
- private : la methode est visible uniquement depuis la classe.
- static : la methode est une methode de classe. Elle peut etre utilisee sans instancier la classe.
- abstract : la methode est abstraite. Elle doit etre redefinie dans les classes filles.
- final : la methode ne peut pas etre redefinie dans les classes filles.
- native : la methode est implementee dans un langage autre que Java.
- synchronized : la methode ne peut etre utilisee que par un seul thread a la fois.

Creation d'accesseurs pour les champs prives (getter et setter):

```java
    public typeDeRetour getNomDuChamp() {
        return nomDuChamp;
    }

    public void setNomDuChamp(typeDuChamp nomDuChamp) {
        this.nomDuChamp = nomDuChamp;
    }
```

Les constructeurs d'une classe :

Il s'agit d'une methode particuliere qui permet de creer des objets a partir d'une classe.
Le constructeur porte le meme nom que la classe et n'a pas de type de retour.
Il est possible de creer plusieurs constructeurs dans une classe. On parle de surcharge de constructeurs.
Si aucun constructeur n'est declare dans une classe, un constructeur par defaut est cree par le compilateur.
Ce constructeur par defaut est un constructeur vide qui ne fait rien.

```java
    public NomDeLaClasse() {
        // code source du constructeur
    }
```

Declaration de la classe Personne:

```java
public class Personne {
    // attributs / champs
    private String nom;
    public String prenom;

    // accessible depuis la classe, le package et les classes filles
    protected String adresse;
    private String codePostal;
    private String ville;

    // constructeurs
    public Personne() {
    }

    public Personne(String nom, String prenom, String adresse, String codePostal, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // methodes
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
```
