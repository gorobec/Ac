package lesson4;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numberInput(int first, int last){
		int result = 0;
		for(int i = first; i < last; i++) {
			if( i % 5 ==0 && i % 9 == 0) {
				result++;
			}
		}
		return result;
		
	}
	

}
