package chap16;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) {
		File dir = new File("c:/Temp/Dir");
		File file1 = new File("c:/Temp3333/file1.txt");
		if(dir.exists() == false ) {
			dir.mkdirs();
		}
		try {
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
