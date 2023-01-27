package chap16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	
	public static void main(String[] args) {
		try {
			
			FileInputStream fis= new FileInputStream("c:/Temp/file1.txt");
			int data;
			while((data = fis.read())!= -1) {
				System.out.println(data);
			}
		}	catch (Exception e) {
			e.printStackTrace();	
		}
	}
}
	
