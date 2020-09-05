package ch2;

public class test {

	public static void main(String[] args) {
//		float f=1.5f;
//		double d=2.8;
//		char c1='a';
//		final int ONE=1;
//		int i1=0x11;
//		boolean b1=true;
//		System.out.print(" "+b1);
		
		int sum=0;
		for(int i=0;i<5;i++) {
			if(i%3==0)
				continue;
			sum+=i;
		}
		System.out.print(sum);

	}
}
