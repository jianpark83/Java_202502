package ex02;

public class StudentTest {

	public static void main(String[] args) {

		Student arrays[] = new Student[3];
		
		arrays[0] = new Student("홍길동", 20, 171, 81, "201101", "영문");
		arrays[1] = new Student("고길동", 21, 183, 72, "201102", "건축");
		arrays[2] = new Student("박길동", 22, 175, 65, "201103", "컴공");
		
	    for( int i=0; i<arrays.length; i++) {
	      //String result = arrays[i].printInformation();
	      //System.out.println(result);
	    	String result = arrays[i].toString();
	    	System.out.println(arrays[i]);
	    }		
	}
}
