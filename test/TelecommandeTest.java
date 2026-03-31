import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {

    @Test
    void testAjouterLampe() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");
        t.ajouterLampe(l);
        assertEquals("0 - Lampe Salon: éteinte\n", t.toString());
    }

    @Test
    void testActiverLampe() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");
        t.ajouterLampe(l);
        t.activerLampe(0);
        assertEquals("0 - Lampe Salon: allumée\n", t.toString());
    }

    @Test
    void testDesactiverLampe() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");
        t.ajouterLampe(l);
        t.activerLampe(0);
        t.desactiverLampe(0);
        assertEquals("0 - Lampe Salon: éteinte\n", t.toString());
    }

    @Test
    void testActiverTout() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Salon");
        Lampe l2 = new Lampe("Cuisine");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.activerTout();
        assertEquals("0 - Lampe Salon: allumée\n1 - Lampe Cuisine: allumée\n", t.toString());
    }

    @Test
    void testLampeInexistante() {
        Telecommande t = new Telecommande();
        assertThrows(IndexOutOfBoundsException.class, () -> t.activerLampe(5));
    }
}