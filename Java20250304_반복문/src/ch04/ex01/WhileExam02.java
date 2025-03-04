package ch04.ex01;

public class WhileExam02 {

	public static void main(String[] args) {
	  /*
	   * for(int i=2; i<=9; i++) {
			System.out.printf("******%d단******\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
	   */
		
		int i=2;
		int j=1;
		
		while(i<=9) {
			j=1;       //반드시 기입, j값을 초기화 해야함
			System.out.printf("******%d단*******\n", i);
			while(j<=9) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				j++;
			}
		System.out.println();
		
		i++;
		}
			
	}

}
