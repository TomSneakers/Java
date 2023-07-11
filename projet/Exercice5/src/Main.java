public class Main {
    public static void main(String[] args) {
        //Creation d'un article avec un objet article
        Article pc = new Article("ref123", "Ordinateur portable", 999.99);

        System.out.println(pc);
        pc.setPrix(899.99);
        System.out.println(pc);
    }
}