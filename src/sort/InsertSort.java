package sort;

import java.util.Arrays;

public class InsertSort {
	
	public void insert (int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {	// �������� ������� ������� � [1] ��������, ��� ��� [0] ��� ������������
			
			int j = i;	//������� ������� ����� �������� ����� ������� ���, ������� ���������� ����� ����� � �������
			
			while (j !=0) {	//���� �� ������� ���� �� ����� ������ ����
				
				if (arr[j] < arr[j - 1]) {
					
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
				j--; 	//����������� � ������ ����
			}
			
		}
		System.out.println("\n***********InsertSort***********");
		System.out.println(Arrays.toString(arr));
	}

}
