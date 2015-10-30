package homeOOP.electrodevices;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Vorobiei on 20.04.2015.
 */
public class Flat {

    private List<Electrodevices> device;



    public Flat(List<Electrodevices> device) {
        this.device = device;
    }

    public int totalCapacity() {
       int totalCapacity = 0;
       for (int i = 0; i < device.size(); i++) {
           totalCapacity += device.get(i).getPower();
       }
       return totalCapacity;

   }

    public int totalOnCapacity() {
        int totalOnCapacity = 0;
        for (int i = 0; i < device.size(); i++) {
            if (device.get(i).isOn())
                totalOnCapacity += device.get(i).getPower();
        }
        return totalOnCapacity;
    }

    public void turnOn(String s) {
        int isDevice = 0;
        for (int i = 0; i < device.size(); i++) {
            if (s.equals(device.get(i).getName()) && !device.get(i).isOn()) {
                device.get(i).setOn(true);
                System.out.println("You have turned on the " + s);
                isDevice ++;
            }
            else if (s.equals(device.get(i).getName()) && device.get(i).isOn()) {
                System.out.println(s + " is already turned on");
                isDevice ++;
            }
        }
       if (isDevice == 0) {
            System.out.println("There're no " + s + "in the flat");
       }


    }

    public void sortPower () {

        Collections.sort(device, new Comparator<Electrodevices>() {
            @Override
            public int compare(Electrodevices o1, Electrodevices o2) {
                return o1.getPower() - o2.getPower();
            }
        });
    }

    public void sortName () {

        Collections.sort(device, new Comparator<Electrodevices>() {
            @Override
            public int compare(Electrodevices o1, Electrodevices o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void findPower(int power1, int power2) {
        List<Electrodevices> deviceFind = new ArrayList();
        System.out.println("*************************************************");
        for (int i = 0; i < device.size(); i++) {
            if (device.get(i).getPower() >= power1 && device.get(i).getPower() <= power2) {
                System.out.println(device.get(i).getName() + " : power " + device.get(i).getPower() + ", " + (device.get(i).isOn()? "turn On" : "turn Of"));
            }
        }
        System.out.println("*************************************************");
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < device.size(); i++) {
            s += device.get(i) + "\n";
        }
        return s;
    }


}
