
public class number7 {

	public static void main(String[] args) {
	
		for(int i = 1; i<= 11; i+=2) { // This states that it will do up to 11 stars on a row and will add 2 each time 
			for (int k = 0;k < i; k++) // This part makes it so that if k<i then add one to k This then prints a new row until k>i	
			System.out.print("*");
			System.out.println();
		}

	System.out.println("");
	}

}
