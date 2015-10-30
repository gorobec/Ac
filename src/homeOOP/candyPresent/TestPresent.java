package homeOOP.candyPresent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Vorobiei on 06.04.2015.
 */
public class TestPresent {



    public static void main(String[] args) throws IOException {
        

        ArrayList<Sweets> sweets = new ArrayList<Sweets>();

        sweets.add(new Candy("Cow", 0.025, 15, false));
        sweets.add(new Candy("Camel", 0.020, 8, false));
        sweets.add( new Candy("Poppy", 0.015, 19, false));
        sweets.add(new Candy("Squirrel", 0.018, 15, false));
        sweets.add(new Candy("ChupaChups", 0.035, 20, true));
        sweets.add(new Chocolate("Corona", 0.150, 24, false));
        sweets.add(new Chocolate("Roshen", 0.200, 20, true));

       

        Present present = new Present();

        System.out.println("Presents' weight is - " + present.getWeight(sweets) +  " kilos");



        System.out.println("\nYours present sort by sugariness looks like this: ");
        present.sortSugariness(sweets);
        for (Sweets sweet : sweets)
            System.out.println(sweet.getName() + ", sugariness - " + sweet.getSugariness() + " %");


        System.out.println("\nYours present sort by weight looks like this: ");
        present.sortWeight(sweets);
        for (Sweets sweet : sweets)
            System.out.println(sweet.getName() + ", weight - " + sweet.getWeight() + " g");

         System.out.println("\nLets find if there're sweets with interested us sugariness");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter sweet's sugariness from: ");
        int stemLength1 = Integer.parseInt(br.readLine());
        System.out.println("Enter sweet's sugariness till: ");
        int stemLength2 = Integer.parseInt(br.readLine());

        present.findSugariness(sweets, stemLength1, stemLength2);







    }

}
