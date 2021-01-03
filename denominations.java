/*
	A java program that displays the conversion of an amount into 1000’s, 500’s, 100’s, 50’s, 20’s, 10’s, 5’s and 1’s.

	Procedures:
 	 - Get the amount from the user.
 	 - Call a method to process the amount given to determine the conversions.
 	 - Prompt the user with an option to repeat the program.

*/

import java.io.*;

public class denominations
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader agee = new BufferedReader(new InputStreamReader(System.in));
		String conti = "yes";
		int amt;
		do
		{
		    System.out.print("Input amount: ");
		    amt = Integer.parseInt(agee.readLine());
		    
		    denominations(amt);
		    
		    
		    System.out.print("\n\nDo you want to continue, yes or no? ");
		    conti = (agee.readLine());
		    conti = conti.toLowerCase();
		    
		}while(conti.equals("yes"));
		
		
		
	}
	
	public static int denominations(int amt)
	{
	    int onek, fivehundred, onehundred, fifty, twenty, ten, five;
	    
		System.out.print("Denominations: ");
	    onek = amt/1000;
	    System.out.print("\n     1000 - " +onek);
	    amt = amt%1000;
	    
	    fivehundred = amt/500;
	    System.out.print("\n     500 - " +fivehundred);
	    amt = amt%500;
	    
	    onehundred = amt/100;
	    System.out.print("\n     100 - " +onehundred);
	    amt = amt%100;
	    
	    fifty = amt/50;
	    System.out.print("\n     50 - " +fifty);
	    amt = amt%50;
	    
	    twenty = amt/20;
	    System.out.print("\n     20 - " +twenty);
	    amt = amt%20;
	    
	    ten = amt/10;
	    System.out.print("\n     10 - " +ten);
	    amt = amt%10;
	    
	    five = amt/5;
	    System.out.print("\n     5 - " +five);
        amt = amt%5;
        
        System.out.print("\n     1 - " +amt);
	    
	    return 0;
	}
}

/*

	Input Amount: 1887
	Denominations:
		1000 	– 1
		500 	– 1 
		100 	– 3 
		50	– 1 
		20	– 1
		10 	– 1
		5 	– 1 		
		1 	– 2 	


*/