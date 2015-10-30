package lesson15.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class TestMyArralist {

   public static void main(String[]args) {
       MyArrayList list = new MyArrayList();

       list.print();
       list.add(15);
       list.print();
       list.add(8);
       list.add(13);
       list.print();
       System.out.println(list);
       list.add("Add");
       list.print();
       list.add(1, "AddIndex");
       list.print();
       list.add(0, 11);
       list.add(3, "Add");
       list.print();
       list.set(0, "Set");
       list.print();
       list.remove((Integer)15);
       list.print();
       System.out.println(list.remove("Add"));
       list.print();
       System.out.println(list.contains(11));
       System.out.println(list.contains("AddIndex"));
       System.out.println(list.size());
       System.out.println(list.get(1));





   }

}
