import java.util.Scanner;
public class number9 {

	public static void main(String[] args) {
		 int n;
		 int i;
		 
		 System.out.println("Please enter a number to print as multiplication");
		 Scanner scan = new Scanner(System.in);
		 n = scan.nextInt(); // n is the integer that is put into be used
		 System.out.println("Multiplication table of "+n+" is:"); 

		 for( i = 1; i <= 10; i++ )
			 System.out.println(n+"X"+i+" = "+(n*i)); // This allows the multiplaction to take place
		}
		}
