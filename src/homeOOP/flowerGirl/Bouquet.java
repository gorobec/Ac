package homeOOP.flowerGirl;



/**
 * Created by Джек on 05.04.2015.
 */
public class Bouquet {
    public int size;

    public Bouquet() {
    }


    public int getSize(Flower[] flowers) {

        return size = flowers.length;
    }

    public double getPrice(Flower[] flowers) {
    	int price = 0;

        for(int i = 0; i < flowers.length; i++) {

            price += flowers[i].getPrice();

        }

        return price;
    }



    public void sortFreshness (Flower[] flowers) {

        for (int i = flowers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (flowers[j].getFreshness() > flowers[j + 1].getFreshness()) {

                    Flower tmp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = tmp;
                }

            }
        }

    }
    public void findStemLength (Flower[] flowers, int stemLength1, int stemLength2) {

        for (int i = 0; i <flowers.length; i++) {

            if (flowers[i].getStemLength() >= stemLength1 && flowers[i].getStemLength() <= stemLength2) {
                System.out.println(flowers[i].getName() + " " + flowers[i].getStemLength());
            }
        }
    }

}


