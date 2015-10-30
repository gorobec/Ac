package home1;

import java.util.Scanner;

public class sportsman {
	
	public static void main (String [] args){
		kilometers();
		
	}
	
	public static void kilometers(){
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your starting athlete's mileage : ");
		double x = sc.nextDouble();
		double y = 0;
		
		while (y <= x){	//inability to enter the smaller final result
			
			System.out.print("Enter your desired final result: ");	//there must be progress, not regress;)
			y = sc.nextInt();
		}
		
		int day = 1;	//on the first day did not increase mileage
		
		while(x < y){
			
			double percent = x * 0.1; 	// каждый день навыки увеличиваются на 10% от прошлого дня, а не от стартового километража
			x += percent;
			day++;
		}
		
		System.out.println("Athlete will achieve the desired result through " + day + " days.");
	}
}
