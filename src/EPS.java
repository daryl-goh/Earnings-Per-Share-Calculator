import java.util.Scanner;

import java.text.*;

public class EPS {

	public static void main(String[] args) {
		//Create scanner object whose object reference is stored in the variable called scan, with System.in receiving user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your buying price per share: ");
		//Create variable to store value from the "scan" object, called buyingPrice using double
		double buyingPrice = scan.nextDouble();
		int day = 1;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		while (true) {
			System.out.println("Enter the closing price for the day " + day);
			double closingPrice = scan.nextDouble();
			
			if (closingPrice < 0) break;
			
			double earnings = closingPrice - buyingPrice;
			
			if (earnings > 0.0) {
				System.out.println("After day " + day + " you have earned " + df.format(earnings) + " per share.");
			}
			
			else if (earnings < 0.0) {
				System.out.println("After day " + day + " you have lost " + df.format(earnings) + " per share.");
			}
			
			else {
				System.out.println("After day " + day + " you have no earnings per share.");
			}
			day += 1;
			
		}	
		scan.close();	
			
	}

}


//Create a calculator to calculate Earnings Per Share every day
//Features: Ask for Buying Price, Ask for Closing Price, Calculate Difference in Buying and Closing Price (Earnings).
//If Buying Price < Closing Price, print statement to show Profit per Share
//If Buying Price > Closing price, print statement to show Loss per Share
//If Buying Price = Closing price, print no change
//Add days incrementally starting from Day 1