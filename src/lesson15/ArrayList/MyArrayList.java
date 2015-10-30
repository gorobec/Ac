package lesson15.ArrayList;

import java.util.Arrays;

/**
 * Created by Vorobiei on 16.04.2015.
 */
public class MyArrayList {

    private int size;
    private Object[] array;

    public MyArrayList() {
        array = new Object[size];
    }

    public void add (Object o) {
        Object[] newArray = new Object[size + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = o;
        array = newArray;
        size++;
    }

    public void add (int i, Object o) {
        if (i > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] newArray = new Object[size + 1];
        System.arraycopy(array, 0, newArray, 0, i);
        System.arraycopy(array, i, newArray, i + 1, array.length - i);
        newArray[i] = o;
        array = newArray;
        size++;
    }

    public void set (int i, Object o) {
        array[i] = o;
    }

    public void remove (int i) {
        Object[] newArray = new Object[size - 1];
        System.arraycopy(array, 0, newArray, 0, i);
        System.arraycopy(array, i + 1, newArray, i, array.length - (i + 1));
        array = newArray;
        size--;
    }

    public boolean remove (Object o) {
       for(int i = 0; i < array.length;) {
            if (array[i] == o) {
                Object[] newArray = new Object[size - 1];
                System.arraycopy(array, 0, newArray, 0, i);
                System.arraycopy(array, i + 1, newArray, i, array.length - (i + 1));
                array = newArray;
                size--;
                return true;
            }
            else
                i++;
        }
        return false;
    }

    public boolean contains (Object o) {
        boolean answer = false;
        for(int i = 0; i < array.length; i++) {

            if (array[i].equals(o)) {
                answer = true;
            }
        }
        return answer;
    }

    public int size () {
        return array.length;
    }
    public Object get (int i) {
        return array[i];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < array.length - 1; i++) {
            s += array[i] + ", ";
        }
        s += array[array.length - 1];
        return "[" + s + "]";
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }

}
