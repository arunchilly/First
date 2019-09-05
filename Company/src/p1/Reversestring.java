package p1;
import java.util.*;
public class Reversestring {

	public static void main(String[] args)
	{
	System.out.println("Enter the string want to reverse");
	Scanner in =new Scanner(System.in);
	String str = in.nextLine();
	String revstr=reverse(str);
	
	System.out.println(revstr);
	
	}
	
	
	private static String reverse(String s)
	{
		String k="";
		int n=s.length();
		if(s.isEmpty())
		{
			return k;
		}
		return s.substring(n-1)+reverse(s.substring(0,n-1));
	}

	

	

	
}
