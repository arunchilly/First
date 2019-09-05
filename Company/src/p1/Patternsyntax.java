package p1;

import java.util.Scanner;
import java.util.regex.*;
class Patternsyntax
{
	public static void main(String[] args)
	{
	 Scanner in = new Scanner(System.in);
	 int n=Integer.parseInt(in.nextLine());
	 int i=0;
	 while(n>i)
		{
		 String s = in.nextLine();
		 try{
			 Pattern.compile(s);
			 System.out.println("Valid");
		    }
		catch(PatternSyntaxException e)
			{
			 System.out.println("InValid");
			}
		 i++;
		}

	}
}
