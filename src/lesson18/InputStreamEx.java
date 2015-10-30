package lesson18;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class InputStreamEx {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	InputStream is = new FileInputStream("../Vorobiei/src/lesson18/src.txt");
	System.out.println("Conected");
	/*System.out.println(is.read());
	System.out.println(is.available());
	while (is.available() > 0)
		System.out.println((char)is.read());*/
	
	
	/*byte[] bytes = new byte[is.available()];
	is.read(bytes);
	System.out.println(Arrays.toString(bytes));*/
	
	
	/*while (is.available() > 0){
		byte[] bytes2 = new byte[4];		
		System.out.print(is.read(bytes2) + " : ");
		
		for(int i = 0; i < bytes2.length; i++) {
			System.out.print(" " + (char)bytes2[i]);
		}
		System.out.println();
	}*/
		

	/*while (is.available() > 0){
			
		System.out.print((char)is.read() + " ");
		is.skip(1);		
		
		
		}
	System.out.println();*/
	
	
	/*InputStream bis = new ByteArrayInputStream(bytes);
	
		while (true) {
			if (bis.available() < 0)
				break;	
	
			System.out.print(bis.read(bytes, 0, 4) + " ");
		}*/
		
	
	
	OutputStream os = new FileOutputStream("../Vorobiei/src/lesson18/dest.txt");
	
	
	
	while (is.available() > 0){
		
		os.write(is.read());
		is.skip(1);	
		
	}
	os.flush();
	os.close();
	System.out.println("Close");
	is.close();
	}
	
	
	

	
}
