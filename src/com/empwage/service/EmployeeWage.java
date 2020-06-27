public class EmployeeWage{
	public static void main(String args[]){

		int WagePerHr = 20;
		int HrsPerDay;
		int DailyWageSalary;

		System.out.println("*****Welcome to Employee Wage Computation Program*****");

		double EmpCheck = Math.floor(Math.random() * 10) % 3;
		int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

		switch(CheckEmp){
			case 1:
				System.out.println("Full Time Employee and he is Present");
				HrsPerDay=8;
				break;
			case 2:
				System.out.println("Part Time Employee and he is Present");
				HrsPerDay=4;
				break;
			default:
				System.out.println("Employee is absent");
				HrsPerDay=0;
				break;
		}
		DailyWageSalary = WagePerHr * HrsPerDay;
		System.out.println("Salary : "+DailyWageSalary);
	}
}
