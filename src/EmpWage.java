
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		
		final int is_present_full = 1;
		final int is_present_part = 2;
		
		int wage_per_hour = 20;
		int working_hour = 0 ;
		int max_days = 0;
		int emp_monthly_wage = 0;
		
		while (max_days <= 20)
		{
		
		int EmpCheck = (int) (Math.random() * 10) %3;
		
		switch (EmpCheck)
		{
		case is_present_full:
			System.out.println("Employee is present for full time");
			working_hour = 8;
			break;
			
		case is_present_part:
			System.out.println("Employee is present for part time");
			working_hour = 4;
			break;
			
		default:
			System.out.println("Employee is absent");
			working_hour = 0;
			break;
		}
		int Emp_daily_wage = working_hour * wage_per_hour;
		System.out.println("Employee daily wage is " + Emp_daily_wage);
		emp_monthly_wage+=Emp_daily_wage;
		max_days++;
	
	}
		System.out.println("--------------------------------------------------");
		System.out.println("Employee total monthly wage is " + emp_monthly_wage);
	}

}
