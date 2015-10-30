package homeOOP.electrodevices;

/**
 * Created by Vorobiei on 20.04.2015.
 */
public class Fridge extends Electrodevices{
    
    private boolean freezer;

    public Fridge(String name, int power, boolean on, boolean freezer) {
        super(name, power, on);
        this.freezer = freezer;
    }


    public boolean isFreezer() {
        return freezer;
    }

}
