public class EmployeeWage{
	public static void main(String args[]){
		int is_full_time=1;
		int is_part_time=2;

		int WagePerHr = 20;
		int HrsPerDay;
		int DailyWageSalary;

		System.out.println("*****Welcome to Employee Wage Computation Program*****");

		double EmpCheck = Math.floor(Math.random() * 10) % 3;

		if(EmpCheck == is_full_time){
			System.out.println("Full Time Employee is Present");
			HrsPerDay=8;
		}
		else if(EmpCheck == is_part_time){
			System.out.println("Part Time Employee is Present");
			HrsPerDay=4;
		}
		else
		{
			System.out.println("Employee is absent");
			HrsPerDay=0;
		}
		DailyWageSalary = WagePerHr * HrsPerDay;
		System.out.println("Salary : "+DailyWageSalary);
	}
}
