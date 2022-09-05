package bl.com.day5practiceproblems;
import java.util.Scanner;


public class FlipCoin {

	
	public static void main(String[] args) {
		
		flipCoinSimulator();
	}
	
	




   static void flipCoinSimulator()
   
   {
	   						Scanner sc=new Scanner(System.in);
	   						System.out.println("Enter the number of times to flip coin");
	   						int flipCount=sc.nextInt();
	   						System.out.println("Flip count is :" + flipCount);
	   						float headscounter=0;
	   						float tailscounter=0;
	   						
	   						int i=1;
	   						
	   						while(i<=flipCount)
	   						
	   						{
	   							
	   							
	   						double result=Math.random();
	   						
	   						System.out.println("result : " + result);
	   						
	   						
	   						
	   						if(result < 0.5)
	   						{
	   							
	   							System.out.println("its HEADS");
	   							headscounter++;
	   							
	   						}
	   						
	   						else
	   						{
	   							System.out.println("its TAILS");
	   							tailscounter++;
	   						}
	   						
	   						i++;
	   						
	   						}
	   						
	   						
	   						
	   						
	   						System.out.println("headscounter :" + headscounter);
	   						System.out.println("tailscounter :" + tailscounter);
	   						
	   						float percentage= (headscounter/tailscounter);
	   						
	   						System.out.println("Percentage of heads vs tails is = " + percentage );
	   
}
   
   
   
   
}