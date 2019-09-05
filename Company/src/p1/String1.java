package p1;
import java.util.Scanner;
public class String1 {
	public static void main(String... arun)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s = in.nextLine();
		String a[]=s.split(" ");
		String t="";
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				t = t +" "+rev(a[i]);
			}
			else
			{
				t=t+" "+a[i];
			}
		}
		t = t.trim();
		System.out.println(t);
	}
	public static String rev(String q)
	{
		
		String g =new StringBuffer(q).reverse().toString();
		return g;
	}

}
