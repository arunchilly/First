package p1;
import java.util.ArrayList;

public class Time {

	public static void main(String...time)
	{
		double start = System.currentTimeMillis();
		ArrayList al=new ArrayList();
		for(int i=1;i<=100;i++)
		{
			al.add(i);
		}
		al.forEach(System.out::println);
		double stop = System.currentTimeMillis();
		System.out.println((stop-start)/60+" mins");
	}
}
