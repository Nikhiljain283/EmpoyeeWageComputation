package com.employeeWageComputation;

public class EmployeeDailyWage {

	public static void main(String[] args) {
		int wagePerHr = 20;
		int totalWorkHrs = 8;
		int check = (int)(Math.random()*2);
		
		if(check == 0) {
			System.out.println("Employee is present");
			int EmployeeWage = totalWorkHrs*wagePerHr;
			System.out.println("Employee daily wage = "+EmployeeWage);
		}else {
			System.out.println("Employee is absent");
		}
	}
}
