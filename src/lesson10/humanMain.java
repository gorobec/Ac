package lesson10;


import java.io.IOException;


/**
 * Created by Джек on 28.03.2015.
 */
public class humanMain {

    public static void main(String[] args) throws IOException {

        Human h1 = new Human();
        Human h2 = new Human();

        Human h3 = new Human();
        Human h4 = new Human();

        Human h5 = new Human();
        Human h6 = new Human();

        Human h7 = new Human();
        Human h8 = new Human();

        Cafe cafe = new Cafe();


         cafe.win(cafe.win(cafe.win(h5, h6), cafe.win(h7, h8)), cafe.win(cafe.win(h1, h2), cafe.win(h3, h4)));


    }
}
