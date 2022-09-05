package bl.com.day5practiceproblems;

import java.util.Scanner;


public class VowelOrConsonant {


	public static void main(String[] args) {
	
	System.out.println("Program to Check Whether an Alphabet is Vowel or Consonant");
	checkVowelOrConsonant();
	
	}
	
	
	
	
			static void checkVowelOrConsonant()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter any alphabet :");
				
				char character=sc.next().charAt(0);
				
				
				if ((character == 'a') || (character=='e') ||(character=='i') ||(character=='o') ||(character=='u'))
				{
					
					System.out.println("The ALphabet " + character + " is a vowel");
					
				}
				
				else
				{
					System.out.println("The ALphabet " + character + " is a consonant");
					
				}
				
				
			}
	
	
	
	
	
	
	
	
}
