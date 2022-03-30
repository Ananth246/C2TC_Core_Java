package com.tns.coreJavaAssignmnts;

public class RightTrianglePattern 
{
		public static void main(String[] args) 
		{
			//i for row and j for columns
			int i,j, row=5;
			
			for(i=0; i<row; i++)
			{
				for(j=0; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
}

