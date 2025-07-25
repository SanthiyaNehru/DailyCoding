package code;

import java.util.Scanner;

//Prime number check

public class Day2 {
	
	public static  void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=scan.nextInt();
		
		boolean isPrime=true;
		
		if(n<=1) {
			isPrime=false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime)
		{
			System.out.println(n + " is a prime number.");
		}
		else
		{
			System.out.println(n + " is not a prime number.");
		}
		scan.close();
		
	}
}
