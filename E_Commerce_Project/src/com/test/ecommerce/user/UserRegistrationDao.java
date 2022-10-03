package com.test.ecommerce.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.test.ecommerce.ConnectionProgram;

public class UserRegistrationDao {
	//design method insertUserRegInToDB()-----created by pravin---------------------------------------------------
	public void insertUserRegInToDB(User user) throws Exception {	
		char ch;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			// do {
			ConnectionProgram connectionProgram = new ConnectionProgram();
			con = connectionProgram.createConnection();
			ps = con.prepareStatement("INSERT into userRegistration(userName, password,firstName,lastName,phoneNo,email,address,city) VALUES (?,?,?,?,?,?,?,?)");
			
//			System.out.println("<<<<<Enter User Details For Create User Login....>>>>>>>>");
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter the user name");
//			String Username = sc.next();
//			System.out.println("enter the Password");
//			String password = sc.next();
//			System.out.println("enter the FirstName");
//			String firstName = sc.next();
//			System.out.println("enter the LastName");
//			String lastName = sc.next();
//			System.out.println("enter the phoneNo");
//			String phoneNo = sc.next();
//			System.out.println("enter the email");
//			String email = sc.next();
//			System.out.println("enter the address");
//			String address = sc.next();
//			System.out.println("enter the City");
//			String City = sc.next();
//			
//			//create user object to store user details   --new added by suvarna
//			User user=new User(Username,password,firstName,lastName,phoneNo,email,address,City); //--new added by suvarna
//			System.out.println("user object : "+user);//print the user object		//--new added by suvarna
//			
			
//			ps.setString(1,Username);
//			ps.setString(2,password);
//			ps.setString(3,firstName);
//			ps.setString(4,lastName);
//			ps.setString(5,phoneNo);
//			ps.setString(6,email);
//			ps.setString(7,address);
//			ps.setString(8,City);
			
			
			ps.setString(1,user.getUsername());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getFirstName());
			ps.setString(4,user.getLastName());
			ps.setString(5,user.getPhoneNo());
			ps.setString(6,user.getEmail());
			ps.setString(7,user.getAddress());
			ps.setString(8,user.getCity());
			int j = ps.executeUpdate();
			//System.out.println("insertion complete" +   j);
			
			System.out.println("User Register Successfully.........");//added by suvarna
			//System.out.println("Welcome "+Username+"...........");  //added by suvarna
			
			System.out.println("Welcome To Ecommerce Application ...."+user.getUsername());   //--new added by suvarna
			
			//System.out.println("Do you want to enter more data then press Y");
			//ch = sc.next().charAt(0);


			//---Display login user details to user on application----added by suvarna-------------
			UserRegistrationDao userRegistrationDao=new UserRegistrationDao();
			userRegistrationDao.selectUserRegInfo();

			//show all product detail list from Products class to user with ascending order -----added by suvarna
			Products products=new Products();
			products.displayProducts();    //display all product list to user in asc order

			//-----------------new added by suvarna------------------------
			//System.out.println("User id="+user.getuId());
			int uid=user.getuId();
			String Username=user.getUsername();
			String password= user.getPassword();
			String firstName=user.getFirstName();
			String lastName =user.getLastName();
			String phoneNo=user.getPhoneNo();
			String email=user.getEmail();
			String address=user.getAddress();
			String City=user.getCity();
			//----------------------------------------
			
//			//display user selected product from list to user -----added by suvarna
//			UserProductList userProductList = new UserProductList();
//			//userProductList.insertUserproductList(Username,password,firstName,lastName,phoneNo,email,address,City);  //for inserting user selected product into db
//			userProductList.insertUserproductList(uid,Username,password,firstName,lastName,phoneNo,email,address,City);   //new added by suvarna
//			//..........................................................................................

		}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
		}
	}//end insertUserRegInToDB

	//added new getUserUId for inserted user
	public int getRegUserUId() {
		int uid=0;
		try {
			ConnectionProgram connectionProg=new ConnectionProgram();
			Connection con = connectionProg.createConnection();

			//query
			//uId, userName, password, firstName, lastName, phoneNo, email, address, city
			String q=" select * from ecommerce.userregistration order by uId desc limit 1 ";   
			PreparedStatement ps = con.prepareStatement(q);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				/*
				 * System.out.println("uId : "+rs.getInt(1));
				 * System.out.println("userName : "+rs.getString(2));
				 * System.out.println("password :"+rs.getString(3));
				 * System.out.println("firstName :"+rs.getString(4));
				 * System.out.println("lastName :"+rs.getString("lastName"));
				 * System.out.println("phoneNo :"+rs.getLong("phoneNo"));
				 * System.out.println("email :"+rs.getString("email"));
				 * System.out.println("address :"+rs.getString("address"));
				 * System.out.println("city :"+rs.getString("city"));
				 */
				//System.out.println("------------------------------------------------");
				uid=rs.getInt(1);     

				//System.out.println("*********************************");
			}


		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return uid;
	}
	
	//----------------------------------------------------------------------------------------------------
	//design method for show register user details to user -----created by suvarna
	public void selectUserRegInfo() {
		

		try {
			ConnectionProgram connectionProg=new ConnectionProgram();
			Connection con = connectionProg.createConnection();

			//query
			//uId, userName, password, firstName, lastName, phoneNo, email, address, city
			String q=" select * from ecommerce.userregistration order by uId desc limit 1 ";   
			PreparedStatement ps = con.prepareStatement(q);

			ResultSet rs = ps.executeQuery();
			System.out.println("********* User Login Details  *********");

			while(rs.next()) {
				//productId, pSubCatagoryId, pSubCatagory, pPrice, pQuantity

				System.out.println("uId : "+rs.getInt(1));
				System.out.println("userName : "+rs.getString(2));
				System.out.println("password :"+rs.getString(3));
				System.out.println("firstName :"+rs.getString(4));
				System.out.println("lastName :"+rs.getString("lastName"));
				System.out.println("phoneNo :"+rs.getLong("phoneNo"));
				System.out.println("email :"+rs.getString("email"));
				System.out.println("address :"+rs.getString("address"));
				System.out.println("city :"+rs.getString("city"));
				System.out.println("------------------------------------------------");
				

				//System.out.println("*********************************");
			}


		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
