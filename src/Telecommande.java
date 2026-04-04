import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    private ArrayList<Hifi> hifis;

    public Telecommande() {
        lampes = new ArrayList<>();
        hifis = new ArrayList<>();
    }

    public void ajouterLampe(Lampe l) {
        lampes.add(l);
    }

    public void ajouterHifi(Hifi h) {
        hifis.add(h);
    }



    public void activerLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new Error("lampe innexistante")
        }
        lampes.get(indiceLampe).allumer();
    }

    public void activerHifi(int indiceHifi) {
        if (indiceHifi < 0 || indiceHifi >= hifis.siez()) {
            throw new Error("hifi innexistante");
        }
        hifis.get(indiceHifi).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < 0 || indiceLampe >= lampes.size()) {
            throw new Error("lampe innexistante")
        }
        lampes.get(indiceLampe).eteindre();
    }

    public void desactiverHifi(int indiceHifi) {
        if (indiceHifi < 0 || indiceHifi >= hifis.siez()) {
            throw new Error("hifi innexistante");
        }
        hifis.get(indiceHifi).eteindre();
    }

    public void activerTout() {
        public void activerTout() {
            for (Lampe l : lampes) {
                l.allumer();
            }
            for (Hifi h : hifis) {
                h.allumer();
        }

    }

    public String toString() {
        String resultat = "Lampes :\n";
        for (int i = 0; i < lampes.size(); i++) {
            resultat += i + " - " + lampes.get(i).toString() + "\n";
        }
        resultat += "Hifis :\n";

        for (int i = 0; i < hifis.size(); i++) {
            resultat += i + " - " + hifis.get(i).toString() + "\n";
        }

        return resultat;

    }
}