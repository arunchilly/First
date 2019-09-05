package p1;
import java.util.*;
public class Honeywell 
{
public static void main(String... honey)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter how many elements wants ");
	Integer n = in.nextInt();
	System.out.println("Enter the element");
	Integer num[] = new Integer[n];
	for(int i=0;i<n;i++)
	{
		num[i]=in.nextInt();
	}
	convert(num);
	printing(num,n);
}
public static Integer[] convert(Integer arr[])
{
	Arrays.sort(arr,new Comparator<Integer>()
			{
		       public int compare(Integer x,Integer y)
		       {
		    	   int c1=Integer.bitCount(x);
		    	   int c2=Integer.bitCount(y);
		    	   if(c1>=c2)
		    		   return 1;
		    	   return -1;
		       }
			}
			);
	return arr;
}

public static void printing(Integer arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
}
}
	