package ch01.ex02;

public class 난수발생 {

	public static void main(String[] args) {

		System.out.println( Math.random() );   //0~1사이 난수발생, 실행할때마다 다르게 실행된다
		
		System.out.println( (int)(Math.random()*6) );  //0~5 정수
		
		System.out.println( (int)(Math.random()*6)+1 );  //1~6 정수
		
		
		System.out.println( Math.PI);        //pi
		System.out.println( Math.abs(-1));   //절대값
		System.out.println( Math.sqrt(4));   //루트
		System.out.println( Math.sqrt(9));   //루트
		
		
		System.out.println( Math.floor(12.91));   //소수점이하 절삭
		
		
		
		
		
	}

}
