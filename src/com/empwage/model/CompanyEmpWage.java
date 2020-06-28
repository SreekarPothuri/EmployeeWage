package com.empwage.model;

public class CompanyEmpWage{
	public String company;
	public int WagePerHr;
	public int WorkingDaysPerMonth;
	public int WorkingHrsPerMonth;
	public int MonthlyWage;

	public CompanyEmpWage(String company, int WagePerHr, int WorkingDaysPerMonth, int WorkingHrsPerMonth){
		this.company = company;
		this.WagePerHr = WagePerHr;
		this.WorkingDaysPerMonth = WorkingDaysPerMonth;
		this.WorkingHrsPerMonth = WorkingHrsPerMonth;
	}

	public void setTotalEmpWage(int MonthlyWage){
		this.MonthlyWage = MonthlyWage;
	}

	public String toString(){
		return "Total Employee wage for company: "+company+" is:"+MonthlyWage;
	}
}
