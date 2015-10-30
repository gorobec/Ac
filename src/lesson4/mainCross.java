package lesson4;

public class mainCross {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enterSymbol sym = new enterSymbol();
		String str = sym.symbol();
		drawCross dr = new drawCross();
		dr.draw(8, 8,  str);
	}

}
