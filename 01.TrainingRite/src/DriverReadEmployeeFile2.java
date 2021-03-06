import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fanniemae.payroll.model.EmployeeType;

public class DriverReadEmployeeFile2 {

	public static void main(String[] args) {

		//String fileName = "/data/employees.txt";
		//String fileName = "/data/empty.txt";
		String fileName = "/data/AllExcp.txt";
		
		boolean isEmpty = true; //empty file checking
		FileReader fr;
		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String row ="";
			
			br.readLine();
			
			while( (row = br.readLine()) != null ){
				isEmpty = false; // empty file checking
				String [] columns = row.split(",");
				if (columns.length <3){
					//create report
					continue;
				}
				String type = columns[0];
				float salary = Float.parseFloat(columns[1]);
				float hoursWorked= Float.parseFloat(columns[2]);
				
				EmployeeType empType = new EmployeeType(type, salary, hoursWorked) ;
				
				System.out.println(empType);
			}
			if (isEmpty){
				System.out.println("The File is empty");
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		} 
		catch (Exception e){
			System.out.println("Other exceptions exist");
			e.printStackTrace();
			//this excepton is to capture any other exceptions that are explicitly handled above
			
		}
	}
}
