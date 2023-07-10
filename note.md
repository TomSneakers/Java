Note pour JAVA:

Lundi 10 juillet:
-language système simple orienté objet et interpréter .
-optimisation du temps des cycle de dev (compilation et exectution)
-Les application produites sont potables: Compatible sur plusieurs plate-forme (cross-plateform) - Gestion de mémoir et erreur par rapport au C++ sont simplifiées
-Possibilité de créer des application multi threadés - Les apps sont robustes et sécurisé grâce à des vérif du bytecode avant éxecution -

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

    
