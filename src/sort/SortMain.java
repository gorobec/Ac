package sort;

import java.util.Arrays;

public class SortMain {

	public static void main(String[] args) {
		
		ArraySize array = new ArraySize ();
		
		int[] arr = array.array();
		
		
		BubbleSort bub = new BubbleSort();
		bub.bubble (arr);
		
		ShakerSort shak = new ShakerSort();
		shak.shaker(arr);
		
		InsertSort ins = new InsertSort();
		ins.insert(arr);
		
		ChooseArray ch = new ChooseArray();
		ch.choose(arr);
		
		//MergeSort  merg = new MergeSort();
		
		System.out.println("\n***********MergeSort***********");
		System.out.println(Arrays.toString(MergeSort.sort(arr)));
		
		
		
		
		
		
		
		
	}
}
