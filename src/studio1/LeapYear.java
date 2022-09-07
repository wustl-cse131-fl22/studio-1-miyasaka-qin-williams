package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner Bob = new Scanner(System.in);
		System.out.println("Type in the Year: ");
		int year = Bob.nextInt();
		//boolean Divisible = year%4 == 0;
		//boolean Hundred = year%100 != 0;
		boolean leap = ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0);
		System.out.println("The year: " + year +" is a leap year: "+ leap);

		
				
	}

}
