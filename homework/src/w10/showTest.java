package w10;

public class showTest {

	public static void main(String[] args) {
		show(new String("���ѹα�"));
		show(new StringBuilder("KOREA"));
		show(new StringBuffer("!@#"));

	}
	public static void show(Object s) {
		System.out.println(s);
	}
}
