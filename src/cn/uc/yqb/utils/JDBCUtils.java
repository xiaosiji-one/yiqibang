package cn.uc.yqb.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库连接工具类
 * @author Administrator
 *
 */

public class JDBCUtils {
	
	/*private final static String driverName="com.mysql.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3306/china_bank";
	private final static String user = "root";
	private final static String password = "root";*/
	
	static Properties p = new Properties();
	static{
		
		
		
		try {
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(new File("db.properties")));
			p.load(is);
			Class.forName(p.getProperty("driverName"));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//声明一个连接
	public static Connection openConnection() throws SQLException{
		
		return DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));
		
	}
	
	//关闭连接、执行器、结果集
	public static void closeConnection(Connection conn,PreparedStatement ps,ResultSet rs){
		
		try {
			if(rs!=null){
				rs.close();				
			}
			if(ps!=null){
				ps.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
