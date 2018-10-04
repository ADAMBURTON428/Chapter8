package excercises;

import java.util.Scanner;

public class ArrayMethodDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double[] arrayNums = new double[10];
		
		for(int i = 0; i < arrayNums.length;i++) 
		{
			System.out.println("Enter a Number >> ");
			arrayNums[i] = input.nextDouble();

			displayIntegers(arrayNums[i]);
			displayReverse(arrayNums[i]);
			displaySum(arrayNums[i]);
			displayAverage(arrayNums[i]); 
		}
	}
	public static void displayIntegers(double arrayNums) 
	{
		for(int j = 0; j < arrayNums;j++) {
			System.out.println(j);
		}
	}
	public static void displayReverse(double arrayNums) 
	{
		
	}
	public static void displaySum(double arrayNums) 
	{
		
	}
	public static void displayAverage(double arrayNums) 
	{
		
	}
}
