import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

    public static void main(String args[]) {
        // la telecommande vide
        Telecommande t = new Telecommande();

        // ajoute des lampes
        ajouter4Lampes(t);

        // ajoute des chaines Hifi
        ajouter2Hifi(t);

        // test d'activation lampes
        t.activerLampe(1);
        t.activerLampe(3);

        // test d'activation Hifi
        t.activerTout(); // toutes les lampes et hifi activées
        System.out.println(t);

        // gestion du menu
        lancerMenu(t);
    }

    /**
     * menu qui permet de manipuler une telecommande
     * 
     * @param t telecommande a manipuler
     */
    private static void lancerMenu(Telecommande t) {
        System.out.println(t);
        Scanner sc = new Scanner(System.in);

        boolean fini = false;

        while (!fini) {
            System.out.println("Entrer le type d'appareil (lampe/hifi/exit) : ");
            String type = sc.nextLine();

            if (type.equals("exit")) {
                System.out.println("== Fin du programme == ");
                break;
            }

            if (type.equals("lampe")) {
                System.out.println("Entrer le numero de la lampe : ");
                int choix = sc.nextInt();
                sc.nextLine(); // consommer le retour chariot
                System.out.println("Entrer commande (+/-) : ");
                String com = sc.nextLine();

                if (com.equals("+")) {
                    t.activerLampe(choix);
                } else if (com.equals("-")) {
                    t.desactiverLampe(choix);
                } else {
                    System.out.println("Commande inconnue");
                }

            } else if (type.equals("hifi")) {
                System.out.println("Entrer le numero de la Hifi : ");
                int choix = sc.nextInt();
                sc.nextLine(); // consommer le retour chariot
                System.out.println("Entrer commande (+/-) : ");
                String com = sc.nextLine();

                if (com.equals("+")) {
                    t.activerHifi(choix);
                } else if (com.equals("-")) {
                    t.desactiverHifi(choix);
                } else {
                    System.out.println("Commande inconnue");
                }

            } else {
                System.out.println("Type d'appareil inconnu");
            }

            System.out.println(t);
        }

        sc.close();
    }

    /**
     * creation des lampes et ajout dans la telecommande
     */
    private static void ajouter4Lampes(Telecommande t) {
        Lampe l1 = new Lampe("Lampe1");
        t.ajouterLampe(l1);

        Lampe l2 = new Lampe("Lampe2");
        t.ajouterLampe(l2);

        Lampe l3 = new Lampe("Lampe3");
        t.ajouterLampe(l3);

        Lampe l4 = new Lampe("Lampe4");
        t.ajouterLampe(l4);
    }

    /**
     * creation de chaines Hifi et ajout dans la telecommande
     */
    private static void ajouter2Hifi(Telecommande t) {
        Hifi h1 = new Hifi();
        t.ajouterHifi(h1);

        Hifi h2 = new Hifi();
        t.ajouterHifi(h2);
    }
}