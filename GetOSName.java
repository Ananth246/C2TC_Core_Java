package com.tns.coreJavaAssignmnts;

public class GetOSName 
{
	public static void main(String[] args) 
	{
			 String oper = System.getProperty("os.name");
			    System.out.println("OS Name: " +oper);

			 String oper1 = System.getProperty("os.version");
				System.out.println("OS Version: " +oper1);	
	}

}
