package com.employeeio;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EmployeePayroll {

	private List<EmployeeData> employeePayrollList;

	public EmployeePayroll() {
	}

	public EmployeePayroll(List<EmployeeData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.print("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.print("Enter Employee Name: ");
		String name = consoleInputReader.next();
		System.out.print("Enter Employee Salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeeData(id, name, salary));
	}

	private void writeEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("\nWriting Employee Payroll Data to Console\n" + employeePayrollList);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll Service");
		List<EmployeeData> employeePayrollList = new ArrayList<>();
		EmployeePayroll employeePayrollService = new EmployeePayroll(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData(consoleInputReader);
	}

}
