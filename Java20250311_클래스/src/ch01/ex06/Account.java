package ch01.ex06;

//Class 06. 확인문제 19번

public class Account {
	
	int balance;
	
	final int MIN_BALANCE = 0;       //상수는 대문자
	final int MAX_BALANCE = 1000000;
	
    public Account() {}
    
	void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) 
		this.balance = balance;

	  //if(MIN_BALANCE <= balance <= MAX_BALANCE)             -> X
	  //if(MIN_BALANCE <= balance && balance <= MAX_BALANCE)  -> X
	}
	
	int getBalance() {
		return balance;
	}
	
}
