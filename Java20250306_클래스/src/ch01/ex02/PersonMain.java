package ch01.ex02;

public class PersonMain {

	public static void main(String[] args) {
 
		//이름, 나이, 전화번호만 입력하시고,
		//메소드 호출해서 출력
		
		Person person = new Person();
		  		
		person.name = "안나";
		person.age = 15;
		person.phone = "010-1111-2222";
	  
		person.이름출력(person.name);
		person.나이출력(person.age);
		person.전화번호출력(person.phone);
				
	}

}
