package ch01.ex03;

public class PersonMain {

	public static void main(String[] args) {
 
		//이름, 나이, 전화번호만 입력하시고,
		//메소드 호출해서 출력
		
		Person person 
		= new Person("안나", 15, "010-1111-2222");   
		                                //객체를 생성하면 생성자를 찾는데 없을 경우
		                                //디폴드 생성자를 만든다. 즉, 자바가 생성자를 생성 (매개변수가 없는거)
		                                //그러나 사용자가 있을경우 생성자를 만들지 않는다
		
		person.이름출력();
		person.나이출력();
		person.전화번호출력();
	
		System.out.println();
		
		Person p2 = new Person("홍길동", 20, "1111-2222");
		p2.이름출력();
		p2.나이출력();
		p2.전화번호출력();
		
	}

}
