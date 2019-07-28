
public class FactorialRandNonR {

	
	public static int factorialNR (int num)
	{
	if (num == 0)
		return 1;
	int i;
	int  fact =1;
		for (i=1;i<=num;i++)
		{
			fact = fact * i;
		}
	
		return fact;
}
	
	
	public static long FactorailRec(int  num) {
		
		
		if(num == 0)
			return 1;
		else
			return (num * FactorailRec(num -1 ));
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorialNR(04));
		System.out.println(FactorailRec(15));
		

	}

}
