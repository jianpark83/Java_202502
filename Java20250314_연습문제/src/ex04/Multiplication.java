package ex04;

public class Multiplication {
	
	private int dan;
	private int number;
	
	Multiplication(){}
	Multiplication(int dan){
		this.dan = dan;
	}

	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	
	void printPart() {
		if(number == 0) {
			System.out.println(dan + "단 : ");
			for(int i=1; i<=9; i++) {
				System.out.print(dan + "*" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}else {
			System.out.println(dan + "*" + number + " = " + dan * number);
		}
	}
}
