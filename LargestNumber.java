package bl.com.day5practiceproblems;
import java.util.Scanner;


public class LargestNumber {

	
	
	public static void main(String[] args) {
	
	System.out.println("---Program to Find the Largest Among Three Numbers---");
	
	calcLargestNumber();
	
	}
	
	
			static void calcLargestNumber()
	
	
			{
				
				Scanner sc= new Scanner (System.in);
				System.out.println("Enter first number : ");
				float num1=sc.nextFloat();
				System.out.println("Enter second number : ");
				float num2=sc.nextFloat();
				System.out.println("Enter third number : " );
				float num3=sc.nextFloat();
				
				
				if ( (num1>num2) && (num1>num3))
				{
					
					System.out.println("num1 is the largest number");
					
				}
				
				
				else if((num2>num1) && (num2>num3))
				{
					System.out.println("num2 is the largest number");
					
					
				}
				else
				{
					System.out.println("num3 is the largest number");
					
				}
				
				
				
			}
	
	
	
	
	
	
	
	
}
