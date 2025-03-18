package ex02;

public abstract class Employee { //추상메소드가 있기 때문에 추상클래스
	
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee(){}
	public Employee(String name, int number, String department, int salary){
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax();  //추상메소드
	
	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getDepartment() {
		return department;
	}
}
