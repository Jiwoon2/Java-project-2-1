package ch5;

import java.util.Arrays;

//오류남..모르겠움..
public class reverse {
//	static int b[];
//	public static int[] reverse(int[] org) {
//		for(int i=0;i<org.length;i++) {
//			for(int j=org.length;j>=0;j--) {
//				b[j]=org[i];
//			}
//		}
//		
//		return b;
//		
//	}
//	메인
//	int a[]= {1,2,3};
//	reverse(a);
	public static int[] reverse(int[] n) {
	        int left = 0;
	        int right = n.length - 1;
	        
	        while (left < right) {
	            int temp = n[left];
	            n[left] = n[right];
	            n[right] = temp;
	            
	            left++;
	            right--;
	        }
	        return n;
	    }

	public static void main(String[] args) {
		int []n= {1,2,3};
		System.out.print(Arrays.toString(reverse(n)));
		
	}

}
