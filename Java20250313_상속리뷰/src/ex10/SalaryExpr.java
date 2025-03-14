package ex10;

public class SalaryExpr {

	private int bonus;
	
	public SalaryExpr() {
		this.bonus = 0;
	}
	
	public SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary(int grade) {
		if(grade == 1) {
			return bonus + 100;
		}else if (grade == 2) {
			return bonus + 90;
		}else if (grade == 3) {
			return bonus + 80;
		}else if (grade == 4) {
			return bonus + 70;
		}else return bonus;
	}
}
