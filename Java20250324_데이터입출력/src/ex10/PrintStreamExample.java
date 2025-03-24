package ex10;


import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/Data/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다. ");
		
		ps.printf("| %6d | %-10s | %10S | \n", 1, "홍길동","도적");
		ps.printf("| %6d | %-10s | %10S | \n", 2, "김자바","학생");
		
		ps.flush();
		ps.close();	
	}
}
//p.809
//C:/Data/printstream.txt 파일이 생성되고 위 프린트 내용이 
//텍스트 파일에 출력된다