package home1;

import java.util.Scanner;

public class naturalNumber2 {

	public static void main(String[] args){
		numberInput();
	}
	
	public static void numberInput(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to which you want to keep score: ");
		int n = sc.nextInt();
		System.out.println("Perfect squares of natural numbers look like this:");
		
		int power = 0;
		int i = 1;	//why it is impossible initiate a variable in the middle of a cycle ??
		
		while (power <= n){
			
			
			power = (int)Math.pow(i, 2);
			
			if (power > n)
				break;
			
			System.out.println(power);
			i++;
		}
	}
}


