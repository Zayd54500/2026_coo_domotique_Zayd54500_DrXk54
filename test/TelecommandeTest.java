import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    @Test
    public void testAjouterLampeVide() {
        Telecommande t = new Telecommande() ;
        Lampe l = new Lampe("Salon");
        t.ajouterLampe(l);
        String resultat = t.toString();
        assertTrue(resultat.contains("Salon"),"La telecommande devrait contenir la lampe Salon");
    }

    @Test
    public void testAjouterLampeDeuxieme() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Salon");
        Lampe l2 = new Lampe("Chambre");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        String resultat = t.toString();
        assertTrue(resultat.contains("Chambre"), "La telecommande devrait contenir la deuxième lampe");
    }

    @Test
    public void testActiverLampe0() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Salon");
        t.ajouterLampe(l);
        t.activerLampe(0);
        assertTrue(l.isAllume(), "La lampe d'indice 0 devrait être allumé");
    }

    @Test
    public void testActiverLampe1() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Salon");
        Lampe l2 = new Lampe("Salon");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.activerLampe(1);
        assertTrue(l2.isAllume(), "La lampe d'indice 1 devrait être allumé");
    }

    @Test
    public void testLampeInexistante() {
        Telecommande t = new Telecommande();
        boolean erreur = false;
        try {
            t.activerLampe(0);
        } catch (Error e) {
            erreur = true;
        }
        assertTrue(erreur, "La télécommande devrait être innexistante");
    }


}