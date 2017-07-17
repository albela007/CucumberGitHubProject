import java.util.ArrayList;

import com.fanniemae.payroll.dao.EmployeeRepository;
import com.fanniemae.payroll.model.EmployeeType;

public class DriverEmployeeRepository {

	public static void main(String[] args) {
		 
		EmployeeRepository emp = new EmployeeRepository();
		ArrayList<EmployeeType> list  = emp.findAll();
		 
		for (EmployeeType employeeType : list) {
			if(employeeType.getType().equals("u") || employeeType.getType().equals("m") ){
				System.out.println(employeeType);
			}
			
		}
		
	}

}
