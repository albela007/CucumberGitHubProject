import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DriverReadEmployeeFile {

	public static void main(String[] args) {

		String fileName = "/data/employees.txt";

		FileReader fr;
		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String row ="";
			while( (row = br.readLine()) != null ){
				System.out.println(row);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
}
