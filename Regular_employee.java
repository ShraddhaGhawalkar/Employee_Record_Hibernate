package hibernatepack;

public class Regular_employee extends Employee{
	private int Salary;
	private int Bonus;
	
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getBonus() {
		return Bonus;
	}
	public void setBonus(int bonus) {
		Bonus = bonus;
	}
	
	
}
