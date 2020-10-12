package EmployeePayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayroll {

	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayroll(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
		EmployeePayroll employeePayroll = new EmployeePayroll(employeePayrollList);
		Scanner sc = new Scanner(System.in);
		employeePayroll.readFromConsole(sc);
		employeePayroll.writeToConsole();

	}

	private void readFromConsole(Scanner sc) {
		System.out.println("Enter the Employee id");
		int empId = sc.nextInt();
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter employee salary");
		Double salary = sc.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(empId, name, salary));
	}

	private void writeToConsole() {
		System.out.println("Check the entered details " + employeePayrollList);

	}

}
