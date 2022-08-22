package com.employeeWageComputation;

public class EmployeePartTime {
	
		public static void main(String[] args) {
			int wagePerHr = 20;
			int totalWorkHrs = 8;
			int partTimeHrs = 4;
			
			int check = (int)(Math.random()*3);
			
			if(check == 0) {
				System.out.println("Employee is present");
				int EmployeeWage = totalWorkHrs*wagePerHr;
				System.out.println("Employee daily wage = "+EmployeeWage);
			}else if(check == 1) {
				System.out.println("Employee is part time");
				int EmployeeWage = partTimeHrs*wagePerHr;
				System.out.println("Employee daily wage = "+EmployeeWage);
			}else {
				System.out.println("Employee is absent");
			}
		}
}
