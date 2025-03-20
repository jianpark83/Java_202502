package ex02;

public class StringBuilderExample {

	public static void main(String[] args) {

		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
//				.delete(3, 4)
				.toString();
		
		System.out.println(data);
		
		String data2 = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5)   //3에서 5전까지 삭제 (3~4 삭제)
				.toString();
		
		System.out.println(data2);
		
		String data3 = new StringBuffer()    //StringBuilder와 비슷하다
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5)   //3에서 5전까지 삭제 (3~4 삭제)
				.toString();
		
		System.out.println(data3);
		
	}

}
//p.524