//Even or Odd

package code;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter n:");
		int n=scan.nextInt();
		
		if(n<0)
		{
			System.out.println("Invalid Number!.please enter positive integer.");
		}
		else if(n%2==0)
		{
			System.out.println(n + " is even number.");
		}
		else
		{
			System.out.println(n + " is odd number.");
		}
		
		scan.close();

	}

}
