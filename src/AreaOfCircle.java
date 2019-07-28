package src;

import java.util.Scanner;

public class AreaOfCircle {

	
	
		public  static  double circle(int Radius) {
			
			
			System.out.println("enter the radius");	
			Scanner in = new Scanner(System.in);
			Radius = in.nextInt();	
			
			
			double	A =3.14*Radius*Radius;
			
			return A;
			
			

			
			
		}
	
	public static void main(String[] args) {
	
		System.out.println(circle(0));
		
		
		
	}

}
