import java.util.Scanner;
public class number2 {

	public static void main(String[] args) {
 int n=2;
 int value;
 boolean Prime=true;
 Scanner scan= new Scanner(System.in);
 System.out.println("Enter a number");
 int num=scan.nextInt();
 for(n=2;n<=num/2;n++)
 {
value=num%n;
if(value==0)
{
	Prime=false;
	break;
}
	 
 }
 if(Prime)
	 System.out.println(num + " is a Prime Number");
 else
	 System.out.println(num + " is not a Prime Number");
	}
}
