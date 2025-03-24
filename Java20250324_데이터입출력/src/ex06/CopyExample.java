package ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) {
		
//	    String originalPath = "C:/Data/dog.jpg";
//	    String targetPath = "C:/Test/dog.jpg";
		
	    String originalPath = "C:/Data/new.txt";
	    String targetPath = "C:/Test/new.txt";
		
//		String originalPath = "C:/Data/git.mp4";
//	    String targetPath = "C:/Test/git.mp4";
	    
	    int count = 0;
		try {
			InputStream is = new FileInputStream(originalPath);
			OutputStream os = new FileOutputStream(targetPath);
			
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				System.out.println(num + " : " + count++);
				if(num == -1) break;
				
			}
			os.flush();
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
//p.793