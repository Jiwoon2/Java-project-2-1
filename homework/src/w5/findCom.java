package w5;

import java.util.Scanner;

public class findCom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.print("URL을 입력하세요 : ");
			String s = in.nextLine();
			if(s.equals("bye")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print(s+"은 'com'으로" );
			if(s.endsWith("com")) {
				System.out.println(" 끝납니다.");
			}
			else System.out.println(" 끝나지 않습니다.");
			
			System.out.print(s+"은 'java'를");
			if(s.contains("java")) {
				System.out.println(" 포함합니다.");
			}
			else System.out.println(" 포함하지 않습니다.");
		
		}
		in.close();
	}
}
	
