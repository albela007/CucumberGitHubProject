import com.fanniemae.payroll.UnionEmployee;

public class DriverUnionEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this process is called instantiation.
		UnionEmployee emp = new UnionEmployee(52000, 42);
		float w = emp.getWeeklySalary();
		float h = emp.getOverTimeHourlyWage();
		float r = emp.getHourlyWage();

		System.out.println("Employee" + emp.toString());
		System.out.println("Weekly Salary is " + w);
		System.out.println("Overtime wage is "  + h);
		System.out.println("Regular wage is "  + r);
	}

}