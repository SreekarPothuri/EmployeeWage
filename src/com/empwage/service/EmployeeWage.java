public class EmployeeWage{
	public static void main(String args[]){
		int WagePerHr = 20;
		int HrsPerDay = 8;
		int DailyWageSalary;
		System.out.println("*****Welcome to Employee Wage Computation Program*****");
		double EmpCheck = Math.floor(Math.random() * 10) % 2;
		if(EmpCheck == 1)
		{
			System.out.println("Employee is present");
			DailyWageSalary = WagePerHr * HrsPerDay;
			System.out.println("Salary : "+DailyWageSalary);
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
