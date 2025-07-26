package code;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=sc.nextInt();
		
		boolean isLeap=false;
		
		if((year%4==0 && year % 100 != 0) || (year % 400 ==0))
		{
			isLeap=true;
		}
		
		if(isLeap)
		{
			System.out.println(year + "is a Leap year.");
		}
		else
		{
			System.out.println(year + " is not a leap year.");
		}
		sc.close();

	}

}
