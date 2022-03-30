package com.tns.coreJavaAssignmnts;

public class DiamondPattern 
{
	public static void main(String[] args) 
	{
		  int i,j,k,row = 5;
		  
		  for( i=1; i<=row; i++)
		   {
			  for( j=row; j>i; j--)
			    {
				    System.out.print(" ");
			    }
			  for( k=0; k<i*2-1; k++)
			    {
				    System.out.print("*");
			    }
			  System.out.println();
		   }
		  
		  for( i=1; i<=row-1; i++)
		    {
			    for( j=0; j<i; j++)
			     {
				     System.out.print(" ");
			     }
			    for( k=(row-i)*2-1; k >0 ; k--)
			     {
				     System.out.print("*");
			     }
			    System.out.println();
		    }

	}

}
