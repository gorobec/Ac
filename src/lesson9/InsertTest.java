package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

public class InsertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String[] arr1 = new String[4];
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			
			BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
			
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
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for (int i = arr1.length - 2; i >= 0; i--)
		/*for(int i = 1; i < arr1.length; i++) */{	// �������� ������� ������� � [1] ��������, ��� ��� [0] ��� ������������
			
			int j = i;	//������� ������� ����� �������� ����� ������� ���, ������� ���������� ����� ����� � �������
			while (j != arr1.length-1)
			/*while (j !=0)*/ {	//���� �� ������� ���� �� ����� ������ ����
				
				if (arr1[j].compareTo(arr1[j + 1]) > 0) {
					
					String tmp = arr1[j + 1];
					arr1[j + 1] = arr1[j];
					arr1[j] = tmp;
					
					int tmp2 = arr2[j + 1];
					arr2[j + 1] = arr2[j];
					arr2[j] = tmp2;
				}
				j++;
				    //j--;//����������� � ������ ����
			}
			
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}	
		
		
}


