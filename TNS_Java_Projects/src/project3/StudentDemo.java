package project3;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student S1=new Student();
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Name:");
			S1.setName(s.nextLine());
			System.out.println("Enter the RollNumber:");
			S1.setRollnumber(s.nextInt());
			System.out.println("Enter the Grade:");
			s.nextLine();
			S1.setGrade(s.nextLine());
			System.out.println("Enter the Percentage:");
			S1.setPercentage(s.nextDouble());
		}
		
		System.out.println(S1);
		
		
		
	}

}
