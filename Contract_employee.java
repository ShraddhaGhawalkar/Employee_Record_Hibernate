package hibernatepack;

public class Contract_employee extends Employee{
	private int Pay_per_hour;
	private int Contract_duration;
	
	public int getPay_per_hour() {
		return Pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		Pay_per_hour = pay_per_hour;
	}
	public int getContract_duration() {
		return Contract_duration;
	}
	public void setContract_duration(int contract_duration) {
		Contract_duration = contract_duration;
	}
	
	
}
