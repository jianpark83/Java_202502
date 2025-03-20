package ex08;

/*
 * T : 타입인자
 * T extends Number => T에게 전달되는 대상은 Number이거나 Number의 하위클래스만 전달가능(타입에 제한을 둘 수 있다)
 */
class Box<T extends Number> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class 제네릭이해 {

	public static void main(String[] args) {

		Box<Integer> iBox = new Box<>();
		iBox.setObj(10);
		
		Box<Double> dBox = new Box();
		dBox.setObj(10.2);
		
//		Box<String> sBox = new Box();  => 이거 안됨. String이  Number가 가진 하위클래스가 아니기 때문에
		
					
	}
}
//p.581