package ex01;

class Student {

	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.no == other.no && this.name.equals(other.name);
	}
}

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student(10, "홍길동2");
		Student student2 = new Student(10, "홍길동2");
		
		System.out.println(student1.equals(student2));
	}

}
