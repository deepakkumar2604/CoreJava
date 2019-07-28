
public class TwoDArrayConcepts {

	public static void main(String[] args) {
		
		
		int dta[][]= new int[3][4];
		
		  dta [0][0]=0;
		  dta [0][1]=1;
		  dta [0][2]=2;
		  dta [0][3]=3;
		  dta [1][0]=4;
		  dta [1][1]=5;
		  dta [1][2]=6;
		  dta [1][3]=7;
		  dta [2][0]=8;
		  dta [2][1]=9;
		  dta [2][2]=10;
		  dta [2][3]=11;
		  
		  System.out.println(dta.length);
		  System.out.println(dta[0].length);
		  System.out.println(dta[0][1]);
		  
		  System.out.println("************************");
		  
		  
		  for ( int row=0;row<dta.length;row++)
			  for (int col=0; col<dta[0].length;col++)
				  
		  System.out.println(dta[row][col]);
		  
		  
		  
		  
	}

}
