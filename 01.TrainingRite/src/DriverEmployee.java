import com.fanniemae.payroll.Employee;

public class DriverEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp = new Employee(52000);
		float w = emp.getWeeklySalary();
		float m = emp.getMonthlySalary();
		float h = emp.getHourlyWage();
		
		System.out.println("Weekly Salary is " + w);
		System.out.println("Monthly Salary is " + m);
		System.out.println("Hourly wage is " + h);
		
	}


}