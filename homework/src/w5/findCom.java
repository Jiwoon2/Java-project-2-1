package w5;

import java.util.Scanner;

public class findCom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.print("URL�� �Է��ϼ��� : ");
			String s = in.nextLine();
			if(s.equals("bye")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print(s+"�� 'com'����" );
			if(s.endsWith("com")) {
				System.out.println(" �����ϴ�.");
			}
			else System.out.println(" ������ �ʽ��ϴ�.");
			
			System.out.print(s+"�� 'java'��");
			if(s.contains("java")) {
				System.out.println(" �����մϴ�.");
			}
			else System.out.println(" �������� �ʽ��ϴ�.");
		
		}
		in.close();
	}
}
	
