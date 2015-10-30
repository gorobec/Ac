package lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList <Train> trains = new ArrayList();
		for (int i = 1; i <= 100; i ++) {
			trains.add(new Train (i));			
		}
		
		Station station = new Station(trains);
		
		saveObject(station);
		restoreObject();
		

	}

	private static void saveObject(Station station) {
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream("../Vorobiei/src/lesson19/station.txt");
			oos = new ObjectOutputStream(os);
			oos.writeObject(station);
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
	}

	private static void restoreObject() {
		InputStream is = null;
		ObjectInputStream ois = null;
		
		try {
			is = new FileInputStream("../Vorobiei/src/lesson19/station.txt");
			ois = new ObjectInputStream(is);
			Station rec_station = (Station)ois.readObject();
			System.out.println("file rec");
			rec_station.info();
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
