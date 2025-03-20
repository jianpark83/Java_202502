package ex06;

/*
DBox<Student, String> pBox = new DBox<>();

class DBox<Student, String> {
	private Student left;
	private String right;
	
	public void set(Student left, String right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
*/

class DBox<L,R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

class Person {} 

public class MutiTypeParam {

	public static void main(String[] args) {
        //타입을 제한했다(문자, 정수값)
		DBox<String, Integer> iBox = new DBox<String, Integer>();
		
		iBox.set("홍길동", 20);
		
		System.out.println(iBox);
		
		DBox<Person, String> pBox = new DBox<>();     //뒤쪽 <> 낸용은 빼도 무방
//		Person p = new Person();		
//		pBox.set(p,"한국인");
		pBox.set(new Person(),"한국인");
		
	}
}
