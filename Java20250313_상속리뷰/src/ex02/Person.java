package ex02;

public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	Person(){}
	
	Person(String name, int age) {
		   this.name = name;
		   this.age = age;
		}
	
	void sleep() {}       //메소드
	void eat() {}
	
//	@Override    //Object 재정의
//	public String toString() {
//		return name + "," + age + "살 입니다.";
//	}
//메뉴 - Source - Generate toString() 에서 자동생성도 가능, 출력내용은 적절히 본인이 재정의
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "이고, 나이는 " + age + "살입니다.");
	}

}
