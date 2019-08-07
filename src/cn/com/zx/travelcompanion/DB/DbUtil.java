package cn.com.zx.travelcompanion.DB;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	public static  Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		ClassLoader cl=DbUtil.class.getClassLoader();
		InputStream in=cl.getResourceAsStream("db.properties");
		Properties dbconfig=new Properties();
		dbconfig.load(in);
		Connection conn = null;
		Class.forName(dbconfig.getProperty("jdbc.driverClass"));
		String url = dbconfig.getProperty("jdbc.jdbcUrl");
		String user = dbconfig.getProperty("jdbc.user");
		String pwd = dbconfig.getProperty("jdbc.password");
		conn = DriverManager.getConnection(url, user, pwd);
		System.out.println("链接成功");
		return conn;
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
	          DbUtil.getConnection();
	}
	public static void closeConnection(Connection conn, PreparedStatement pre, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pre != null) {
				pre.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
