import com.fanniemae.payroll.Employee;
import com.fanniemae.payroll.ManagementEmployee;

public class DriverException {

	public static void main(String[] args) {

		// Instantiation

		Object o = 42; // new Employee(175000); //this is upcasting

		try {
			
			Object  x = null;
			x.toString();
			int [] grades ={3,4,5,6};
			int grade = grades[4] ;
			int a = 100/0;
			
			Employee emp = (Employee) o; // this is more like opening the
											// employee object and since
											// Employee is a child of
											// Object(ctrl+T to see the
											// hierarchy),this is called as down
											// casting. If we don't cast it then
											// we cannot access the methods
											// inside the emp class. example if
											// we put a dot next to 'o' then we
											// don't see all the methods in emp
											// eventhough we are
											// creating a constructor out of it.

			float w = emp.getWeeklySalary();
			float m = emp.getOverTimeHourlyWage();
			float h = emp.getHourlyWage();

			System.out.println("Weekly Salary is " + w);
			System.out.println("Overtime Wage is " + m);
			System.out.println("Hourly wage is " + h);

		} catch (java.lang.ClassCastException e) {
			System.out.println("Invalid value");
			e.printStackTrace();
		}
		catch (java.lang.ArithmeticException a){
			System.out.println("Invalid Calculation");
			a.printStackTrace();
		}
		catch (java.lang.ArrayIndexOutOfBoundsException f){
			System.out.println("Invalid array");
			f.printStackTrace();
		}
		catch (java.lang.NullPointerException g){
			System.out.println("Null pointer error");
			g.printStackTrace();
		}
	}

}