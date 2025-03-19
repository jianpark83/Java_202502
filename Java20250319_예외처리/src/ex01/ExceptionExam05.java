package ex01;

//예외처리 예제

import java.util.Scanner;

public class ExceptionExam05 {

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
	    	
			System.out.println("나누기 : : " + (num1/num2));
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
		}catch(Exception e)	{       //Exception => 최상위 예외 클래스라 맨 아래 넣는건 상관없지만, 다른 예외 클래스 위에 위치하면 오류발생
	    	e.printStackTrace();
		}finally {                  //finally => 예외가 발생 여부와 상관없이 무조건 실행
			
		}
	    
		System.out.println("프로그램 종료!");
	}
}