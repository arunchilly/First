package p1;
import java.util.*;
class Cricketer
{
	String name;
	int run;
	float avg;
	Cricketer(String name,int run,float avg)
	{
		this.name=name;
		this.run=run;
		this.avg=avg;
	}
	public String toString()
	{
		return "Cricketer["+name+" "+run+" "+avg+"]";
	}
	
}
public class Comparator1 {

	public static void main(String[] args) {
		ArrayList<Cricketer> al = new ArrayList<>();
		al.add(new Cricketer("Kholi",2000,52.2f));
		al.add(new Cricketer("Dhoni",3000,50.2f));
		al.add(new Cricketer("sachin",1000,49.2f));
		Collections.sort(al,(x,y)->(x.run>y.run)?1:-1);
		al.forEach(System.out::println);

	}

}
