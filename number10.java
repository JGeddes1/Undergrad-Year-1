import java.util.Scanner;
public class number10 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scan.nextInt();
		
		boolean leapyear = ((year % 4 == 0)     &&   (year % 100 != 0) );
		
		if(leapyear){
			System.out.println(year + " is a leap year.");
		} 
		else
			System.out.println(year + " is not a leap year.");
}
}
