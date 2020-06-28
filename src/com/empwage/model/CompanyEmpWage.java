package com.empwage.model;

public class CompanyEmpWage{
	public final String company;
	public final int WagePerHr;
	public final int WorkingDaysPerMonth;
	public final int WorkingHrsPerMonth;
	public int MonthlyWage;

	public CompanyEmpWage(String company, int WagePerHr, int WorkingDaysPerMonth, int WorkingHrsPerMonth){
		this.company = company;
		this.WagePerHr = WagePerHr;
		this.WorkingDaysPerMonth = WorkingDaysPerMonth;
		this.WorkingHrsPerMonth = WorkingHrsPerMonth;
		MonthlyWage = 0;
	}

	public void setTotalEmpWage(int MonthlyWage){
		this.MonthlyWage = MonthlyWage;
	}

	@Override
	public String toString(){
		return "Total Employee wage for company: "+company+" is:"+MonthlyWage;
	}
}
