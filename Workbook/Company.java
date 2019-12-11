package Workbook;

public class Company {
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {
		
	}
	public Company(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getAfterTaxBonus() {
		return afterTaxBonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public double getIncome() {
		double sum = 0.0;
		sum = this.salary * 12;
		return sum;
	}
	
	public double getAfterTaxIncome() {
		double AfterTax = 0.0;
		AfterTax = getIncome() * (0.9);
		return AfterTax;
	}
	
	public double getBonuss() {
		double ggbonus = 0.0;
		ggbonus = this.salary*0.2*4;
		return ggbonus;
	}
	

	public double getAfterTaxBonuss() {
		double AfterBonus = 0.0;
		AfterBonus = getBonuss()*0.945;
		return AfterBonus;
	}
	
	
}
