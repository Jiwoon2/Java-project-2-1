package ch12;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class isthere {

	public static void main(String[] args) {
		Path p = new File("C:\\Temp\\o.txt").toPath();
		System.out.print(Files.exists(p));
		
	}

}
