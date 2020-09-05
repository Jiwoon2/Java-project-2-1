package ch5;
//¹è¿­ºñ±³..¾È¹è¿ü´Âµð.. º£²¸¿È
import java.util.Arrays;

public class same {

	public static void main(String[] args) {
		int[] a = { 3, 2, 4, 1, 5 };
	    int[] b = { 3, 2, 4, 1 };
	    int[] c = { 3, 2, 4, 1, 5 };
	    int[] d = { 2, 7, 1, 8, 2 };
	    
	    System.out.println(Arrays.equals(a, b));
	    System.out.println(Arrays.equals(a, c));
	    System.out.println(Arrays.equals(b, b));
	    System.out.println(Arrays.equals(c, d));
	}


}
