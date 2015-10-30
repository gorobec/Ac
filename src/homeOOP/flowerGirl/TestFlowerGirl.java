package homeOOP.flowerGirl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Джек on 05.04.2015.
 */
public class TestFlowerGirl {

    public static void main (String[] args) throws IOException {

       Flower[] flowers = {
                new Rose("Роза", 15.0, 10, 45),
                new Rose("Тюльпан", 10.0, 8, 23),
                new Rose("Роза", 15.0, 10, 43),
                new Rose("Роза", 15.0, 8, 44),
                new Tulip("Тюльпан", 10.0, 9, 26)
        };

        Bouquet bouquet = new Bouquet();

        System.out.println("Yours bouquet contains " +  bouquet.getSize(flowers) + " flowers and it price is - " + bouquet.getPrice(flowers) + " uah.");


        bouquet.sortFreshness(flowers);
        System.out.println("\nYours bouquet sort by freshness looks like this: ");
        for (Flower flower : flowers)
            System.out.println(flower.getName() + " , freshness - " + flower.getFreshness());

        System.out.println("\nLets find if there're flowers with interested us length");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter flower length from: ");
        int stemLength1 = Integer.parseInt(br.readLine());
        System.out.println("Enter flower length till: ");
        int stemLength2 = Integer.parseInt(br.readLine());

        bouquet.findStemLength(flowers, stemLength1, stemLength2);




    }
}
