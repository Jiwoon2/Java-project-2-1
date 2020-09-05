package ch3;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		 
		System.out.print("gogo : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num))
			System.out.println(num+ "는 소수입니다.");
		else
			System.out.println(num+ "는 아닙니다.");
		
		
		}
		static boolean isPrime(int n) {
			for(int i=2;i<n;i++){
				if( n%i==0) 
					return false;
			
			}
			if(n==1)
				return false;
			return true;
		}
	}


