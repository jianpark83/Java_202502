package ch01.ex01;
/*
 ********* 함수 ***********
 * 입력(매개변수)     출력(반환값)
 *  O              O   -> 03클래스
 *  O              X   -> 02클래스
 *  X              O   -> 04클래스
 *  X              X   -> 01클래스
 *  
 *  함수 정의 -> 함수 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는 것
 *  
 */
		
public class 함수매개변수있고반환값있는경우03 {

	public static void main(String[] args) {     
		
        int result = sum(10, 20);        //이 코드 실행결과는
                                         //int result = 30;  => 이렇게 나온다
        System.out.println(result);
        System.out.println("프로그램 종료!!");
	}
	
    //함수 정의
    public static int sum(int n1, int n2) { 
		//코드 구현
		System.out.println("voud sum(int n1, int n2) 함수 호출!!");
		
		return n1 + n2;   //return 값을 반환한다 (n1+n2 => 정수값)
		                  //return 값 반환은 1개만 가능하다
		                  //반환할 경우 return 이라는 문장이 꼭 있어야 한다
		                  //반환할 경우 return 값을 받을 함수가 존재해야 한다 int result = sum(10,20);
	}
	
}
