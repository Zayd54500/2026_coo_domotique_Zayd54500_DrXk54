import java.util.Scanner;
import thermos.Thermostat;

/**
 * classe qui cree des lampes et une telecommande associee.
 */
public class Main {

    public static void main(String args[]) {
        // la telecommande vide
        Telecommande t = new Telecommande();

        // Création d'un thermostat
        Thermostat thermostat = new Thermostat();

        // Création d'un adaptateur de thermostat
        AdaptateurThermostat adaptateurThermostat = new AdaptateurThermostat(thermostat);

        // Ajout d'un adaptateur thermostat dans les appareils
        t.ajouterAppareil(adaptateurThermostat);

        // ajoute des lampes
        ajouter4Lampes(t);

        // ajoute des chaines Hifi
        ajouter2Hifi(t);

        // ajoute une cheminee
        ajouter1Cheminee(t);


        // Allumage du thermostat
        t.allumer(t.getNombre() - 1);

        // Eteignage du thermostat
        t.eteindre(t.getNombre() - 1);

        // test d'activation lampes
        t.allumer(1);
        t.allumer(3);

        // test d'activation Hifi
        t.allumerTout(); // tous les appareils actives
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
            System.out.println("Entrer le type d'appareil (lampe/hifi/cheminee/exit) : ");
            String type = sc.nextLine();

            if (type.equals("exit")) {
                System.out.println("== Fin du programme == ");
                fini = true;
            } else if (type.equals("lampe")) {
                System.out.println("Entrer le numero de la lampe : ");
                int choix = sc.nextInt();
                sc.nextLine();
                System.out.println("Entrer commande (+/-) : ");
                String com = sc.nextLine();

                if (com.equals("+")) {
                    t.allumer(choix);
                } else if (com.equals("-")) {
                    t.eteindre(choix);
                } else {
                    System.out.println("Commande inconnue");
                }

            } else if (type.equals("hifi")) {
                System.out.println("Entrer le numero de la Hifi : ");
                int choix = sc.nextInt();
                sc.nextLine();
                System.out.println("Entrer commande (+/-) : ");
                String com = sc.nextLine();

                if (com.equals("+")) {
                    t.allumer(choix);
                } else if (com.equals("-")) {
                    t.eteindre(choix);
                } else {
                    System.out.println("Commande inconnue");
                }

            } else if (type.equals("cheminee")) {
                System.out.println("Entrer le numero de la cheminee : ");
                int choix = sc.nextInt();
                sc.nextLine();
                System.out.println("Entrer commande (+/-) : ");
                String com = sc.nextLine();

                if (com.equals("+")) {
                    t.allumer(choix);
                } else if (com.equals("-")) {
                    t.eteindre(choix);
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
        t.ajouterAppareil(l1);

        Lampe l2 = new Lampe("Lampe2");
        t.ajouterAppareil(l2);

        Lampe l3 = new Lampe("Lampe3");
        t.ajouterAppareil(l3);

        Lampe l4 = new Lampe("Lampe4");
        t.ajouterAppareil(l4);
    }
    /**
     * creation de chaines Hifi et ajout dans la telecommande
     */
    private static void ajouter2Hifi(Telecommande t) {
        Hifi h1 = new Hifi();
        t.ajouterAppareil(h1);

        Hifi h2 = new Hifi();
        t.ajouterAppareil(h2);
    }

    /**
     * creation d'une cheminee et ajout dans la telecommande
     */
    private static void ajouter1Cheminee(Telecommande t) {
        Cheminee c1 = new Cheminee();
        AdaptateurCheminee ac1 = new AdaptateurCheminee(c1);
        t.ajouterAppareil(ac1);
    }
}