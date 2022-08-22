package com.employeeWageComputation;

public class MaxWorkingHr {

	public static void main(String[] args) {
		int maxWorkingHrs = 100;
		int maxWorkDays = 20;
		int totalWorkHrs = 0;
		int workingHrs = 0;
		int wagePerHr = 20;
		int fullTimeHrs = 8;
		int partTimeHrs = 4;
		int totalWorkingDays = 0;
		int totalEmpWage = 0;
		
		while(totalWorkingDays < maxWorkDays && totalWorkHrs < maxWorkingHrs) { 
			int check = (int)(Math.random()*3);
		if(check == 0) {
			System.out.println("Employee is present");
			workingHrs = fullTimeHrs;
		}else if(check == 1) {
			System.out.println("Employee is part time");
			workingHrs = partTimeHrs;
		}else {
			System.out.println("Employee is absent");
			workingHrs = 0;
		}
		totalWorkHrs += workingHrs;
		totalEmpWage = totalWorkHrs*wagePerHr;
		totalWorkingDays++;
		}
		System.out.println("Total working hours = "+totalWorkHrs);
		System.out.println("monthly employee wage = "+totalEmpWage);
	}

}
