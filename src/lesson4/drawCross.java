package lesson4;

public class drawCross {
	
	public void draw(int weidth, int high,  String symbol ){
	
		for (int x = 0; x < high; x++) {
			for (int y = 0; y < weidth + 1; y++) {
				if (x == 0 & y == 0){
					System.out.print(" ");
				}
				else if (x == 0 & y == weidth){
						System.out.print(" ");	
				}
				else if (x == high - 1 & y == 0){
					System.out.print(" ");	
			}
				else if (x == high - 1 & y == weidth){
					System.out.print(" ");	
			}
				else{
					System.out.print(symbol);
				}
				
			}
			System.out.println();}
	
	}
}
