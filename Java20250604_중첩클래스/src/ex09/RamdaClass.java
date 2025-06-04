package ex09;

import java.util.function.Function;

/*
 * 멤버로컬클래스 생성
 */

@FunctionalInterface  //이 인터페이스 안에는 추상메소드가 하나만 있다!! 결국, Ramda식을 만들려면 @FunctionalInterface만 가능하다!!
interface Printable{
	void print();
}

class Papers{
	
	private String message;
	
	public Papers(String message) { this.message = message; }
	
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
		
//		Printable p = 이 자리 올 수 있는 대상은? => Printable 구현 클래스만 올 수 있다.
	
		/*
	   Printable p = 	new Printable(){

			@Override
			public void print() {
				System.out.println(message);
			}
			
		};
		return p;
		*/
	/*	return new Printable(){  //익명 클래스
			@Override
			public void print() {
				System.out.println(message);
			} 
		}; */
		
		return () -> System.out.println(message);  //Printable 인터페이스 구현한 대상만 올 수 있다.
		//Ramda식을 쓰는 이유? 위와 같이 코드를 줄일 수 있다.
	}
}

public class RamdaClass {  //Ramda식을 만들려면 인터페이스 안에 추상메소드가 딱 하나만 존재해야 한다.

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
	}
}