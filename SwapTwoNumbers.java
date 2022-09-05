package bl.com.day5practiceproblems;
import java.util.Scanner;


public class SwapTwoNumbers {
	
	
	
	public static void main(String[] args) {
	
	System.out.println("Program to swap two numbers");
	swapping();
	
	
	}

	
	
				static void swapping()
				{
					float temporary=0;
					
					Scanner sc=new Scanner(System.in);
					
					System.out.println("Enter first number");
					float num1=sc.nextFloat();
					System.out.println("Initial value of num1 :" + num1);

					System.out.println("Enter second number");
					float num2=sc.nextFloat();
					System.out.println("Initial value of num2 :" + num2);

					
									temporary=num1;
									num1=num2;
									num2=temporary;
					
					System.out.println("New value of num1 : " + num1);
					System.out.println("New value of num2 : " + num2);
					
					System.out.println("---End of program---");
					
				}
	
	
	
	
	
	
	
	
	
	
	
}
