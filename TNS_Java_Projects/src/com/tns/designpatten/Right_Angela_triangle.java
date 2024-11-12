package com.tns.designpatten;

import java.util.Scanner;

public class Right_Angela_triangle {

	public static void main(String[] args) {
		int i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The number n:");
		String n=input.nextLine();
		
		int N=Integer.parseInt(n);
		
		for(i=1;i<N;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
