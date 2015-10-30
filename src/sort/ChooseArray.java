package sort;

import java.util.Arrays;

public class ChooseArray {

	
	public void choose(int[] arr) {
		
		
		
		for (int j = arr.length - 1; j >= 0; j--){	//��������� ������� ������� �� 1, � ������ �����, �� ��������, ����� ����. �����
			int max = j;	//����� ������������� ����� ����� ��������� ����� �������, ������� ����� ���������� ������ ��� ��� ���������� �������
			for (int i = 0; i < j; i++) {	//���� ������������ ����� ������
				if (arr[i] > arr[max])
					max = i;	//������ ������ ����� �� ������������ ����
			}
			int tmp = arr[j]; //������������ ����. ����� � ����� �������
			arr[j] = arr[max];
			arr[max] = tmp;
		}
		
		System.out.println("\n***********ChooseArray************");
		System.out.println(Arrays.toString(arr));
	}

}
