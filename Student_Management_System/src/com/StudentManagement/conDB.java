/**
 * 
 */
package com.StudentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Locale;

/**
 * @author Darkinx
 *
 */
public class conDB {
	public Connection connectionString() {
		Connection conn = null;
		try {
			Locale.setDefault(Locale.ENGLISH);
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/Student_manager", "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		return conn;
	}

}
