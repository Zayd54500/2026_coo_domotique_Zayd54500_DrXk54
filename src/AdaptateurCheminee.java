public class AdaptateurCheminee implements Appareil{
    private Cheminee cheminee;

    public AdaptateurCheminee(Cheminee c1) {
        this.cheminee = c1;
    }

    public void allumer() {
        int intensite = cheminee.getLumiere();
        if (intensite <= 90) {
            cheminee.changerIntensite(intensite + 10);
        } else {
            cheminee.changerIntensite(100);
        }
    }

    public void eteindre() {
        cheminee.changerIntensite(0);
    }

    public String toString() {
        return  cheminee.toString();
    }
}
