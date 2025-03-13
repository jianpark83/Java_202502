package ex04;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();		
		
		method(u1);
		method(s1);
		method(p1);
	}

	static void method(Person p) {
       
		//객체 타입 확인 => instanceof
		if(p instanceof UniversityStudent) {  //p가 참조하고 있는 대상이 Univer..이 맞니?
			((UniversityStudent)p).sleep();
			((UniversityStudent)p).study();
			((UniversityStudent)p).registerCourse();
		}else if(p instanceof Student) {  //p가 참조하고 있는 대상이 Stud..이 맞니?
			((Student)p).sleep();
			((Student)p).study();
		}else {
			p.sleep();
		}
		System.out.println("---------------------------");
       
	}
}
