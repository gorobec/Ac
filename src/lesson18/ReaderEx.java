package lesson18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("../Vorobiei/src/lesson18/dest.txt");
		Reader reader = new FileReader("../Vorobiei/src/lesson18/src.txt");
		System.out.println("Conected");
		while (reader.ready()) {
			int f = reader.read();
			if (Character.isDigit(f) && f % 3 == 0)
				writer.write(f);
			
		}
		writer.flush();
		writer.close();
		System.out.println("Close");
		reader.close();
	}
	
}
