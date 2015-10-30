package home1;

import java.util.Scanner;

public class bank {
	public static void main (String [] args){
		
		percents();
		
	}
	
	public static void percents(){
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your bank deposit: ");
		double x = sc.nextDouble();
		double y = 0;
		
		while (y <= x){	//inability to enter the smaller final result
			
			System.out.print("Enter the desired result from the contribution of: ");	//there must be progress, not regress;)
			y = sc.nextInt();
		}
		
		System.out.print("Enter the interest rate: ");
		double p = sc.nextDouble();
				
		int years = 0;
		double per = p / 100;
		int nx = (int) x;
		while(nx < y){
			
			double percent = nx * per;
			x += percent;
			years++;
			nx = (int) x;	//reject a penny, rounding to the smaller value. How does the bank;)
		}
		
		System.out.println("Salary of not less than " + y + " hryvnias through " + years + " years.");
		System.out.println("In particular " + nx + " hryvnias");
	}
}

