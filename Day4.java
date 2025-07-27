package code;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		int first=0,second=1;
		System.out.println("Fibonacci series up to " + n + "terms:");
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(first + " ");
			int next =first + second;
			first=second;
			second=next;
		}
		sc.close();

	}

}
