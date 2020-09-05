package ch7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Queue;



public class ho{
	public static void main(String[] args) throws IOException {
//		try(BufferedReader br=new BufferedReader(new FileReader("C:\\Temp\\org.txt"));){
//			br.lines().forEach(s->System.out.print(s));
//		}catch(IOException e) {
//			
//		}
		Queue<String> q = new LinkedList<>();

		// q.remove();

		//System.out.println(q.poll());
		q.offer("파이");
		q.add("java");
		q.add("c");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q.element());
q.offer("++");
		q.offer("ho");System.out.println(q);
//		System.out.println("바나나를 추가했나요? " + q.offer("바나나"));
	}
}

