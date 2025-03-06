package ch01.ex03;


// 클래스명 -> 첫글자 대문자
public class Person {

	//필드, 인스턴스 변수
	private String name;    //private 가 붙으면 클래스 안에서만 사용가능하다. 외부에서 X
	private String phone;   //변수는 외부에서 컨트롤이 안되기 때문에
	private int age;
	
    /*
     * 생성자 : 값 초기화할 목적으로 생성
     */
    
   
    public Person(String n, int a, String p) {      //public 은 외부에 공개가 되겠다
    	name = n;
    	age = a;
    	phone = p;
    }
    
    	 //디폴트 생성자
    public Person() {
    	System.out.println("void Person()");
    	
    }
    
	//메소드, 인스턴스 메소드 (함수)
	 void 나이출력() {
	    System.out.println("나이 : " + age);
	}
	 void 전화번호출력() {
	    System.out.println("전화번호 : " + phone);		
	}
	 void 이름출력() {
	    System.out.println("이름은 : " + name);		

	}
}