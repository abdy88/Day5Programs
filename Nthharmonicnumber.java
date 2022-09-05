package bl.com.day5practiceproblems;
import java.util.Scanner;

public class Nthharmonicnumber {
	
	public static void main(String[] args) {
	
	System.out.println("Computing nth harmonic number");
	
	nthHarmonicNumber();
	
	}

	
	
		public static void nthHarmonicNumber()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number greater than 0 whose harmonic series to be found");
				short	n	=sc.nextShort();
				float sum=0;
				for (float i=1; i<=n;i++)
				{
					sum =sum + (1/i);
					
				}
				
				System.out.println("Sum of the harmonic series is = " + sum);
			
		}
	
	
	
	
	
	
	
	
}


