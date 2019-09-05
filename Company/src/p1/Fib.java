package p1;
import java.math.BigInteger;
import java.util.*;
public class Fib {

	public static void main(String[] args)
	{
	System.out.println("Enter the number for fact");	
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();
	int k=fact(n);
	System.out.println(k);
	System.out.println("------------------------------------------");
	System.out.println(fact1(in.nextInt()));
	}
	private static int fact(int f)
	{
		if(f==0||f==1)
		{
			return 1;
		}
		return f*fact(f-1);
	}
	private static BigInteger fact1(int b)
	{ 
	  BigInteger s=new BigInteger("1");
		for(int i=2;i<=b;i++)
		{
			s=s.multiply(BigInteger.valueOf(i));
		}
		return s;
}
}
