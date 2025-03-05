package ch01.ex03;

public class BreakEx02 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* ");
				
				if(i == j) break;      //반복문이 중첩되어 있을 경우 break 문은 가장 가까운 반복문만 종료
			}
		    System.out.println();
		}
		
	}

}
