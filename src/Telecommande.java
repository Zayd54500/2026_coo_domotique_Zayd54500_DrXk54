import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    // Attribut
    private List<Lampe> lampes;

    // Constructeur
    public Telecommande() {
        lampes = new ArrayList<>();
    }

    // Ajouter une lampe
    public void ajouterLampe(Lampe lampe) {
        if (lampe != null) {
            lampes.add(lampe);
        }
    }

    // Activer une lampe
    public void activerLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).allumer();
        } else {
            throw new IndexOutOfBoundsException("Lampe inexistante");
        }
    }

    // Désactiver une lampe
    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).eteindre();
        } else {
            throw new IndexOutOfBoundsException("Lampe inexistante");
        }
    }

    // Activer toutes les lampes
    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }

    // toString
    public String toString() {
        String result = "Télécommande :\n";
        for (int i = 0; i < lampes.size(); i++) {
            result += i + " - " + lampes.get(i).toString() + "\n";
        }
        return result;
    }
}