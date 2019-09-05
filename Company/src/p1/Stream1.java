package p1;
import java.util.Arrays;
import java.util.List;

public class Stream1 
{
public static void main(String... args)
{
	List<Integer>  al=Arrays.asList(1,2,3,4,5);
	
	//System.out.println(al.stream().map(i->i*2).reduce(0,(c,e)->c+e));
	
	  System.out.println(al.stream().map( i->i*2).reduce(0,(i,j)-> i+j));
}
}
