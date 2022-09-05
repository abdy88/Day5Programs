package bl.com.day5practiceproblems;

import java.util.Scanner;

public class EvenOrOdd {
	
	
	public static void main(String[] args) {
		
		System.out.println("Program to Check Whether a Number is Even or Odd");
	
		findingEvenOrOdd();
	
	}
	
	
	
	static void findingEvenOrOdd()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num1=sc.nextInt();
		
		if(num1%2==0)
		{
			System.out.println("number " + num1 + " is an even number");
			
		}
		else
		{
			System.out.println(" number " + num1 + " is an odd number");
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
