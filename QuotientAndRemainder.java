package bl.com.day5practiceproblems;
import java.util.Scanner;


public class QuotientAndRemainder {
	
	
	public static void main(String[] args) {
	
	System.out.println("Program to calculate quotient and remainder");
	quotientAndRemainder();

	
	}
	
	
				static void quotientAndRemainder()
				{
					
					float quotient=0;
					float remainder=0;
					Scanner sc=new Scanner(System.in);
					
					System.out.println("Enter dividend : ");
					
					float dividend=sc.nextFloat();
					
					System.out.println("Enter divisor : ");
					float divisor=sc.nextFloat();
					
					quotient = dividend/divisor;
					remainder= dividend % divisor;
					
					System.out.println("quotient of " + dividend  + "/" + divisor + " = " + quotient);
					System.out.println("remainder of " + dividend  + "/" + divisor + " = " + remainder);
					
				}
	
	
	
	
	
	
	
	
	

}
