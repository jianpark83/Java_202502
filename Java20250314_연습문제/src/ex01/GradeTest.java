package ex01;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		        
		System.out.print("데이터 갯수: ");
		   int count = sc.nextInt();
		        
		   int[] nArr = new int[count];        //배열 만들었음
 		
		   for (int i=0; i < nArr.length; i++) {
			   System.out.print("정수 입력: ");
		       nArr[i] = sc.nextInt();
		   }
		   
		   for (int i=0; i < nArr.length; i++) {
		       System.out.print(nArr[i] + ", ");
		   }
		   	   
		System.out.println();
		
		GradeExpr expr = new GradeExpr(nArr);
		System.out.println("총점: " + expr.getTotal());
//		System.out.println("평균: " + expr.getAverage());   => 이렇게 해도 됨
		System.out.printf("평균: %.2f\n", + expr.getAverage());  //소수점 2자리까지만 보이게 할 경우
		System.out.println("최고 점수: " + expr.getGoodScore());
		System.out.println("최저 점수: " + expr.getBadScore());

	}
}

