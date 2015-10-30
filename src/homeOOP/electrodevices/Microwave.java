package homeOOP.electrodevices;

/**
 * Created by Vorobiei on 20.04.2015.
 */
public class Microwave extends Electrodevices {

    private int size;

    public Microwave(String name, int power, boolean on, int size) {
        super(name, power, on);
        this.size = size;
    }


    public int getSize() {
        return size;
    }
}
