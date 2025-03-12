package ch01.ex01;

/*
 * ## 상속 전제 조건 ##
 * 1.하위클래스는 상위글래스 자원 접근 가능(단, private 제외)
 * 2.상위클래스는 하위클래스 접근 불가
 */
public class MainClass {

	public static void main(String[] args) {

		C c1 = new C("지리산", "전북 남원", 40);  //C(하위클래스)는 A,B,C 모두 접근 가능
		c1.funcA();
		c1.funcB();
		c1.funcC();
		
		B b1 = new B("남산", "서울");  //B는 상위클래스인 A와 B만 접근 가능, 하위클래스 C는 접근 불가
		b1.funcA();
		b1.funcB();
		
		A a1 = new A("내장산");
		a1.funcA();              //상위클래스 A는 본인것만 접근 가능, 하위클래스 B,C는 접근 불가
		System.out.println("----자동타입변환----");
		
//		B b2 = new B("치악산", "원주");  //A a2 = new B("치악산", "원주");와 같다
//		A a2 = (A)b2;
		
		A a2 = new B("치악산", "원주");  //상위클래스A는 하위클래스B를 참조할 수 있다
		a2.funcA();
//		a2.funcB();   불가하다

		A a3 = new C("한나란", "제주",30);
		a3.funcA();
/*
 * 상위클래스는 하위클래스를 참조할 수 있다.
 * 단, 하위클래스 자원에는 접근 불가
 * 자신 클래스에만 접근 가능
 */				
		System.out.println("----강제타입변환----");
		
		A a5 = new A();
		B b3 = new B();
		a5 = b3;   //타입변환 가능, 자동으로 해줌
		
     /* ## 강제타입변환 불가##
      * A a5 = new A();
      * B b3 = new B();
      * b3 = (B)a5; //이것이 안된다. 대입은 가능하지만, 실행 불가하다. 강제타입변환 불가!! 
      */
   
      //## 강제타입변환 가능##
        A a6 = new B();
        B b4 = new B();
        b4 = (B)a6;		
        
        A a7 = new C();
        B b5;
        b5 = (B)a7;   //변환 가능
        b5.funcA();
        b5.funcB();
        
        A a8 = new C();
        C c2 = (C)a8;  //변환 가능
      //C c2;
      //c2 = (C)a8;   위 한줄로 줄일 수 있다
        
        A a10 = new A();
        B b6 = new B();
        a10 = b6;
        B b7 = (B)a10;  //변환 가능
        
		
	    A a4 = new B("백두산", "함경북도");
	    B b2 = new B("백두산", "함경북도");
		
	}
}
