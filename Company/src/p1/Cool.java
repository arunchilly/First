
package p1;
import java.util.*;

public class Cool {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(8);
		a.add(4);
		Collections.sort(a);
		System.out.println(a);
		System.out.println(Collections.binarySearch(a,8));
		System.out.println(Collections.min(a));
		System.out.println(Collections.max(a));
		System.out.println(Collections.frequency(a,8));
		Collections.rotate(a,1);
		System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);

		
	}

}
