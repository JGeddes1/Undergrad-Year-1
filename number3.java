import java.util.Scanner;
public class number3 {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Three numbers:");
		
		System.out.println("Enter first:");
		num1 = scan.nextInt();
		
		System.out.println("Enter Second:");
		num2 = scan.nextInt();
		
		System.out.println("Enter Third:");
		num3 = scan.nextInt();
    
		if (num1 > num2){
			int num = num1;
			num1= num2;
			num2 = num;
			
		}
		if (num2 > num3){
			int num = num2;
			num2= num3;
			num3 = num;
		}
		
		if (num1 > num2) {
			      int num = num1;
			      num1 = num2;
			      num2 = num;
			    }
		
			 System.out.println("The numbers in Ascending order are "+ num1 + " " + num2 + " " + num3);

		}
	}


