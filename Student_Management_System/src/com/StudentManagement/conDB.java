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

/** Need to address the need of independent initiation of the database
 * and its security capability probably using SHA-512 and some salting iterations
 * this is temporary for now to prioritize the main functionality.
 * 
 * @see this query from stackoverflow about hashing and salting
 *  here: https://stackoverflow.com/questions/18142745/how-do-i-generate-a-salt-in-java-for-salted-hash
*/
public class conDB {
	public Connection connectionString() {
		Connection conn = null;
		try {
			Locale.setDefault(Locale.ENGLISH);
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student_manager", "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		return conn;
	}

}
