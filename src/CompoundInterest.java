package src;

public class CompoundInterest {

	public static void main(String[] args) {
	
		
		
		//a=p*(1+r)^t
		
		
		double p =5000;
		double r =5;
		double i = r/100;
		double n = 12;
		double t = 10;
		
		double a;
		
		
		
		a =  p * Math.pow(1+0.05, t);
				
		System.out.printf("%.2f" ,a);

		
		
		
		
		
		
	}

}
