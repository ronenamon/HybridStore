package com.server.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLUtil {
	/*
	 * this class is used to open and get SQL connection
	 */
	private static Connection connection = null;
	public static String url = "jdbc:mysql://localhost:3306/appbackenddb";
	public static String username = "root";
	public static String password = "shadi1309";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null || connection.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(MySQLUtil.url, MySQLUtil.username, MySQLUtil.password);
            return connection;
        } else return connection;
    }
}
