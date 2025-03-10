package ch01.ex02;

public class SwitchExam01 {

	public static void main(String[] args) {

		/*
		 * 학점(grade)
		 * 90 : A
		 * 80 : B
		 * 70 : C
		 * 60 : D
		 * 59이하 : F
		 */
		
		int grade = 100;        //예) 값이 200일 경후 나눈후 결과값이 조건에 맞는게 없기 때문에 바로 default로 넘어간다
		
		switch(grade/10) {      //나눠서 나머지 버리고 몫을 가지고 아래의 조건과 비교한다
		case 10:                //정수, 문자, 문자열 => 실수는 올 수 없다
		System.out.println("A");
		    break;              //break가 없으면 아래 결과값을 모두 출력한다
		case 9:                 //그렇기 때문에 break가 꼭 필요하다
		System.out.println("A");
	        break;
		case 8:
		System.out.println("B");
	        break;
		case 7:
		System.out.println("C");
		    break;
		case 6:
		System.out.println("D");
	        break;
		default:
		System.out.println("F");
		}
					
		System.out.println("종료");
	
	}
}
