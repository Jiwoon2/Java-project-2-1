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
		ss1.addAll(list1);	//set에 list로 바꾼 배열 넣어주기
		List<String> list2 = Arrays.asList(s2);
		ss2.addAll(list2);
		System.out.println(ss1); //원소 출력
		System.out.println(ss2);

		System.out.println(ss1.equals(ss2)); //같냐?
		System.out.println(ss1.containsAll(ss2)); //전부포함하냐?
		Set<String> sum = new HashSet<>();//합집합 넣을 set만듦.
		
		sum.addAll(list1);//배열들 넣어줌
		sum.addAll(list2);
		System.out.println(sum);
	
		ss1.retainAll(list2); //교집합
		System.out.println(ss1);
		
	}

}
