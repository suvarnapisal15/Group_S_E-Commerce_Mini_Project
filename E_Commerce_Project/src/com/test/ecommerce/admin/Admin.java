package com.test.ecommerce.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.test.ecommerce.ConnectionProgram;

public class Admin {

	//Method design for Admin Registration created by Pravin
	public void adminRegistration() throws SQLException {

		System.out.println("In ADMIN Login........");
		//basic requirement ....store 10 product in to db
		//1.check the quantity of each product by using product id
		//2.display entire register user
		//3.check the particular user history for product purchase details

		System.out.println("<<<<<enter the data For Admin Registration....>>>>>>>>");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Admin user name"); String Username = sc.next();
		System.out.println("Enter the Admin Password"); String password = sc.next();
		System.out.println("Enter the Admin FirstName"); String firstName =
				sc.next(); System.out.println("Enter the Admin LastName"); String lastName =
				sc.next(); System.out.println("Enter the Admin phoneNo"); long phoneNo =
				sc.nextLong(); System.out.println("Enter the Admin email"); String email =
				sc.next(); System.out.println("Enter the Admin address"); String address =
				sc.next(); System.out.println("Enter the Admin City"); String City =
				sc.next();


				//char ch = sc.next().charAt(0);

				AdminDao adminDao=new AdminDao(); 
				adminDao.InsertAdminRegToDB(Username,password, firstName, lastName, phoneNo, email, address, City); 
	}




	//Method design to check Product quantity created by Pravin 
	public void checkProducQuantity() throws SQLException 
	{ char ch; Connection con = null;
	PreparedStatement ps = null;

	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter pSubCatagoryId >>");
	int pSubCatagoryId=sc.nextInt();

	try { 
		ConnectionProgram connectionProgram = new ConnectionProgram();
		con =connectionProgram.createConnection();
		//Class.forName("com.mysql.jdbc.Driver"); //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userRegistration", "root","root"); 
		ps =con.prepareStatement("select productId,pSubCatagory,pQuantity from productsubcatagory where pSubCatagoryId="+pSubCatagoryId);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("productId ="+rs.getInt(1));
			System.out.println("pSubCatagory ="+rs.getString(2));
			System.out.println("pQuantity = "+rs.getInt(3));

		} 
	} catch(Exception e) 
	{ 
		e.printStackTrace(); 
	} 
	finally { 
		con.close();
		ps.close(); 
	} }





	//Display User History ---created by vishal
	public void displayUserHistory() { 
		// display user details 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter user id (uId) >>");
		int userId=sc.nextInt();

		AdminDao adminDao=new AdminDao(); adminDao.displayUserHistoryFromDB(userId);

	}
}
