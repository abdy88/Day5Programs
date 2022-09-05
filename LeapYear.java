package bl.com.day5practiceproblems;
import java.util.Scanner;


public class LeapYear {
	
	
	public static void main(String[] args) {
	
	System.out.println("Checking if a given year is a leap year");
	
	
	LeapYear obj1 = new LeapYear();
	obj1.leapYearCalculator();
	
	
	}
	
	
	
			void leapYearCalculator()
			{
				
				System.out.println("Enter a year in 4 digit format");
				Scanner sc = new Scanner(System.in);
				int year = sc.nextInt();
				System.out.println("User entered year = " + year);
				
				if ( (year%400==0) || ( (year%100 !=0) && (year%4 == 0) ) )
				
				{
					System.out.println("Entered year: " + year + " " + " is a leap year ");
					
				}
				
				else
				{
					
					System.out.println("Entered year: " + year + " " + " is not a leap year ");
					
				}
				
				
			
			}
	
	
}






		
