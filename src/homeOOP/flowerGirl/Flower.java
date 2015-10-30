package homeOOP.flowerGirl;

/**
 * Created by Vorobiei on 06.04.2015.
 */
public class Flower {
   // private static int number = 0;
    //private static  int sum = 0;
    private String name;
    private double price;
    private int freshness;
    private int stemLength;


    public Flower (String name, double price, int freshness, int stemLength) {
        this.name = name;
        this.price = price;
        this.freshness = freshness;
        this.stemLength = stemLength;
        //number ++;
        //sum += getPrice();

    }
    public int getFreshness() {
        return freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public String getName() {
        return  name;
    }


    public double getPrice() {
        return price;
    }

 /*   public static int getNumber() {
        return number;
    }

    public  static int getSum() {
        return sum;
    }*/

}
