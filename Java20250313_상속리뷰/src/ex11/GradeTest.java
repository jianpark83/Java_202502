package ex11;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		        
		System.out.print("데이터 갯수: ");
		   int n = scanner.nextInt();
		   int[] scores = new int[n];
		   
		System.out.println(n + "점수 입력: ");
		   for (int i = 0; i < n; i++) {
		       scores[i] = scanner.nextInt();
		   }
		        
	    GradeExpr gradeExpr = new GradeExpr(scores);
		        
		System.out.print("점수들: ");
		   for (int i = 0; i < scores.length; i++) {
		       System.out.print(scores[i]);
		       if (i < scores.length - 1) {
		       System.out.print(", ");
		       }
		   }
		   
		System.out.println();
		System.out.println("총점: " + gradeExpr.getTotal());
		System.out.println("평균: " + gradeExpr.getAverage());
		System.out.println("최고 점수: " + gradeExpr.getGoodScore());
		System.out.println("최저 점수: " + gradeExpr.getBadScore());
	}
}
