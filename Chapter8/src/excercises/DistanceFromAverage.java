package excercises;

import java.util.Scanner;

public class DistanceFromAverage 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double total = 0;
		double average;
		int quit = 0;
		double[] arrayNums = new double[20];
	while ( quit != 99999) {
	for(int i = 0; i < arrayNums.length;i++) 
	{
		System.out.println("Enter a Number >> ");
		arrayNums[i] = input.nextDouble();
		
		total = total + arrayNums[i];
	
		
	}
		average = total / arrayNums.length;
		System.out.println(average);
		System.out.println("To quit type 99999");
		quit = input.nextInt();
	}
	}

}
