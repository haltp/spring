package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class JdbcUtil {
	
	
	// DB연결 메서드
	public static Connection connect() {
		Connection conn = null;
		try {
			//Class.forName(dbdriver);
			//conn =  DriverManager.getConnection (dburl, user, passwd);
			
			//dbcp connection
			Context initContext = new InitialContext();
			//Context envContext  = (Context)initContext.lookup("java:/comp/env"); //jndi
			//DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			DataSource ds = (DataSource)initContext.lookup("java:/comp/env/jdbc/myoracle");
			conn = ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return conn;
	}

	public static void disconnect(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void disconnect(PreparedStatement pstmt, Connection conn) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
