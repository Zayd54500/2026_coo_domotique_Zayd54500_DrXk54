import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande() {
        appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil a) {
        appareils.add(a);
    }

    public void allumer(int i) {
        if (i < 0 || i >= appareils.size()) {
            throw new Error("Appareil inexistant");
        }
        appareils.get(i).allumer();
    }

    public void eteindre(int i) {
        if (i < 0 || i >= appareils.size()) {
            throw new Error("Appareil inexistant");
        }
        appareils.get(i).eteindre();
    }

    public void allumerTout() {
        for (Appareil a : appareils) {
            a.allumer();
        }
    }

    public int getNombre() {
        return appareils.size();
    }

    @Override
    public String toString() {
        return appareils.toString();
    }
}