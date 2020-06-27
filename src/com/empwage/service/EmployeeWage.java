public class EmployeeWage{

	public static int computeEmpWage(String company, int WagePerHr, int WorkingDaysPerMonth, int WorkingHrsPerMonth){
		int HrsPerDay=0;
		int totalWorkingHrs=0;
		int Days=1;
		int MonthlyWage=0;
		int DailyWage;

		while(Days<=WorkingDaysPerMonth && totalWorkingHrs<=WorkingHrsPerMonth){
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

			DailyWage = WagePerHr * HrsPerDay;
			System.out.println("\t"+"Day#"+Days+"\t"+"Salary :"+DailyWage);
			MonthlyWage = MonthlyWage + DailyWage;
			totalWorkingHrs = totalWorkingHrs + HrsPerDay;
			Days++;
		}
			System.out.println("Emp Wage for Company:"+company+"\tTotal Working Hours:"+totalWorkingHrs+"\tTotal Monthly Salary:"+MonthlyWage);
			return MonthlyWage;
	}
	public static void main(String args[]){
		System.out.println("*****Welcome to Employee Wage Computation Program*****");
		computeEmpWage("Amazon",10,2,10);
		computeEmpWage("Netflix",20,4,20);
		computeEmpWage("Zee5",30,6,30);
		computeEmpWage("SonyLIV",40,8,40);
		computeEmpWage("Aha",50,10,50);
	}
}
