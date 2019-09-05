package p1;
interface Arun
{
	void show();
}
public class Annonumous {

	public static void main(String[] args) {
		
		Arun a = ()-> System.out.println("Hello macha");
		a.show();

	}

}
