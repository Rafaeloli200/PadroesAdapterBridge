package Adapter;

public class AltitudeImperial implements IAltitude {

    private double altitudeI;

    
    public double getAltitudeI() {
        return this.altitudeI;
    }

    @Override
    public void setAltitudeI(double altitude) {
        this.altitudeI = altitude;
    }

}
