package ch11;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String2 {

	public static void main(String[] args) {
		String s1 []= {"a","b","c","a"};
		String s2 []= {"c"};
		Set<String> ss1 = new HashSet<>();
		Set<String> ss2 = new HashSet<>();
		List<String> list1 = Arrays.asList(s1);
		ss1.addAll(list1);	//set�� list�� �ٲ� �迭 �־��ֱ�
		List<String> list2 = Arrays.asList(s2);
		ss2.addAll(list2);
		System.out.println(ss1); //���� ���
		System.out.println(ss2);

		System.out.println(ss1.equals(ss2)); //����?
		System.out.println(ss1.containsAll(ss2)); //���������ϳ�?
		Set<String> sum = new HashSet<>();//������ ���� set����.
		
		sum.addAll(list1);//�迭�� �־���
		sum.addAll(list2);
		System.out.println(sum);
	
		ss1.retainAll(list2); //������
		System.out.println(ss1);
		
	}

}
