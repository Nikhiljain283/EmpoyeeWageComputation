package com.employeeWageComputation;

public class MonthlyWage {
	static int totalWorkHrs = 0;
	static int workingHrs = 0;
	public static void main(String[] args) {
		int wagePerHr = 20;
		int fullTimeHrs = 8;
		int partTimeHrs = 4;
		int totalWorkingDays = 0;
		int totalEmpWage = 0;
		
		while(totalWorkingDays < 20) { 
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
