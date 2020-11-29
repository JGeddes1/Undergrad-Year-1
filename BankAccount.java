import java.util.Random;
import java.util.Scanner;
public class BankAccount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		double balance = 1000;
		double amount;
		boolean exit = false;
		do {
			
			
			
			System.out.println("1.Withdrawal");
			System.out.println("2.Deposit");
			System.out.println("3.Balance");
			System.out.println("4.exit");
			num = scan.nextInt();
			
			if((num ==1) && (balance >0)){
				System.out.println("Enter amount to Withdraw: ");
				amount = scan.nextDouble();
				
				balance -= amount;
				System.out.println("Your balance is");
				System.out.println(balance);
				
			} else if(num == 2){
				System.out.println("Enter amount to Deposit: ");
				amount = scan.nextDouble();
				
				balance += amount;
				System.out.println("Your balance now is");
				System.out.println(balance);
			} 
			} while(num ==3);{
				
				System.out.println("your balance is:");
				System.out.println(balance);
	
		
		}

		while(num <= 3){
			System.out.println("Transaction Complete");
			System.out.println("1.Withdrawal");
			System.out.println("2.Deposit");
			System.out.println("3.Balance");
			num = scan.nextInt();
		}
	}

}
			
			
		
		
	
		
		
	
	
	