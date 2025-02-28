package ch01.ex05;

import java.util.Scanner;                                  //scanner 있어야 함, 키보드를 통해 데이터를 입력 가능

public class Exam_문제1 {

	public static void main(String[] args) {
       /*
        * 키보드 통해서 4000을 입력 받은 후
        * 시 분 초를 구하는 프로그램 구현
        * 입력 : 4000
        * 출력 : 1시간 6분 40초
        */
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("숫자 입력: ");
	    
	    
		String data = scanner.nextLine();    
		int totalSeconds = Integer.parseInt(data);
		//int totalSeconds = scanner.nextInt();      --> 위 두줄을 한줄로 입력해도 무방함
		
		int hours = totalSeconds / 3600;                 // 1시간 구함
		//System.out.println(hours);
		
		int minutes = (totalSeconds % 3600) / 60;        // 6분 구함
		//System.out.println(minutes);
		
		int seconds = totalSeconds % 60;
		//System.out.println(seconds);
		
		System.out.printf("total 초:%d , 시간:%d, 분:%d, 초:%d\n", totalSeconds, hours, minutes, seconds);
	}

}
