package ch11;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPrint2 {

	public static void main(String[] args) {
//		String names [] = {"���ű�","�罿","�ٶ���","��"};
//		List<String> list = Arrays.asList(names);
//		for(int i=0;i<names.length;i++) {
//			if(list[i])
//			
//		}
		ArrayList<String> a = new ArrayList<>(); //arraylist
		a.add("���ű�");
		a.add("�ٶ�");
		a.add("�罿");
		a.add("ȣ��");
		//List<ArrayList<String>> list = Arrays.asList(a);
		
		String name [] = a.toArray(new String[a.size()]); //�迭�� ��ȯ
		for(int i=0;i<name.length;i++) {
			if(name[i].length()==2)
			System.out.print(name[i]+"\t");
		}
		
	}

}
