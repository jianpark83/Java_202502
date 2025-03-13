package ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();		
		
		method(u1);
		method(s1);
		method(p1);
	}

	//p가 참조하고 있는 대상은 Person 객체이거나 Person 상속한 객체
	static void method(Person p) {
       
		//객체 타입 확인 => instanceof
		if(p instanceof UniversityStudent) {  //p가 참조하고 있는 객체가 Univer..이 맞니?
			UniversityStudent u = (UniversityStudent)p;	//p를 Univer로 강제타입변환
			u.sleep();
			u.study();
			u.registerCourse();
		}else if(p instanceof Student) {  //p가 참조하고 있는 객체가 Stud..이 맞니?, 맞으면 실행 아니면 빠져나옴
			Student s = (Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("---------------------------");
       
	}
}
