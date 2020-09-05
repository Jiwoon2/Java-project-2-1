package ch5;
//어렵다..
import java.util.Scanner;

public class histogram {

	public static void main(String[] args) {
		int num;
		Scanner in= new Scanner(System.in);
		int []a=new int[10];
		for(int i=0;i<10;i++) {
			num=in.nextInt();
			if(num>=0)
				a[(num)/10]++; //num-1하던디 왜 인지 모르겠음..
		}
		
		for(int i=0;i<10;i++) {
			System.out.printf("%d~%d: ", (i*10),((i+1)*10-1));
			for(int j=0; j<a[i]; j++) {//a[i]개만큼 *출력
				 System.out.print("*");
			} 
			System.out.print("\n");
		}
		
		
	}

}
