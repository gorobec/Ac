package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		Date d2 = new Date(1000*60*60*24*17 + d.getTime());
		System.out.println(d2);
		Date d3 = new Date(d.getTime() - 1000*60*60*24*17*100 );
		System.out.println(d3);
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH : mm : ss");
		System.out.println(sdf.format(d));


		
		/*String s = "15-���-2015 20 : 15 : 36";
		String date;
		while (true) {
			BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
			System.out.print("Enter date: ");
			date = reader.readLine();
			try {
				Date newDate = sdf.parse(date);
				break;
			} catch (ParseException e) {
			
				System.out.println("Wrong format...");
			}
		}	
		System.out.println(date);
		
	}
		*/
		
		
	
		
	}

}
