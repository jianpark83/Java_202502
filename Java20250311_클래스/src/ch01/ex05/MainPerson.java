package ch01.ex05;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("설악산", 50);  
		Person p2 = new Person("지리산", 30);
		
		System.out.println(p1.dispalyInfo());
	    
		p1.count += 100;   //p1.count =  p1.count + 100
		
		System.out.println(p1.count);
		System.out.println(p2.count);
		
		System.out.println(Person.count);  //이 방식 주로 사용(변수)
		
		p1.func();  //일반메소드인지 정적메소드인지 직관적으로 알 수 없기 때문에 코드를 살펴봐야 한다
		p2.func();
		
		Person.func();  //이 방식 주로 사용(메소드)
	}
}


//저 방식을 주로 사용하는 이유는 직관적으로 알 수 있기 때문에