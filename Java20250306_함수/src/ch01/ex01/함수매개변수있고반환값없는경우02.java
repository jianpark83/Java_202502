package ch01.ex01;
/*
 ********* 함수 ***********
 * 입력(매개변수)     출력(반환값)
 *  O              O
 *  O              X
 *  X              O
 *  X              X
 *  
 *  함수 정의 -> 함수 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는 것
 *  
 */
		
public class 함수매개변수있고반환값없는경우02 {

	public static void main(String[] args) {     //진입점, 반드시 있어야 한다!!
     // sum(10);   //함수 호출                    -> int num = 100과 같다 , 실수 입력시 매개변수는 double
        sum(10, 20);        
        
        System.out.println("프로그램 종료!!");
	}
	
    //함수 정의
  //public static void sum(int num) {            //int num -> 매개변수
    public static void sum(int num, int num2) {  //함수와 매개변수 갯수를 맞춰야 한다
		//코드 구현
		System.out.println("voud sum(int num, int num2) 함수 호출!!");
	 // System.out.println(num * num);
		System.out.println(num + num2);
	}
	
}
