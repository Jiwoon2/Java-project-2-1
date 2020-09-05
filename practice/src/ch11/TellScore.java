package ch11;

import java.util.Map;
import java.util.Scanner;
import java.util.Hashtable;;
public class TellScore {

	public static void main(String[] args) {
		Map<String,Integer> map = new Hashtable<>();
		map.put("±è¿­",20);
		map.put("¾ßÀÌ",70);
		map.put("È¦¸®",50);
		Scanner in = new Scanner(System.in);
		String name = in.next();
	
		if(map.containsKey(name))
			System.out.println(map.get(name));
	}

}
