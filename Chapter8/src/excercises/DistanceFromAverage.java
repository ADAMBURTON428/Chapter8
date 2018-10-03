package excercises;

import java.util.Scanner;

public class DistanceFromAverage 
{

	public static void main(String[] args) 
	{
	double[] arrayNums = new double[20];
	
	Scanner input = new Scanner(System.in);
	int quit = 0;
	int i = 0;
	double total = 0;
	while (quit != 99999) {
	System.out.println("Enter a number >> ");
	arrayNums[i] = input.nextInt();
	
	total = total + arrayNums[i];
	System.out.println("To quit type 99999");
	quit = input.nextInt();
	
	

	}
	}

}
