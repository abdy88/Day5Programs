package bl.com.day5practiceproblems;

import java.util.Scanner;

class Powerof2 {
	
	
	public static void main(String[] args) 
	
		{
			System.out.println("-----Powers of 2----- ");
			
			powersOf2();
			
			}






			public static void	powersOf2()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a whole number less than 31 ");
				int n = sc.nextInt();
				
				for (int i=0;i<=n;i++)
				{
					
					     double power  =Math.pow(2, i);
					     System.out.println(" Power of 2 ^" + i + " = " + power );
				}
				
				
				System.out.println(	'\n' +  "--End of program--");
			}

}