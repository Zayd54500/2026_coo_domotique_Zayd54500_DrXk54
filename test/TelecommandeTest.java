import org.junit.Test;
import static org.junit.Assert.*;

public class TelecommandeTest {

    @Test
    public void testAjouterLampeVide() {
        // préparation
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");

        // action
        t.ajouterLampe(l);

        // vérification
        assertTrue(t.toString().contains("Salon"));
    }

    @Test
    public void testAjouterLampeDeuxieme() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Salon");
        Lampe l2 = new Lampe("Chambre");

        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        assertTrue(t.toString().contains("Chambre"));
    }

    @Test
    public void testActiverLampe0() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");

        t.ajouterLampe(l);
        t.activerLampe(0);

        assertTrue(l.toString().contains("true"));
    }

    @Test
    public void testActiverLampe1() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Salon");
        Lampe l2 = new Lampe("Chambre");

        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        t.activerLampe(1);

        assertTrue(l2.toString().contains("true"));
    }

    @Test(expected = Error.class)
    public void testLampeInexistante() {
        Telecommande t = new Telecommande();
        t.activerLampe(0);
    }
}