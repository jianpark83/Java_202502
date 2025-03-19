package ex01;

//예외처리 예제

import java.util.Scanner;

public class ExceptionExam02 {

	public static void main(String[] args) {

		  //int num = 10/0;    ArithemticException
			
			int[] arr = new int[5];
			
			arr[4] = 100;
			
	      //arr[5] = 10;    ArrayIndexOutOfBoundsException
			
			String str = null;
			
			if(str != null)
		    System.out.println(str.length());    // NullPointerException
			
			String str2 = "korea";
			
			if(str != null)
				System.out.println(str2.length());    // NullPointerException
		
		}
	}
	//예외 사항이 발생할 경우 if문을 사용해서 막아야 한다