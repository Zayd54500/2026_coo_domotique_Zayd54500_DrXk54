import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    @Test
    public void testAjouterLampeVide() {
        Telecommande t = new Telecommande() ;
        Lampe l = new Lampe("Salon");
        t.ajouterAppareil(l);
        String resultat = t.toString();
        assertTrue(resultat.contains("Salon"),"La telecommande devrait contenir la lampe Salon");
    }

    @Test
    public void testAjouterLampeDeuxieme() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Salon");
        Lampe l2 = new Lampe("Chambre");
        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);
        String resultat = t.toString();
        assertTrue(resultat.contains("Chambre"), "La telecommande devrait contenir la deuxième lampe");
    }

    @Test
    public void testAllumerLampe0() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");
        t.ajouterAppareil(l);
        t.allumer(0);
        assertTrue(l.isAllume(), "La lampe d'indice 0 devrait être allumé");
    }

    @Test
    public void testAllumerLampe1() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Salon");
        Lampe l2 = new Lampe("Salon");
        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);
        t.allumer(1);
        assertTrue(l2.isAllume(), "La lampe d'indice 1 devrait être allumé");
    }

    @Test
    public void testLampeInexistante() {
        Telecommande t = new Telecommande();
        boolean erreur = false;
        try {
            t.allumer(0);
        } catch (Error e) {
            erreur = true;
        }
        assertTrue(erreur, "La télécommande devrait être innexistante");
    }

    @Test
    public void testAllumerCheminee() {
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        AdaptateurCheminee ac = new AdaptateurCheminee(c);
        t.ajouterAppareil(ac);
        t.allumer(0);
        assertEquals(10, c.getLumiere(), "La cheminee doit avoir une intensité de 10");
    }

    @Test
    public void testEteindreCheminee() {
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        AdaptateurCheminee ac = new AdaptateurCheminee(c);
        t.ajouterAppareil(ac);
        t.allumer(0);
        t.eteindre(0);
        assertEquals(0,c.getLumiere(), "La cheminee devrait être éteinte");
    }
}