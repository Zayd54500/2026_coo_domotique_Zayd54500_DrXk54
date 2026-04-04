import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande() {
        lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe l) {
        lampes.add(l);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new Error("lampe innexistante")
        }
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new Error("lampe innexistante")
        }
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        public void activerTout() {
            for (Lampe l : lampes) {
                l.allumer();
            }
        }

    }

    public String toString() {
        String resultat = "";
        for (int i = 0; i < lampes.size(); i++) {
            resultat += i + " - " + lampes.get(i).toString() + "\n";
        }
        return resultat;
    }
}