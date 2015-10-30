package sort;

import java.util.Arrays;

public class ShakerSort {

	public void shaker (int[] arr) {
		int left = 0;	//����� ������� ��������������� �������
		int right = arr.length;	//������ -**-
		
		for (int i = 0; i < arr.length/2; i++) {	//��� ��� � ����� 2 �������� �����, �� ������ "����������� � 2 ����" � �������� �����
			
			
			for (int j = left; j < right - 1; j++) { // ��������� ����� ������� � �����, ���� �� ������ ������������
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
				
			}
			right--; 		//��������� ������ ������� �������
			
			for (int j = right; j > left; j--) {	//��������� ������ ������� � ����, ���� �� ������ �����������
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
			left++; 	//��������� ����� ������� �������
		}
		System.out.println("\n***********ShakerSort**********");
		System.out.println(Arrays.toString(arr));
	}
}
