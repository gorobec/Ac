package homeOOP.electrodevices;

/**
 * Created by Vorobiei on 20.04.2015.
 */
public class Computer extends Electrodevices {

    private boolean portable;

    public Computer(String name, int power, boolean on, boolean portable) {
        super(name, power, on);
        this.portable = portable;
    }

    public boolean isPortable() {
        return portable;
    }
}



