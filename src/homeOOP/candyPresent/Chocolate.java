package homeOOP.candyPresent;

/**
 * Created by Vorobiei on 06.04.2015.
 */
public class Chocolate extends Sweets {

    private boolean aerated;

    public Chocolate (String name, double weight, int sugariness, boolean aerated) {

        super(name, weight, sugariness);
        this.aerated = aerated;
    }
}
