package p1;

import java.util.TreeSet;
class Hackerrank
{
	public static void main(String[] args) 
	{
		String s ="welcometojava";
		int k = 3;
		TreeSet<String> s1 = new TreeSet<String>();
		for(int i =0;i<=s.length()-k;i++)
		{
			s1.add(s.substring(i,i+k));
		}
		String first = s1.first();
		String last =s1.last();
		s1.forEach(System.out::println);
		System.out.println(first);
		System.out.println(last);
	}
}
