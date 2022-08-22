package com.employeeWageComputation;

public class EmployeeAttendance {

	public static void main(String[] args) {
		int check = (int)(Math.random()*2);
		
		if(check == 0) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}
}
