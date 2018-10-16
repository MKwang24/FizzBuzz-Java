// Your solution to MIE250 Project 1 goes here
// This is the "default package" hence there should be *no* line that starts with "package ...;"
// Your solution to MIE250 Project 1 goes here
// This is the "default package" hence there should be *no* line that starts with "package ...;"
import java.io.*;

public class FizzBuzz {

	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException
		
	{
	do {
		System.out.print("   JAVA FIZZBUZZ PROGRAM\r\n");
		// Ask for and Assign Fizz number
		double fizz = getNonegDouble("Enter Fizz number: ");
		
		// Ask for and Assign Buzz number
		double buzz = getNonegDouble("Enter Buzz number: ");
		
		// Ask for and Assign starting number
		System.out.print("Enter starting number: ");
		double sta = Double.parseDouble(cin.readLine());
		
		// Ask for and Assign ending number
		System.out.println("Enter ending number: ");
		double end = Double.parseDouble(cin.readLine());
		while (end<sta) {
			System.out.print("ERROR: Ending number cannot be less than starting number! Try again:");
			end = Double.parseDouble(cin.readLine());
		}
// using for loop to generate the list of numbers and substitute fizz and buzz in 
		
		for (int i =1 ; i <= (end-sta+1);i++)
			{
			System.out.print(Math.round(sta+i-1));
			System.out.print(". ");
			if (((sta+i-1)% fizz == 0)&&((sta+i-1)% buzz == 0)) {//test if number satisfies both fizz and buzz
				System.out.println("FizzBuzz");
			}
			else if ((sta+i-1)% buzz == 0) {//test if number satisfies buzz
				System.out.println("Buzz");
			}
			else if ((sta+i-1)% fizz == 0) {//test if number satisfies fizz
				System.out.println("Fizz");
			}
			else {
				System.out.println(Math.round(sta+i-1));//output the number if none of the conditions above are satisfied
			}
			}	
	}while (true);
	}
	
        
	public static double getNonegDouble(String prompt) throws NumberFormatException, IOException{
		int x;
		boolean valid;
		System.out.print(prompt); 
		 do {
			 valid = true;
			 x = Integer.parseInt(cin.readLine()); 
		  if (x ==0) {
			  System.out.println("\nThe end.");
			  System.exit(0);
		  } 
		  else if (valid && x<0) {
			  System.out.print("ERROR: Negative numbers are not allowed! Try again:");
			  valid = false;
		  }
		
		} while (!valid);
		return x;
		}// end of getNonegDouble()

}