package p1;

import java.util.Scanner;

public class Tokens {
public static void main(String... arun)
{
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	s = s.trim();
	if(s.length()==0)
		System.out.println(0);
	String s1[]=s.split("[^a-zA-z]+");
	System.out.println(s1.length);
	for(String ok:s1)
		System.out.println(ok);
}
}
