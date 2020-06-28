package com.empwage.service;
import com.empwage.model.CompanyEmpWage;
import com.empwage.Interfaces.IComputeEmpWage;
public class EmployeeWage {
	private static int numOfCompany = 0;
	private static CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWage(){
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company,int WagePerHr, int WorkingDaysPerMonth, int WorkingHrsPerMonth){
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,WagePerHr,WorkingDaysPerMonth,WorkingHrsPerMonth);
		numOfCompany++;
	}

	public static void computeEmpWage(){
		for(int i=0; i<numOfCompany; i++){
			companyEmpWageArray[i].setTotalEmpWage(computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public static int computeEmpWage(CompanyEmpWage companyEmpWage){
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
		EmployeeWage empWage = new EmployeeWage();
		empWage.addCompanyEmpWage("Amazon",10,2,10);
		empWage.addCompanyEmpWage("Netflix",20,4,20);
		empWage.addCompanyEmpWage("Zee5",30,6,30);
		empWage.addCompanyEmpWage("SonyLIV",40,8,40);
		empWage.addCompanyEmpWage("Aha",50,10,50);
		EmployeeWage.computeEmpWage();
	}
}
