package p1;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DuplicateWords {
	
	public static void main(String args[])
	{
		String regex="\\b(\\w+)(\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Scanner in = new Scanner(System.in);
		int numofsentence = Integer.parseInt(in.nextLine());
		
		while(numofsentence-- >0)
		{
			String input = in.nextLine();
			Matcher m = p.matcher(input);
			
			while(m.find())
			{
				input  = input.replaceAll(m.group(),m.group(1));
			}
			System.out.println(input);
		}
		in.close();
	}
	

}
