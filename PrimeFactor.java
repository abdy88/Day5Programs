package bl.com.day5practiceproblems;
import java.util.Scanner;


public class PrimeFactor {

	
	
	
	
	public static void main(String[] args) {
	
	
		 primeFactorization();
	
	
		}
	
	
	
		
	
	
	static void primeFactorization()
		{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:  ");
		int n=sc.nextShort();
		
		while(n % 2 == 0)
		{
			System.out.println( 2 + " ");
			n=n/2;
				
		 }
		
		
		
		
		for (int i=3; i<=Math.sqrt(n); i+=2)
			{
			
			
			while(n%i==0)
			{
				System.out.println(i + " ");
				n/=i;
				
				
			}
			
			}
			
			
			if (n>2)
				{
				
				System.out.println(n);
				
				}
			
			
			
		}
		
		
			
		
	}
	
	
	
	

