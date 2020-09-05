package w10;

import java.util.Arrays;
import java.util.StringTokenizer;

public class printString {

	public static void main(String[] args) {
		String sentence = new String("you are opening up future doors and possibilities.");
		System.out.print("입력:"+sentence);
		StringTokenizer s = new StringTokenizer(sentence," ");
		String count[] = new String[s.countTokens()];
	
		int c = s.countTokens();
		while(s.hasMoreTokens()) {
			for(int i=0; i<c; i++) {
				count[i]=s.nextToken();
			}
		}
		System.out.println("\n단어 개수:"+count.length);
		
		Arrays.sort(count);
		System.out.print("정렬된 토큰:");
		for(int i=0; i<count.length; i++) {
			System.out.print(count[i]+",");
		}
	}

}
