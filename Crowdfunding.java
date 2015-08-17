/*
Name:  Jeilymar Brady
Assignment:   2
Title: Crowdfunding
Course: CSCE144 
Section: 1 - Hauser
Lab Section: 2 - Hauser
Semester: Spring 2014 
Instructor: Hauser
Date: 20 February 2014
Sources consulted:   
Known Bugs: none
Program Description: calculates crowdfunding 
Creativity: total interest is displayed
	    user can choose own compound frequency
Instructions: javac Crowdfunding.java then java Crowdfunding then follow onscreen instructions
*/

import java.util.Scanner;

public class Crowdfunding
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		//identifier declarations
		String name = "Jeily" ;
		String first ;
		char initial ;
		int loc ; 
		double deposit = 0.0 ;
		double value = 0.0 ;
		double interest = 0.03 ; 
		int months = 0 ; 
		int frequency = 0 ;
		
		double FV = 0 ;
		
		//ASK for the contributers full name and display a greeting
		System.out.print("Please enter your fullname (firstname lastname): ") ;
		name = keyboard.nextLine() ;
		loc = name.indexOf(' ') ; 
		initial = name.charAt(loc + 1) ;
		first = name.substring(0, loc) ;
		System.out.println("Hello, " + first + " " + initial + "!") ;
		
		//ASK for the monthly payment and number of months
		System.out.print("How much are you willing to donate each month? ") ;
		deposit = keyboard.nextDouble() ;
		
		System.out.print("How many months would you be willing to do this? ") ;
		months = keyboard.nextInt() ;
		
		//CREATIVITY: Allow the user to select how often interest is compounded
		System.out.print("How often would you like interest to be compounded - monthly(12), biannually(6) or quarterly(4): ") ;
		frequency = keyboard.nextInt() ;
		
		if ( frequency == 12 ) {
			frequency = frequency ;
		} else if (frequency == 6 ) {
			frequency = frequency ;
		} else if (frequency == 4 ) {
			frequency = frequency ;
		} else {
			System.out.println("Please enter 12, 6, or 4" ) ;
			System.exit(0) ;
		}
		
		//COMPUTE the future value using the formula above
		FV = deposit * ( Math.pow((1 + (interest/frequency)), months) - 1 ) / (interest/frequency) ;
		
		//DISPLAY a summary of the payment and value
		System.out.println(first + ", CrowdSource contribution summary: " ) ;
		System.out.println("\t-monthly deposit: $" + deposit ) ;
		System.out.println("\t-annual interest rate: 3.0%" ) ;
		System.out.println("\t-term: " + months/12 + " year(s) and " + months%12 + " month(s)" ) ;
		System.out.println("\t-compound frequency: " + frequency + " times a year" ) ;
		System.out.printf( "Your contribution will be worth $%.2f\n",FV);
		
		//CREATIVITY: Calculate and display the total interest earned on the contributions
		double totalInterest = FV - deposit * months ;
		System.out.printf("Your total interest is: $%.2f\n", totalInterest) ;
		
		
	}		
}
