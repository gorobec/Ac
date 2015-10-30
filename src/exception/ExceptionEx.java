package loc.base2.exception;

public class ExceptionEx {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		//main(null);
		// TODO Auto-generated method stub
//		System.out.println("1");
//		try {
//			int a = 5/0;
//		} catch(Error e) {
//			System.out.println("6");
//		} catch (Exception e) {
//			System.out.println("7");
//		}
//		System.out.println("5");
//		try {
////			throw new Exception();
//			System.out.println("4");
//		} catch(Exception e) {
//			System.out.println("3");
//		}
//		System.out.println("2");
		
		m(0);
	}

	public static void m(int n) {
		for (int i = 40000000; i < Integer.MAX_VALUE; i+=200000) {
			try {
				Object[] l = new Object[i];
			} catch (Error e) {
				System.out.println("i = " + i);
				return;
			}
			
		}
	}
}
