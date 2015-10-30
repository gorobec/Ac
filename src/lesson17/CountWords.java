package lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	String s = br.readLine();
	
	String[] array = s.split(" ");
	System.out.println(array.length);
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	for (int i = 0; i < array.length; i++) {
	
			if (map.containsKey(array[i]))
				map.put(array[i], map.get(array[i]) + 1);
			else
				map.put(array[i], 1);
		
	}
	
	for (Map.Entry <String, Integer> el : map.entrySet())
		System.out.println(el.getKey() + " = " + el.getValue());
	}
}
