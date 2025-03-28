package ex01;

//예외처리 예제

import java.util.Scanner;

public class ExceptionExam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("합 : : " + (num1+num2));
		System.out.println("뺄셈 : : " + (num1-num2));
		System.out.println("곱 : : " + (num1*num2));
		
		int[] arr = new int[5];
		String str = null;    //null값(예외가 발생할 가능성)
		
	    try {
//			System.out.println("나누기 : : " + (num1/num2));   //나눗셈에 0을 넣었을 경우 오류가 발생할 수 있다(예외가 발생할 가능성)
//			arr[5] = 10;   //배열이 부족함(예외가 발생할 가능성)
			System.out.println(str.length());
			
	    }catch(ArithmeticException e) {
	    	System.out.println("0으로 나눌 때 발생");
	    	e.printStackTrace();
	    	System.out.println(e.getMessage());
	    }catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("배열 공간 부족");
	    	e.printStackTrace();
	    	System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("참조값이 없다");
	    	e.printStackTrace();
	    	System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료!");
	}
}