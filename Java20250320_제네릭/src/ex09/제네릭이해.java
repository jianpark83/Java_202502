package ex09;

/*
 * 제네릭 메소드
 */

class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
/*class Box<String> {                 =>String 타입 반영
	private String obj;

	public String getObj() {
		return obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}
}
*/

class BoxFactory{
	/*
	 * <T>: 제네릭 메소드 표시,   Box<T>: 반환타입,   T o: 매개변수
	 */
	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.setObj(o);
		return box;
	}
}
/*public static <T> Box<String> makeBox(String o) {   =>String 타입 반영
	Box<String> box = new Box<>();
	box.setObj(o);
	return box;
}
*/

public class 제네릭이해 {

	public static void main(String[] args) {

		Box<String> sbox = BoxFactory.makeBox("Sweet");
		System.out.println(sbox.getObj());
		
		Box<Double> dbox = BoxFactory.makeBox(7.58);
		System.out.println(dbox.getObj());
			
	}
}
//p.581