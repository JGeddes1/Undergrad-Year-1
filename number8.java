import java.util.Scanner;
public class number8 {

	public static void main(String[] args) {


		int Rows = 5;
		int rowCount = 1;
		for (int n = Rows; n >= 1; n--)
		{
			for (int i = 1; i <= n*2; i++)
			{
				System.out.print(" ");
			}

			for (int i = n; i <= Rows; i++)             
			{
				System.out.print(i+" ");
			}
			for (int i = Rows-1; i >= n; i--)
			{                 
				System.out.print(i+" ");             
			}
			System.out.println();
			rowCount++;

		}
	}
}