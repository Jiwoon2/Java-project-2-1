package ch5;

public class countChar {
	static int a=0;
	static int countChar(String s, char c) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==c)
					a++;
			}
		return a;
		}
	
	public static void main(String[] args) {
		countChar("hoelelelflflfhoho",'h');
		System.out.print(a);
		
	}

}
