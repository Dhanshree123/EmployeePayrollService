package com.capgemini.employeePayroll;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldReturnEmployeeEntries() {
		EmployeePayrollData[] employeeArray = { new EmployeePayrollData(1, "Emma Stone", 50000),
				new EmployeePayrollData(2, "John Snow", 55000), new EmployeePayrollData(3, "Ryan Ice", 50000) };
		EmployeePayroll employeePayroll;
		employeePayroll = new EmployeePayroll(Arrays.asList(employeeArray));
		employeePayroll.writeEmployeePayrollData(EmployeePayroll.IOService.FILE_IO);
		long entries = employeePayroll.countEntries(EmployeePayroll.IOService.FILE_IO);
		Assert.assertEquals(3, entries);
	}
}
