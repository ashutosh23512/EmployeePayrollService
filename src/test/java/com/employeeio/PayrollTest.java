package com.employeeio;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;

public class PayrollTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchNumberOfEmployeeEntries() {
		EmployeeData[] arrayOfEmployees = { new EmployeeData(1, "Jeff", 1000.0), new EmployeeData(2, "Mark", 1100.0),
				new EmployeeData(3, "Elon", 1500.0) };
		EmployeePayroll empPayrollService;
		empPayrollService = new EmployeePayroll(Arrays.asList(arrayOfEmployees));
		empPayrollService.writeEmpPayrollData(EmployeePayroll.IOService.FILE_IO);
		Assert.assertEquals(3, empPayrollService.countEntries(EmployeePayroll.IOService.FILE_IO));
	}
}
