/**

 * Program name: Bottling_Calculator.java
 * Purpose: A program to calculate how many bottles are required to make a batch of
 * 					a certain drink.
 * Coder: Jumar Tabangin, 1169267
 * Date: Dec 23, 2023

PSEUDO-CODE
-Create intro to program + scanner object + inputs
-Calculate number of bottles needed + if there is any leftover bottles
-output results.

 **/
import java.util.*;
public class Bottling_Calculator
{

	public static void main(String[] args)
	{
		// code here <3 
					//STEP 1: CREATE INTO + INPUTS
		
		//Make Scanner object
		Scanner input = new Scanner(System.in);
		
		//Introduction to program
		System.out.println("Hello! And welcome to the Home Brew Bottling Program!");
		System.out.println("\nThis program was made to calculate the number of bottles required to bottle\na batch of home brew.");
		
		//user inputs
		System.out.println("\nPlease enter for the following. . .");
		System.out.print("Enter the total amount of home brew in liters: ");
		int brewAmountL = input.nextInt();
		
		System.out.print("Enter the bottle size in mililiters: ");
		int bottleSize = input.nextInt();
		
		//flush!
		input.nextLine();
		
		System.out.print("Enter the name of your home brew: ");
		String brewName = input.nextLine();
		
		
					//STEP 2: CALCULATIONS
		//Declaration of variable independence
		final int ML_PER_L = 1000;
		int numberOfBottles;
		int batchSize;
		int leftOvers;
		
		//Calculate batch size 
		batchSize = brewAmountL *  ML_PER_L;
		
		//Calculates number of bottles needed
		numberOfBottles = batchSize / bottleSize;
		
		//Calculates if there is any extra left-over
		leftOvers = batchSize - (numberOfBottles * bottleSize);
		
		
					//STEP 3: OUTPUTS + SCANNER OBJECT CLOSE
		System.out.println("\nYou will need " + numberOfBottles + " for your batch of " + brewName + ".");
		System.out.println("There will be " + leftOvers + " mL of " + brewName +"left over, unbottled.");
		
		
		//housekeeping
		input.close();
	}//end main

}
//end class