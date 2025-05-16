/*    Copyright (c) 2025, Barclays and/or its affiliates. All rights reserved.
 * 
 */

package sourcefiledeclaration;

/**
 * @author Manish Verma This is Employee class.
 */
public class Employee {

	int empId;
	String empName;
	double salary;

	final static String COMPANY_NAME = "TCS";

	/**
	 * 
	 */
	public void getStudentDetails() {
		System.out.println(COMPANY_NAME);
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
	}

	public static void main(String... k) {
		Employee emp = new Employee();
		emp.getStudentDetails();
	}

}
