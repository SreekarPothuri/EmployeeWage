public class EmployeeWage{
	private final String company;
	private final int WagePerHr;
	private final int WorkingDaysPerMonth;
	private final int WorkingHrsPerMonth;
	private int MonthlyWage=0;

	public EmployeeWage(String company, int WagePerHr, int WorkingDaysPerMonth, int WorkingHrsPerMonth){
		this.company = company;
		this.WagePerHr = WagePerHr;
		this.WorkingDaysPerMonth = WorkingDaysPerMonth;
		this.WorkingHrsPerMonth = WorkingHrsPerMonth;
	}

	public void computeEmpWage(){
		int HrsPerDay=0;
		int DailyWage;
		int totalWorkingHrs=0;
		int Days=1;

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
	}
	public static void main(String args[]){
		System.out.println("*****Welcome to Employee Wage Computation Program*****");
		EmployeeWage Amazon = new EmployeeWage("Amazon",10,2,10);
		EmployeeWage Netflix = new EmployeeWage("Netflix",20,4,20);
		EmployeeWage Zee5 = new EmployeeWage("Zee5",30,6,30);
		EmployeeWage SonyLIV = new EmployeeWage("SonyLIV",40,8,40);
		EmployeeWage Aha = new EmployeeWage("Aha",50,10,50);

		Amazon.computeEmpWage();
		System.out.println(Amazon);
		Netflix.computeEmpWage();
		System.out.println(Netflix);
		Zee5.computeEmpWage();
		System.out.println(Zee5);
		SonyLIV.computeEmpWage();
		System.out.println(SonyLIV);
		Aha.computeEmpWage();
		System.out.println(Aha);
	}
}
