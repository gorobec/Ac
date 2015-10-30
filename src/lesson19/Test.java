package lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal fish = new Fish ("Nemo", 5, 25);
		
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream("../Vorobiei/src/lesson19/destination_2.txt");
			oos = new ObjectOutputStream(os);
			oos.writeObject(fish);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO error");
		} finally {
			try {
				if(oos != null)
						oos.close();
				if(os != null)
						os.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}

		}
	
	InputStream is = null;
	ObjectInputStream ois = null;
	
	try {
		is = new FileInputStream("../Vorobiei/src/lesson19/destination_2.txt");
		ois = new ObjectInputStream(is);
		Animal rec_fish = (Fish)ois.readObject();
		System.out.println("file rec");
		rec_fish.info();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}finally {
		try {
			if(ois != null)
					ois.close();
			if(is != null)
					is.close();
			
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}

}
