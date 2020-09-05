package ch12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dataoutputstream {

	public static void main(String[] args) {
		double d[]= {1.0,2.0,3.0,4.0,5.0};
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Temp\\double.txt"));
				DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Temp\\double.txt"));){
			for(int i=0;i<5;i++) {
				dos.writeDouble(d[i]);
			System.out.println(dis.readDouble());
			}
			
		}catch(IOException e) {}
		
	}

}
