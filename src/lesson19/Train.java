package lesson19;

import java.io.Serializable;

public class Train implements Serializable{
	
	private int name;

	public Train(int name) {
		
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public int getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(int name) {
		this.name = name;
	}
	
	public String toString() {
		
		return "My number is " + name;
	}

}
