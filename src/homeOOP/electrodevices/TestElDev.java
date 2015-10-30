package homeOOP.electrodevices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vorobiei on 21.04.2015.
 */
public class TestElDev {

    public static void  main (String[] args) throws IOException {

        List<Electrodevices> device  = new ArrayList<Electrodevices>();
        device.add(new ElectricKettle("Kettle", 1500, true, 2));
        device.add(new Fridge("Fridge", 300, true, true));
        device.add(new Microwave("Microwave", 800, false,15));
        device.add(new Computer("Computer", 500, true, false));

        Flat one = new Flat(device);

        System.out.println(one);
        printTotalCapacity(one);
        turn(one);
        printTotalCapacity(one);
        System.out.println(one);
        one.sortPower();
        System.out.println(one);
        one.sortName();
        System.out.println(one);
        enterBoarders(one);
        System.out.println(one);

    }
    private static void printTotalCapacity(Flat number) {
        System.out.println("***************************************************************************");
        System.out.println("Total capacity of all devices in the flat is " + number.totalCapacity() + " W");
        System.out.println("Total capacity of all turned on devices in the flat is " + number.totalOnCapacity() + " W");
        System.out.println("***************************************************************************");


    }

    private static void turn(Flat number) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.print("Enter device name to turn on it \\ \"Enter\" to exit: ");
            String name = br.readLine();

            if (name.isEmpty()) break;

            number.turnOn(name);


        }
    }

    private static void enterBoarders (Flat number) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int power1 = 0;
        int power2 = 0;
        while (power1 <= 0) {
            System.out.println("Enter device's power from: ");

            try {
                power1 = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter number digit, please");
                power1 = 0;
            }
            if (power1 < 0)
                System.out.println("Enter number bigger than 0, please");
        }
        while (power2 <= 0 || power2 <= power1) {
             System.out.println("Enter device's power till: ");

            try {
                power2 = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter number digit, please");
                power2 = 0;
            }
            if (power2 <= power1 && power2 > 0)
                System.out.println("Enter number bigger than \"power from\", please");
        }

            number.findPower(power1, power2);


    }
}
