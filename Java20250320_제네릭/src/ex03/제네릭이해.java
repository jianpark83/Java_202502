package ex03;

class Apple{
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class  Orange{
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class 제네릭이해 {

	public static void main(String[] args) {

		Box aBox = new Box();   //사과
		Box oBox = new Box();   //오렌지

		aBox.setObj("new Apple()");  //=> 문자열로 인식 => error 발생
        oBox.setObj("new Orange()");
        
        Apple ap = (Apple)aBox.getObj();   //error발생
        Orange op = (Orange)oBox.getObj(); //error발생
        
        System.out.println(ap);
        System.out.println(op);
        
	}
}
