package ex02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date date = new Date();
		String strNow1 = date.toString();
		System.out.println(strNow1);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm");
		
		String strNow2 = sdf.format(date);
		System.out.println(strNow2);
	}
}
//p.535