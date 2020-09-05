package ch11;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPrint2 {

	public static void main(String[] args) {
//		String names [] = {"갈매기","사슴","다람쥐","라마"};
//		List<String> list = Arrays.asList(names);
//		for(int i=0;i<names.length;i++) {
//			if(list[i])
//			
//		}
		ArrayList<String> a = new ArrayList<>(); //arraylist
		a.add("갈매기");
		a.add("다람");
		a.add("사슴");
		a.add("호랑");
		//List<ArrayList<String>> list = Arrays.asList(a);
		
		String name [] = a.toArray(new String[a.size()]); //배열로 변환
		for(int i=0;i<name.length;i++) {
			if(name[i].length()==2)
			System.out.print(name[i]+"\t");
		}
		
	}

}
