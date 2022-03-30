package com.tns.coreJavaAssignmnts;
import java.util.Scanner;

public class ArmstrongNum 
{
	public static void main(String[] args) 
	{
			 int num,rem,temp,sum=0;
			 System.out.println(" Enter a number: ");   
			 Scanner sc = new Scanner(System.in);
			 num = sc.nextInt();
			   
			 temp = num;
			  	
			 while(num > 0)
			    {
		          rem = num % 10;
			      num = num/10;
			      sum = sum + rem * rem * rem;
			    }
			 if(sum == temp)
			 {
			      System.out.println( sum + " is a Armstrong number");
			 }
			 else
			 {
		              System.out.println( sum + " is not a Armstrong number");
			 }
			 sc.close();
	}

}
  
