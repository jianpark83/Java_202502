package ex10;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력: ");
		int month = sc.nextInt();
		
		System.out.println("등급 입력(1-4): ");
		int grade = sc.nextInt();
		
		SalaryExpr salary;
		   if(month % 2 == 0) {
		      salary = new SalaryExpr(100);
		     }else {
		      salary = new SalaryExpr();
		     }
		        
		 int Salary = salary.getSalary(grade);
		   System.out.println(month + "월 " + grade + "등급의 월급은 " + Salary + "입니다.");
	}
}
