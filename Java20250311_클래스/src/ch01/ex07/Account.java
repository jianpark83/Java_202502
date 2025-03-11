package ch01.ex07;

//싱글톤 패턴

public class Account {
	
	int balance;
	
	final int MIN_BALANCE = 0;       
	final int MAX_BALANCE = 1000000;
	
	private static Account ac = new Account();  //내부에 객체 생성
	
	private Account() {
		
	}
	
	static Account getInstance() {    //반환타입, 참조변수인 Account가 와야한다
		return ac;
	}
	
	void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) 
		this.balance = balance;
	}
	
	int getBalance() {
		return balance;
	}
}

//객체는 딱 하나만 생성할 수 있다
//외부에서 객체생성하지 못하게 한다. private 사용

//내부에 객체 생성후 공유한다 ex)Account
//getInstance 사용
//이어서 체크하기