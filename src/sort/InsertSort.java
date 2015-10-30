package sort;

import java.util.Arrays;

public class InsertSort {
	
	public void insert (int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {	// начинаем двигать границу с [1] элемента, так как [0] уже отсортирован
			
			int j = i;	//элемент который будем загонять влево выберам тот, который находеться ближе всего к границе
			
			while (j !=0) {	//пока не пройдем круг до конца левого края
				
				if (arr[j] < arr[j - 1]) {
					
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
				j--; 	//продвижение к левому краю
			}
			
		}
		System.out.println("\n***********InsertSort***********");
		System.out.println(Arrays.toString(arr));
	}

}
