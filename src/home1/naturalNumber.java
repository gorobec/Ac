package home1;

import java.util.Scanner;

public class naturalNumber{

	public static void main(String[] args){
		numberInput();
	}
	
	public static void numberInput(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to which you want to keep score: ");
		int n = sc.nextInt();
		System.out.println("Perfect squares of natural numbers look like this: ");
		
		int power = 0;
		
		for(int i = 0; i < n; i++){
			
			power = (int)Math.pow(i, 2);
			
			if(power > n){	//out of the loop, before the displayed number is larger than allowed
				break;
			}
			
			System.out.println(power);
		}
	}
}
