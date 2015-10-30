package homeOOP.candyPresent;

/**
 * Created by Vorobiei on 06.04.2015.
 */
public class Candy extends  Sweets{

    private boolean lollipop;

    public Candy (String name, double weight, int sugariness, boolean lollipop) {

        super(name, weight, sugariness);
        this.lollipop = lollipop;
    }

}
