package com.test.ecommerce.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.test.ecommerce.ConnectionProgram;

public class UserRegistration {

	public void userRegistration(User user) throws Exception {
		System.out.println("In userRegistration......");
		
		UserRegistrationDao userRegistrationDao=new UserRegistrationDao();   //-----new added by suvarna
		userRegistrationDao.insertUserRegInToDB(user);	//new dded by suvarna
		
		//-------3/10 c--------------added by suvarna-----------------------------------------------------
//		UserRegistrationDao userRegistrationDao=new UserRegistrationDao();
//		userRegistrationDao.insertUserRegInToDB();
		
		//-------------------------------------------------------------------
		
		/*
		 * //all product details in Products class -----created by suvarna Products
		 * products=new Products(); products.displayProducts(); //display all product
		 * list to user in asc order
		 */	}
}
