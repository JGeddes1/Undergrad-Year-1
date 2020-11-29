import java.util.Scanner;
public class number6 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Weight:");
		double weight = input.nextDouble();
		
		if(weight<1){
			System.out.println("The Postal Charge is £1.50");
		}
		
		if(weight > 1 && weight <= 2){
			System.out.println("The Postal Charge is £3");
		}
	
		if(weight >2 && weight <= 3){
			System.out.println("The Postal Charge is £4");
		}

		
		if(weight >3){
			System.out.println("The Postal Charge is £5");
		}
	}

}
