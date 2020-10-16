package com.employeeio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private List<EmployeeData> employeePayrollList;

	public EmployeePayroll() {
	}

	public EmployeePayroll(List<EmployeeData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public void readEmployeePayrollData(IOService ioService) {
		if (ioService.equals(IOService.CONSOLE_IO)) {
			Scanner consoleInputReader = new Scanner(System.in);
			System.out.print("Enter Employee ID: ");
			int id = consoleInputReader.nextInt();
			System.out.print("Enter Employee Name: ");
			String name = consoleInputReader.next();
			System.out.print("Enter Employee Salary: ");
			double salary = consoleInputReader.nextDouble();
			consoleInputReader.close();
			employeePayrollList.add(new EmployeeData(id, name, salary));
		} else if (ioService.equals(IOService.FILE_IO)) {
			new EmpIOService().readData();
		}
	}

	public void writeEmpPayrollData(IOService ioService) {
		if (ioService.equals(IOService.CONSOLE_IO))
			System.out.println("\nWriting Payroll to Console\n" + employeePayrollList);
		else if (ioService.equals(IOService.FILE_IO))
			new EmpIOService().writeData(employeePayrollList);

	}

	public void printData(IOService ioService) {
		if (ioService.equals(IOService.FILE_IO))
			new EmpIOService().printData();
	}

	public long countEntries(IOService ioService) {
		if (ioService.equals(IOService.FILE_IO))
			return new EmpIOService().countEntries();
		return 0;
	}

}
