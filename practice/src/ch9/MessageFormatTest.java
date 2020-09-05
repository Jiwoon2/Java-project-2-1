package ch9;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		Object data[][]= {{"세종대왕",1,"조선"},{"오바마",2,"미국"},{"칭키즈칸",3,"몽고"}};
		String s = "";
		for (int i=0;i<data.length;i++) {
		s = MessageFormat.format("이름: {0} \t번호:{1} \t국적:{2}",data[i]);
		System.out.println(s);
		}
	}
}
