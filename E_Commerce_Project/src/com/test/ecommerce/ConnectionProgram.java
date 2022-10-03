package com.test.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;

//connection pooling ---created by suvarna
public class ConnectionProgram {
	//design method for create connection
		public Connection createConnection() {
			
			Connection con=null;
			try {
				//1.load driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//2. establish connection with mysql
				String url="jdbc:mysql://localhost:3306/ecommerce";
				String user="root";
				String password="root";
				
				 con = DriverManager.getConnection(url, user, password);
				//System.out.println("Connection successfully....");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return con;		
		}
		
		public static void main(String[] args) {
			ConnectionProgram connectionProg=new ConnectionProgram();
			Connection c = connectionProg.createConnection();
			System.out.println(c);
		}
}
