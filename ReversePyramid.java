package com.tns.coreJavaAssignmnts;

public class ReversePyramid 
{
	public static void main(String[] args) 
	{
		int i,j,k,row = 5;
		  
	    for( i = 0; i <= row - 1; i++)
	       {
		  for( j = 0; j <= i; j++)
		     {
		       System.out.print(" ");
		     }
		  for( k = 0; k <= row - 1 - i; k++)
		     {
		       System.out.print("*"+" "); 
		     }
		  System.out.println();
	       }

	 }

}
