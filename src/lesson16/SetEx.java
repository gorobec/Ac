package lesson16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet( new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}} );
		set.add(15);
		set.add(9);
		set.add(11);
		set.add(6);
		
		System.out.println(set);
	}

}
