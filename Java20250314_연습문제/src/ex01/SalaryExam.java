package ex01;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		
		System.out.print("등급(1-4) 입력: ");
		int grade = sc.nextInt();
		int salary = 0;
		SalaryExpr expr = null;
		
//		if(month % 2 == 0) {    //월이 짝수
//			expr = new SalaryExpr(100);
//		}else {   //월이 홀수	
//			expr = new SalaryExpr(0);
//		}
        
		expr = (month % 2 ==0) ? new SalaryExpr(100): new SalaryExpr(0);  //삼항 연산자
		
		salary = expr.getSalary(grade);
		
		System.out.println(month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
	}
}

//if문을 써도 되고, 삼항연산자를 써도 됨
//삼항연산자를 쓰면 코드가 간결해짐