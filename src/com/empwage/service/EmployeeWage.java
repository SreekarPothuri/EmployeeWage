public class EmployeeWage{

	public static final int WagePerHr = 20;
	public static final int WorkingDaysPerMonth = 20;
	public static final int WorkingHrsPerMonth = 100;
	static int Days=1;
	static int HrsPerDay;

	public static void EmpWage(){
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
	}

	public static void main(String args[]){
		int DailyWage;
		int MonthlyWage=0;
		int totalWorkingHrs=0;

		System.out.println("*****Welcome to Employee Wage Computation Program*****");

		while(Days<=WorkingDaysPerMonth && totalWorkingHrs<=WorkingHrsPerMonth){
			EmpWage();
			DailyWage = WagePerHr * HrsPerDay;
			System.out.println("\t"+"Day#"+Days+"\t"+"Salary :"+DailyWage);
			MonthlyWage = MonthlyWage + DailyWage;
			totalWorkingHrs = totalWorkingHrs + HrsPerDay;
			Days++;
		}
		System.out.println("Total Working Hours:"+totalWorkingHrs+"\tTotal monthly wage: "+MonthlyWage);
	}
}
