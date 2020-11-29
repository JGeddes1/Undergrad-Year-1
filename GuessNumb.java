import java.util.Random;
import java.util.Scanner;
public class GuessNumb {

	public static void main(String[] args) {

		
	int Easy; // 0-100
	int Medium; // 0-500
	int Hard; // 0-1000
		
	System.out.println("Enter the Difficulty : 1 = Easy, 2 = Medium , 3 = Difficult");
	int difficulty;
	Scanner scan= new Scanner( System.in );
	difficulty = scan.nextInt();
	
	int number = 0;
	
	switch (difficulty) {
	case 1:
		Random randomnumber = new Random();
		number = randomnumber.nextInt(101);
		break;
	case 2:
		Random randomnumber2 = new Random();
		number = randomnumber2.nextInt(501);
		break;
	case 3:
		Random randomnumber3 = new Random();
		number = randomnumber3.nextInt(1001);
		break;
	}
	
	
	int num1;
	System.out.println("Enter Guess:");
	num1 = scan.nextInt();
	
	if(num1 == number){
		System.out.println("You won!");
	} else if(num1 > number){
		System.out.println("You are too high!");
	} else{
		System.out.println("Pick a larger number");
		
	}
	
	while(num1<number){
		System.out.println("Please try again");
		num1 = scan.nextInt();
		
	}
		
	
	

	
		
		
	}
		
		
	}

	
	