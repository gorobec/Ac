package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringS3 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		//enter text
		System.out.print("Enter text, please: ");
		String s1 = reader.readLine();
		
		String[] s2 = s1.split(" ");	//split text inside array by " "
		
		StringBuffer s3 = new StringBuffer();
		
		for (int i = 0; i < s2.length; i++) {	//перевераем каждое слово
			//нечетные слова
			if (i%2 == 1) {
				for (int j = 0; j < s2[i].length(); j++) {
					StringBuffer sTemp = new StringBuffer();
				
					if (j%2 == 0) { // четная буква в слове
						
						sTemp.append(s2[i].charAt(j));						
					}
					s3.append(sTemp);
				}
				s3.append(" ");
				
			}
			//четные слова
			else {
				StringBuffer sTemp = new StringBuffer();
				sTemp.append(s2[i]);	// меняем тип
				sTemp.reverse();	//переворачиваем слово
				s3.append(sTemp + " ");	//добавляем в строку
				
			}
			
		}
		System.out.println(s3); 	// вывод всего предложения
				
				

	}

}
