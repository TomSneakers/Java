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
