package homeOOP.electrodevices;

/**
 * Created by Vorobiei on 20.04.2015.
 */
public class ElectricKettle extends Electrodevices{

    private int volume;

    public ElectricKettle(String name, int power, boolean on, int volume) {
        super(name, power, on);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
