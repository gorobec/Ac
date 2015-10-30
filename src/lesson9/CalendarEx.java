package lesson9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = new GregorianCalendar(2014, Calendar.MAY, 30);
		System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getFirstDayOfWeek());
		cal.setFirstDayOfWeek(Calendar.TUESDAY);
		System.out.println(cal.getFirstDayOfWeek());
		Calendar today = Calendar.getInstance();
		today.add(Calendar.YEAR, -10);
		System.out.println(today.getTime());
		byte[] bytes = new byte[32 * 1024 * 1024];
	}

}
