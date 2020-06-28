package com.empwage.service;
import java.util.*;
import java.util.HashMap;
import com.empwage.model.CompanyEmpWage;
import com.empwage.Interfaces.IComputeEmpWage;
public class EmployeeWage implements IComputeEmpWage {
	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;

	public EmployeeWage(){
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new Hashmap<>();
	}

	public void addCompanyEmpWage(String company,int WagePerHr, int WorkingDaysPerMonth, int WorkingHrsPerMonth){
		CompanyEmpWage companyEmpWage  = new CompanyEmpWage(company,WagePerHr,WorkingDaysPerMonth,WorkingHrsPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}

	public void computeEmpWage(){
		for(int i=0; i< companyEmpWageList.size(); i++){
			CompanyEmpWage companyEmpwage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company){
		return companyToEmpWageMap.get(company).MonthlyWage;
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage){
		int HrsPerDay=0;
		int DailyWage;
		int totalWorkingHrs=0;
		int Days=1;

		while(Days<=companyEmpWage.WorkingDaysPerMonth && totalWorkingHrs<=companyEmpWage.WorkingHrsPerMonth){
			double EmpCheck = Math.floor(Math.random() * 10) % 3;
			int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

			switch(CheckEmp){
				case 1:
					System.out.print("Full Time Employee and he is Present");
					HrsPerDay=8;
					break;
				case 2:
					System.out.print("Part Time Employee and he is Present");
					HrsPerDay=4;
					break;
				default:
					System.out.print("Employee is absent\t"+"\t");
					HrsPerDay=0;
					break;
			}
			totalWorkingHrs = totalWorkingHrs + HrsPerDay;
			System.out.println("\tEmpHr: "+HrsPerDay);
			Days++;
		}
			return totalWorkingHrs * companyEmpWage.WagePerHr;
	}

	public static void main(String args[]){
		System.out.println("*****Welcome to Employee Wage Computation Program*****");
		IComputeEmpWage empWage = new EmployeeWage();
		empWage.addCompanyEmpWage("Amazon",10,2,10);
		empWage.addCompanyEmpWage("Netflix",20,4,20);
		empWage.computeEmpWage();
		System.out.println("Total Wage for Amazon Company: "+empWage.getTotalWage("Amazon"));
		System.out.println("Total Wage for Netflix Company: "+empWage.getTotalWage("Netflix"));
	}
}
