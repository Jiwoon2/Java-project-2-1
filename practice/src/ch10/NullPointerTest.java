package ch10;

class MyDate{
	int year= 2035;
	int month=12;
	int day=25;
}
public class NullPointerTest {

	public static void main(String[] args) {
		
		MyDate d = null;
		try {
		System.out.printf("%d %d %d", d.year,d.month,d.day);
		}catch(NullPointerException e) {
			d = new MyDate();
			System.out.printf("%d %d %d", d.year,d.month,d.day);
		}
	}

}
