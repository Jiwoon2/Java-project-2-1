package ch11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayScore {

	public static void main(String[] args) {
		int best = 0;
		char grade;
		int score = 0;
		ArrayList<Integer> scores = new ArrayList<>();//�����迭�Ҵ�
		
		Scanner in = new Scanner(System.in);
		String inputStr = in.nextLine();
		StringTokenizer st = new StringTokenizer(inputStr," ");
		int num = st.countTokens();
		System.out.println(num+"��");//�������
		
		while(st.hasMoreTokens()) {
			score =Integer.valueOf(st.nextToken());
			scores.add(score); //�迭�� �ϳ��� �־��ֱ�
		}
		for(int s:scores)
			System.out.print(s+" ");
		
		for(int i=0;i<scores.size();i++) {
			if(best<scores.get(i))
				best = scores.get(i);
		}
		System.out.println("\n�ְ� ������"+best);
		
		
		for(int i=0;i<scores.size();i++) {
			score = scores.get(i).intValue();
			if(best-10<=score)
				grade='A';
			else if(best-20<=score)
				grade='B';
			else grade='C';
			System.out.println(i+1+"�� �л� ������"+scores.get(i)+"�̰� �����"+grade);
		}
		
		
	}

}
