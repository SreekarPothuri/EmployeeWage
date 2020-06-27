public class EmployeeWage{
	public static void main(String args[]){

		int WagePerHr = 20;
		int HrsPerDay;
		int DailyWage;

		int WorkingDaysPerMonth=20;
		int Days;
		int MonthlyWage=0;

		System.out.println("*****Welcome to Employee Wage Computation Program*****");

		for(Days=1; Days<=WorkingDaysPerMonth; Days++){

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
		}
		System.out.println("Total monthly wage: "+MonthlyWage);
	}
}
