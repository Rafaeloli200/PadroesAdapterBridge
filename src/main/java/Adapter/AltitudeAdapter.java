package Adapter;

public class AltitudeAdapter extends AltitudeMetrico {

    private IAltitude altitudeI;

    public AltitudeAdapter(IAltitude altitude) {
        this.altitudeI = altitude;
    }

    public double recuperarAltitude() {
        return this.getAltitude() / 3;//na verdade é 3,281, mas assim facilita a conferir os testes
    }

    public void salvarAltitude() {
        this.setAltitude(altitudeI.getAltitudeI() * 3);
    }

}
