package com.Shanklish.TableofPowers;
import java.util.Scanner;
import java.lang.Math;

public class TableofPowers 
{

	public static void main(String[] args) 
	{
		String choice = "y";
		
		do 
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Table of Powers");
			
			System.out.println("Please enter an integer of your choice");
			int eger = scan.nextInt();
			
			String garbage = scan.nextLine();
			
			System.out.println("Number    Square    Cube");
			System.out.println("======    ======    ====");
			
		for ( int i = 0; i <= eger; i++)
		{
			System.out.println(i + "           " + (i*i) + "         " + (i*i*i));
		}
		
			System.out.println("Would you like to try anothe integer? (y/n)");
			choice= scan.nextLine();
			
		} while (choice.equalsIgnoreCase("y"));
		
			System.out.println("K, thanks, bye");
	}

}
