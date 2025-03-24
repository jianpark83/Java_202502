package ex03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//단축키 Ctrl+2 => L입력
public class WriteExample {

	public static void main(String[] args) {

		String path = "C:/Data/test3.db";
		
		OutputStream os = null;
		try {
			os = new FileOutputStream(path);
			byte[] arr = {10,20,30,40,50};
			
			os.write(arr,1,3);

			os.flush();			
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}

}
