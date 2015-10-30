package lesson19;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Station implements Serializable{
	
	private ArrayList<Train> trains;

	public Station(ArrayList<Train> trains) {
		this.trains = trains;
	}

	/**
	 * @return the trains
	 */
	public ArrayList<Train> getTrains() {
		return trains;
	}

	/**
	 * @param trains the trains to set
	 */
	public void setTrains(ArrayList<Train> trains) {
		this.trains = trains;
	}
	
	
	public void info() {
		
		for (int i = 0; i < trains.size(); i++) {
			System.out.println(trains.get(i));
		}
	}
	
	

}
