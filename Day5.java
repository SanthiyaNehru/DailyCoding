
package code;

import java.util.Scanner;

public class Day5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		sc.close();
		
		if(num>0)
		{
			System.out.println("The number is positive.");
		}
		else if(num<0)
		{
			System.out.println("The number is Negative.");
		}
		else {
			System.out.println("Zero.");
		}
	}

}
