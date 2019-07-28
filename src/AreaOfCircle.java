package src;

import java.util.Scanner;

public class AreaOfCircle {

	
	
		public  static  double circle(int r) {
			
			
			System.out.println("enter the radius");	
			Scanner in = new Scanner(System.in);
			r = in.nextInt();	
			
			
			double	A =3.14*r*r;
			
			return A;
			
			

			
			
		}
	
	public static void main(String[] args) {
	
		System.out.println(circle(0));
		
		
		
	}

}
