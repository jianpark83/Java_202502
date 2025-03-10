package ch01.ex01;

public class CarMain {

	public static void main(String[] args) {
        
		Car car1 = new Car();     //객체 생성, 이와 같이 값을 넣지 않는다면 만들 필요가 없다(의미없음)
        car1.displayInfo();       //인자값이 없기 때문에 null이 출력된다.
        System.out.println();
        
        Car car2 = new Car("기아", "K8", "흰색", 200);
        car2.displayInfo();
        System.out.println();
        
        Car car3 = new Car("현대", "소나타");
       
        car3.setColor("흰색");   //setter 를 이용하여 컬러값을 변경할 수 있다
        System.out.println(car3.getCompany());
        car3.displayInfo();
        
        
        
        System.out.println();
        
	}
}
//변수값을 만들 땐 반드시 초기값을 넣는다