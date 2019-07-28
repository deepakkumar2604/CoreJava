package src;

import java.util.Scanner;

public class FarenheitToCelsius {

	
	
	
	public static void main(String[] args) {
	
	System.out.println("Enter the Fareinheit");
	
	
	//C= (5/9)*(F-32)
	float F;
	double C;;
	
	
	Scanner FarIn = new Scanner(System.in);
	F = FarIn.nextFloat();
	
		C= (5/9.0) * (F-32);	
		
		System.out.println(C);	
		
		
		
	}

}
