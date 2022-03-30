package com.tns.coreJavaAssignmnts;
import java.util.Scanner;

public class SimpleCalc 
{
	public static void main(String[] args) 
	{
		    char oper;
		    Double num1, num2, res;

		    System.out.println("Choose a operator: ");
		    Scanner sc = new Scanner(System.in); 
		    oper = sc.next().charAt(0);

		    System.out.println("Enter the first number: ");
		    num1 = sc.nextDouble();

		    System.out.println("Enter the second number: ");
		    num2 = sc.nextDouble();

		    switch (oper) 
		    {
		      case '+':
		        res = num1 + num2;
		        System.out.println(num1 + " + " + num2 + " = " + res);
		        break;

		      case '-':
		    	res = num1 + num2;
			    System.out.println(num1 + " + " + num2 + " = " + res);
			    break;

		      case '*':
		        res = num1 * num2;
		        System.out.println(num1 + " * " + num2 + " = " + res);
		        break;

		      case '/':
		        res = num1 / num2;
		        System.out.println(num1 + " / " + num2 + " = " + res);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        return;
		    }

		    sc.close();
   }
}

