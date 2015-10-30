package homeOOP.candyPresent;

/**
 * Created by Vorobiei on 06.04.2015.
 */
public class Sweets {
    private String name;
    private double weight;
    private int sugariness;

    public Sweets (String name, double weight, int sugariness) {
        this.name = name;
        this.weight = weight;
        this.sugariness = sugariness;


    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getSugariness() {
        return sugariness;
    }
}
