package ex02;

public class MainPerson {

	public static void main(String[] args) {

		UniversityStudent u1 = 
				new UniversityStudent("지리산", 20, "한체대", 3, "전산");
		u1.introduce();
		
		Person p1 = new Person("내장산", 20);
		p1.introduce();   //본인 메소드만 사용가능
		
		Student s1 = new Student("치악산", 15, "천호초등학교", 3);
		s1.introduce();
		
		System.out.println("-----------------------------------------");
	    System.out.println(p1);
	    System.out.println(u1.toString());//object가 가지고 있는
	    System.out.println(s1.toString());
	    
	    System.out.println("--------상위클래스는 하위클래스 참조 가능---------");
	    
	    Person p2 = new Student();  // -> Person은 Student 참조는 가능
	  //p2.introduce();             // -> 접근은 불가능, 본인(Person) 영역만 접근 가능
	    Student s2 = new UniversityStudent();
	    
	    System.out.println("--------하위클래스는 상위클래스 참조 불가---------");
	    
	  //Student s3 = new Person();  ->허용하지 않는다
	  //왜? 하위클래스의 기능을 제한시키는 건 허용하지 않는다
	    
	    System.out.println("------하위클래스가 상위클래스 참조 가능한 경우------");	
	    
	    Person p4 = new Student();
	    Student s4 = (Student)p4;    //가능
	  //왜? 기능의 제한이 없다  
	    
	  //p4 = new Person();  //메모리 공간에 Person만 생성
	  //s4 = (Student)p4;   
	  //불가!! (p4의 메모리 공간이 Person만 생성이 되어 있기 때문에 Student 대입하더라도 실행불가
	  //기능의 제한이 생기기 때문에
	    
	    p4 = new UniversityStudent();
	    s4 = (Student)p4;     //가능
	    
	    System.out.println("--------다형성 ==> 자동변환 + 오버라이딩--------");	 
	  //참조하고 있는 대상에 따라 출력된다
	    Person p5 = new Person();
	    p5.sleep();
	    p5.introduce();
	    System.out.println(p5);
	    
	    p5 = new Student();
	    p5.sleep();
	    p5.introduce();
	    System.out.println(p5);
	    
	    p5 = new UniversityStudent();
	    p5.eat();
	    p5.introduce();
	    System.out.println(p5);
	    
	}

}
