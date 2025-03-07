package ch02.ex02;

public class Student {
	
	private String name;
	private int grade;  //학년
    private int age;
      
	public Student() {}
    
    public Student(String n, int g, int a){                      // => 1번
    	System.out.println("Student(String n, int a, int p)");
    	name = n;      
    	grade = g;
    	age = a;
    }
    
    void setName(String n) {                                     // => 3번
    	name = n;
    }
    
    String getName(){  //반환타입 필요 String                       // => 4번
    	return name;
    }
    
    void setGrade(int g) {                                      // => 5번
    	grade = g;
    }
    
    int getGrade(){    //반환타입 필요 int                          // => 6번
    	return grade;
    
    }
    void printInfo() {                                           // => 2번
    	System.out.println("이름 : " + name);
    	System.out.println("학년 : " + grade);
    	System.out.println("나이 : " + age);
    	
    }
}
