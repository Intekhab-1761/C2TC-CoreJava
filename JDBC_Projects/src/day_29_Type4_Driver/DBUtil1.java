package day_29_Type4_Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil1 {
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "password";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/giraffe";

	private static Connection connection = null;
	static {
		try {
			//load driver
			Class.forName(DB_DRIVER_CLASS);
			//Establish connection between java application and MySQL database
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}

/*
 * String sql="insert into employee_table(employee_id," +
 * "employee_name,email,esalary,bonus,doj) values(6,'vinay','vinay@gmail.com',40000,3000,'2022-03-23')"
 * ; int n=st.executeUpdate(sql); System.out.println(n + "row"+ "afftected");
 * try { connection.close(); st.close(); } catch(Exception e) {
 * System.out.println(e); }
 */
