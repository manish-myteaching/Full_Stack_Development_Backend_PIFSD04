package sourcefiledeclaration;

public class QueryTest {

	class Student {
		public final static String GET_STUDENT = "SELECT * FROM STUDENT";
		public static String DELETE_STUDENT = "DELETE STUDENT WHERE EID=?";
	}

	class Employee {
		public static String GET_EMPLOYEE = "SELECT * FROM EMPLOYEE";
		public static String DELETE_EMPLOYEE = "DELETE EMPLOYEE WHERE EID=?";

	}

	interface Demo3 {

	}

}
