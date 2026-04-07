import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande() {
        appareils = new ArrayList<>();
    }

    public void ajouterAppareil(Appareil a) {
        appareils.add(a);
    }

    public void activerAppareil(int indiceAppareil) {
        if (indiceAppareil < 0 || indiceAppareil >= appareils.size()) {
            throw new Error("lampe innexistante");
        }
        appareils.get(indiceAppareil).allumer();
    }

    public void desactiverAppareil(int indiceAppareil) {
        if (indiceAppareil < 0 || indiceAppareil >= appareils.size()) {
            throw new Error("lampe innexistante");
        }
        appareils.get(indiceAppareil).eteindre();
    }

    public void activerTout() {
        for (Appareil a : appareils) {
            a.allumer();
        }
    }

    public String toString() {
        String resultat = "";
        for (int i = 0; i < appareils.size(); i++) {
            resultat += i + " - " + appareils.get(i).toString() + "\n";
        }
        return resultat;
    }
}