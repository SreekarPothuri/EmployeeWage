package com.empwage.Interfaces;

public interface IComputeEmpWage{
	public void addCompanyEmpWage(String company, int WagePerHr, int WorkingDaysPerMonth, int WorkingHrsPerMonth);
	public static void computeEmpWage();
}
