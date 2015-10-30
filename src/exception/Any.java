package loc.base2.exception;

import java.io.IOException;

public class Any {

	public static void main(String[] args) {
//		try {
//		m1();
////		} catch(Exception e) {
////			
////		}
//		System.out.println("1");
		try {
			m5();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("my handle");
		}
		
	}

	public static void m1() {
		throw new UnsupportedOperationException();
	}

	public static void m2() {
		/*NOP*/
	}

	public static void m3() {
		//TODO 
	}

	public static void m4() throws ArithmeticException {
		int a = 5 / 0;
	}

	public static void m5() throws IOException {
		throw new IOException();
//		try {
//			int a = 5 / 0;	
//		} catch (RuntimeException e) {
//			for (StackTraceElement st : e.getStackTrace()) {
//				System.out.println(st);
//			}
//		}
		
//		
//		try {
//			int a = 5 / 0;	
//		} catch (RuntimeException e) {
//			for (int i = 0; i < e.getStackTrace().length; i++) {
//				System.out.println(e.getStackTrace()[i]);
//			}
//		}
		
//		try {
//			int a = 5 / 0;	
//		} catch (RuntimeException e) {
//			System.out.println(e.getStackTrace()[2]);	
//		}
		
//		try {
//			int a = 5 / 0;	
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//		}
//		throw new ArithmeticException();
	}
}
