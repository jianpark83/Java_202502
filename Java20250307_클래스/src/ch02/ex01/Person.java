package ch02.ex01;

public class Person {
	
    /*
     * 멤버변수 => 값 세팅하는 방법
     * 1. 생성자
     * 2. setter = 멤버 변수값을 변경하는 것
     * 3. getter = 멤버 변수값을 가져오는 것
     */
	
	private String name;  //멤버변수 바꾸지 못하게 private
	private int age;
	private String phone;
	
	//생성자
//    public Person(){              //생성자가 없으면 자바가 임의로 이런식으로 비어있는 디폴드 생성자를 만들어준다
//    	System.out.println("Person()");
//    }
	
    //아래와 같이 생성자가 있으면 위와 같이 비어있는 디폴트 생성자를 자바가 임의로 만들지 않는다
	//그래서 MainPerson에서 "Person p3 = new Person();" 입력하면 에러 발생
	//MainPerson에서 "Person p3 = new Person();" 입력하고자 한다면 맨위에 있는 비어있는 생성자를 생성해야 함 
	//생성자                        
    public Person(String n){              
    	System.out.println("Person(String n)");
    	name = n;
    }
    
	//생성자
    public Person(String n, int a, String p){              
    	System.out.println("Person(String n, int age, String p)");
    	name = n;      //값을 저장하기 위해 아래와 같이 setter 를 이용한다
    	age = a;
    	phone = p;
    }
	
    void setName(String n) {
    	name = n;
    }
    
    void setAge(int a) {
    	age = a;
    }
    
    String getName() {     //값을 불러오기 위해 getter 를 사용, 불러온 값을 출력하기 위해 return 을 사용한다 
    	return name;
    }
    
    int getAge() {
    	return age;
    }
    
	void run() {
		System.out.println(name + " 달리다!");
	}
	
	void sleep() {
		System.out.println(name + " 자다!");
	}
	
	void eat() {
		run();
		System.out.println(name + " 먹다!");
	}
}
