import java.util.Scanner;
public class Task2no6 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String firstword;
		System.out.print("Enter first word:");
		firstword=scan.next();
		String line = scan.nextLine();
		int len = firstword.length();
		firstword.toUpperCase();
		
		
		String secondword;
		System.out.print("Enter second word;");
		secondword=scan.next();
		String line2 = scan.nextLine();
		int len2 = secondword.length();
		secondword.toUpperCase();
		
		
		
		String thirdword;
		System.out.print("Enter third word;");
		thirdword=scan.next();
		String line3 = scan.nextLine();
		int len3 = thirdword.length();
        thirdword.toUpperCase();
		
		
	
		if (len > len2){
			int lens = len;
			len= len2;
		    len2 = lens;
		
				    }
		if (len2 >len3){
			int lens = len2;
			len2=len3;
			len3 = lens;
		}
		
		
		if (len > len2) {
			int lens = len;
			len = len2;
			len2 = lens;
		}
		
		
		
		System.out.println(" Word one is "+firstword.toUpperCase()+ " Word two is "+secondword.toUpperCase()+ " the length of word one is: " +len+ " and the length of word two is: " +len2+ " finally the final word is " +thirdword.toUpperCase()+ " length of word three is: "+len3);	
		
		
		
	}
}