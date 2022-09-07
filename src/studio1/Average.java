package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		Scanner bob = new Scanner(System.in);
		System.out.println("Input the first damn number: ");
		int n1 = bob.nextInt();
		System.out.println("Input second numba: ");
		int n2 = bob.nextInt();
		double avg = (double)(n1+n2)/2;
		System.out.println("The avg is: " + avg);
		
	}
}
