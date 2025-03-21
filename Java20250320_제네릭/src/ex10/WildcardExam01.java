package ex10;

class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return (String)obj;
	}
}

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	
	public static void peekBox1(Box<? extends B> box) {      //상한 제한 --> 목적 : 읽기전용, 쓰기 금지
//		System.out.println(box);
		box.getObj();
//		box.setObj(box);
	}
	
	public static void peekBox2(Box<? super C> box) {       //하한 제한 --> 목적 : 쓰기전용, 읽기 금지
//		System.out.println(box);
//		box.setObj(box);	
	}
}

public class WildcardExam01 {

	public static void main(String[] args) {

		Box<Object> box = new Box<>();
//		box.setObj(new A());
		
		Unboxer.peekBox2(box);
	}
}
