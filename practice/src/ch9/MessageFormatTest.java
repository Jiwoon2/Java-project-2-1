package ch9;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		Object data[][]= {{"�������",1,"����"},{"���ٸ�",2,"�̱�"},{"ĪŰ��ĭ",3,"����"}};
		String s = "";
		for (int i=0;i<data.length;i++) {
		s = MessageFormat.format("�̸�: {0} \t��ȣ:{1} \t����:{2}",data[i]);
		System.out.println(s);
		}
	}
}
