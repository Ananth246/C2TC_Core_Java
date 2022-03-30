package com.tns.coreJavaAssignmnts;
import java.util.Scanner;
public class PrimeNum 
{
	public static void main(String[] args) 
	{
        int num,i,count; 
        System.out.println("Enter a Number: "); 
        Scanner sc=new Scanner(System.in); 
        num =sc.nextInt(); 
        i=1; 
        count=0; 
         while(i<= num) 
            { 
                if((num%i)==0) 
                   count=count+1; 
                   i++; 
            } 
             if(count==2)
             {
             System.out.println( num +" is a prime number"); 
             }
             else 
             {
                 System.out.println( num +" is not a prime number"); 
             }
             sc.close();

	}

}
