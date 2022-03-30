package com.tns.coreJavaAssignmnts;
import java.util.Scanner;

public class SumOfNaturalNum 
{	
	public static void main(String[] args) 
		{
			int num, i, sum = 0;
			System.out.print(" Enter a Number : ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();	
			
			for(i = 1; i <= num; i++)
			{
				sum = sum + i; 
			}	
			
			System.out.println("\n The Sum of Natural Numbers from 1 to " + num + " is " + sum);
			sc.close();
	     }

}
