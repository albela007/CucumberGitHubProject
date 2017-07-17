
public class DriverAverage {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		if (args.length==0){
			System.out.println("please provide parameters");
			return;
			}
			float total=0;	
		for (int i=0; i< args.length;i++){
			float exam =Float.parseFloat(args[i]);
			total= total + exam;
		}
		
		float average = total/args.length;
						
		
		String status = "";
		if (average > 70){
			status = "Passing";
			}
		else {
			status = "failing";
			}
		System.out.println("The Average is: " + average);
		System.out.println ("Status is " + status);
	}
}


