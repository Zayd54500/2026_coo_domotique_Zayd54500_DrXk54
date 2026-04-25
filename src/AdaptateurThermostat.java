import thermos.Thermostat;

public class AdaptateurThermostat implements Appareil {
    private Thermostat thermostat;

    public AdaptateurThermostat(Thermostat t) {
        this.thermostat = t;
    }


    @Override
    public void allumer() {
        thermostat.monterTemperature();
    }

    @Override
    public void eteindre() {
        thermostat.baisserTemperature();
    }

    @Override
    public String toString() {
        return "Thermostat";
    }
}
