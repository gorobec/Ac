package homeOOP.candyPresent;

import java.util.ArrayList;

/**
 * Created by Vorobiei on 14.04.2015.
 */
public class Present {

    public Present() {
    }

    public double getWeight (ArrayList<Sweets> sweets) {
        double weight = 0;
        for (int i = 0; i < sweets.size(); i++) {
            weight += sweets.get(i).getWeight();
        }
        return weight;
    }

    public void sortSugariness (ArrayList<Sweets> sweets) {
        for (int i = sweets.size() - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (sweets.get(j).getSugariness() > sweets.get(j + 1).getSugariness()) {

                    Sweets tmp = sweets.get(j);
                    sweets.set(j, sweets.get(j + 1));
                    sweets.set(j + 1, tmp);
                }
            }
        }
    }

    public void sortWeight (ArrayList<Sweets> sweets) {
        for (int i = sweets.size() - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (sweets.get(j).getWeight() > sweets.get(j + 1).getWeight()) {

                    Sweets tmp = sweets.get(j);
                    sweets.set(j, sweets.get(j + 1));
                    sweets.set(j + 1, tmp);
                }
            }
        }
    }
    public void findSugariness (ArrayList<Sweets> sweets, int sugariness1, int sugariness2) {
        for (int i = 0; i < sweets.size(); i++) {
            if (sweets.get(i).getSugariness() >= sugariness1 && sweets.get(i).getSugariness() <= sugariness2) {
                System.out.println(sweets.get(i).getName() + " - " + sweets.get(i).getSugariness());
            }
        }
    }
}
