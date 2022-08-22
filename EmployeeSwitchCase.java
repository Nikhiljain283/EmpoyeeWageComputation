package com.employeeWageComputation;

public class EmployeeSwitchCase {

	public static void main(String[] args) {
		int wagePerHr = 20;
		int fullTimeHrs = 8;
		int partTimeHrs = 4;
		
		int check = (int)(Math.random()*3);
		
		switch(check) {
		
		case 0 :
			System.out.println("Employee is present");
			int employeeWage = fullTimeHrs*wagePerHr;
			System.out.println("Employee daily wage = "+employeeWage);
			break;
		case 1 : 
			System.out.println("Employee is part time");
			int employeeWage1 = partTimeHrs*wagePerHr;
			System.out.println("Employee daily wage = "+employeeWage1);
			break;
		case 2 : 
			System.out.println("Employee is absent");
			break;
		}
	}

}
