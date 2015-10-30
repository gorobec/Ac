package lesson10;


import java.io.IOException;

public class Cafe {


    public  Human win (Human h1, Human h2) throws IOException {
      /*  Human h1 = new Human();
        Human h2 = new Human();*/

        while (h1.getHealth() > 0 || h2.getHealth() > 0) {

            if (h1.getHealth() > 0)
                h1.hit(h2);
            else
                break;

            if (h2.getHealth() > 0)
                h2.hit(h1);
            else
                break;
            System.out.println();
        }
        if (h1.getHealth() >= 1) {


            System.out.println("\n" + h1.getFio() + " win!!!");
            h1.setHealth(100);
            System.out.println("Health renewed");
            System.out.println("******************************************\n");

           return h1;
        }
        else {

            System.out.println("\n" + h2.getFio() + " win!!!");
            h2.setHealth(100);
            System.out.println("Health renewed");
            System.out.println("******************************************\n");
           return h2;
        }

    }
}
