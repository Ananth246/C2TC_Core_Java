package com.tns.coreJavaAssignmnts;

public class LeftTrianglePattern 
{
	public static void main(String[] args) 
	{
		//i is for rows and j for column
					int i,j, row=5;
					
					//outer loop works for rows
					for( i=0; i<row; i++)
					{
						//inner loop work for space
						for( j=2*(row-i); j>=0; j--)
						{
							//print space between two stars
							System.out.print(" ");
						}
						//inner loop for columns
						for( j=0; j<=i; j++)
						{
						
							System.out.print("* ");
						}
	
						System.out.println();
						
					}
				
				
	}

}

