package lesson4;

public class forFor1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x <= 13; x++) {
			for (int y = 0; y < x + 1; y++) {
				if (y == x) {
					System.out.print(y + "; ");
				}
				else{
					System.out.print(y + ", ");
				}
			}
		System.out.println("");	
		}
		System.out.print("\n");	
		for (int x = 13; x >= 0; x--) {
			for (int y = 0; y < x + 1; y++) {
				if (y == x) {
					System.out.print(y + "; ");
				}
				else{
					System.out.print(y + ", ");
				}
			}
			System.out.println();
		}
	}
}
