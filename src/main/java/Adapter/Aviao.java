package Adapter;

public class Aviao {

    IAltitude altitudeI;
    AltitudeAdapter persistencia;

    public Aviao() {
        altitudeI = new AltitudeImperial();
        persistencia = new AltitudeAdapter(altitudeI);
    }

    public void setAltitude(double pes) {
        altitudeI.setAltitudeI(pes);
        persistencia.salvarAltitude();
    }

    public double getAltitude() {
        return persistencia.recuperarAltitude();
    }

}
