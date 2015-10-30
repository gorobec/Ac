package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertTest2 {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        String[] arr1 = new String[4];
        int[] arr2 = new int[arr1.length];
        String[] arr3 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {

            BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

            System.out.print("Enter name: ");
            arr1[i] = reader.readLine();


            while (true) {
                System.out.print("Enter age: ");
                String j = reader.readLine();
                try {arr2[i] = Integer.parseInt(j);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong format...");
                }
            }
            while (true) {
                System.out.print("Enter date of employment (\"dd-MMM-yyyy\"): ");
                arr3[i] = reader.readLine();
                try {
                    Date newDate = sdf.parse(arr3[i]);
                    break;
                } catch (ParseException e) {

                    System.out.println("Wrong format...");
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        for (int i = arr1.length - 2; i >= 0; i--) {

            int j = i;
            while (j != arr1.length - 1) {

                if (arr1[j].compareTo(arr1[j + 1]) > 0) {

                    String tmp = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = tmp;

                    int tmp2 = arr2[j + 1];
                    arr2[j + 1] = arr2[j];
                    arr2[j] = tmp2;

                    String tmp3 = arr3[j + 1];
                    arr3[j + 1] = arr3[j];
                    arr3[j] = tmp3;
                }
                j++;

            }

        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }


}


