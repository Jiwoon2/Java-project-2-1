package ch5;
//가변 길이 변수 개념

public class sum {
	static int sum=0;
	static int um=0;
	public static int sum(int a, int b, int c, int d) {
		return b+c+d;
	}
	public static int sum(int...v) {
		for(int i:v)
			um+=i;
		return um-1;
	}
	public static int sum(int a,int []n) {
		for(int i:n)
			sum+=i;
	return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4));
		int arr[]= {2,3};
		System.out.println(sum(1,arr));
		System.out.println(sum(1,2,3,4,5));
	
	
	}

}
