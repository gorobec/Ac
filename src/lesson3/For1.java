package lesson3;

public class For1 {

	public static void main(String[] args) {
		
		ArmnstrongNumber();
	}
	
	public static void ArmnstrongNumber(){
		
		for(int number = 1; number <7000; number++){
			int pow = 0;
			if(number < 10){
				pow = 1;
			}
			else if(number <100){
				pow = 2;
			}
			else if(number >=100 & number < 1000){
				pow = 3;
			}
			else{
				pow = 4;
			}
			int start = number;
			int summ = 0;
			for(int i = 0; i < pow; i++){
				int oneNumber = number % 10;
				int oneNumberPow = (int)Math.pow(oneNumber, pow);
				summ += oneNumberPow;
				if(summ == start){
					System.out.println(summ);
				}
				number = number / 10;
			}
			
			
		}
	
		
	}
	
}
