package homeOOP.electrodevices;

/**
 * Created by Vorobiei on 20.04.2015.
 */
public class Electrodevices {
    private String name;
    private int power;
    private boolean on;

    public Electrodevices(String name, int power, boolean on) {
        this.name = name;
        this.power = power;
        this.on = on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isOn() {
        return on;
    }

    @Override
    public String toString() {
        return getName() + " : power " + getPower() + ", " + (isOn()? "turn On" : "turn Of");
    }
}
