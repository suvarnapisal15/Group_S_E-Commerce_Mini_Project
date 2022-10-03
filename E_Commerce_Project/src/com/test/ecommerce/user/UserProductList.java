package com.test.ecommerce.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.ecommerce.ConnectionProgram;

public class UserProductList {


	// create insertUserproductList method   -----created by tejashree
	public void insertUserproductList(int uproductId, int upSubCatagoryId, int upQuantity) {
		//System.out.println("uproductId:"+uproductId+" upSubCatagoryId: "+upSubCatagoryId+" upQuantity :"+upQuantity); //pass user  value 
		// calling insertUserproductList method from UserProductListDao class
		UserProductListDao userProductlistDao=new UserProductListDao();
		//userProductlistDao.selectQuntityToDB();
		userProductlistDao.insertUserproductList(uproductId,upSubCatagoryId,upQuantity);
	}

	//design method insertUserproductList() ----new added by suvarna
	public void insertUserproductList(int uid, String username, String password, String firstName, String lastName,
			String phoneNo, String email, String address, String city, int productId, int pSubCatagoryId, int pQuantity,
			int pPrice) {
		// calling insertUserproductList method from UserProductListDao class
		UserProductListDao userProductlistDao=new UserProductListDao();
		//userProductlistDao.selectQuntityToDB();
		userProductlistDao.insertUserproductList(uid,username,password,firstName,lastName,phoneNo,email,address,city,productId,pSubCatagoryId,pQuantity,pPrice);

	}


	//	  public void insertUserproductList(String username, String password, String firstName, String lastName,String phoneNo, String email, String address, String city) {
	//		// calling insertUserproductList method from UserProductListDao class
	//			UserProductListDao userProductlistDao=new UserProductListDao();
	//			//userProductlistDao.selectQuntityToDB();
	//			userProductlistDao.insertUserproductList(username,password,firstName,lastName,phoneNo,email,address,city);
	//		}


	//------------------------------------------------------------------------------------------------------------------

	//design method for updateQuntity in to db  ----created by suvarna
	public void updateQuntity(int uproductId, int upSubCatagoryId, int upQuantity) {

		//System.out.println("\t uproductId:"+uproductId+"\t upSubCatagoryId: "+upSubCatagoryId+"\t upQuantity :"+upQuantity); //pass user  value 


		UserProductListDao userProductListDao=new UserProductListDao();
		int pQuantity= userProductListDao.selectQuntityToDB(uproductId,upSubCatagoryId);  //get total quantity from db for particular product
		System.out.println("Quantity :" +upQuantity);  //show User selected product Quantity
		System.out.println("************************************************");
		System.out.println("Total available product quantity  :"+pQuantity);
		System.out.println("User selected product quantity :" +upQuantity);

		//calculate remainingPQuantity by (total quantity in db - user selected quantity of subcatagory product)
		int remainingPQuantity=pQuantity-upQuantity;  

		System.out.println("Remaining Product Quantity :"+remainingPQuantity);
		System.out.println("--------------------------------------------------------");
		//update pQuantity column in db by remainingPQuantity after user selected product
		// query = update  ProductSubCatagory set  pQuantity=11 where productId=1 and pSubCatagoryId=1;
		boolean i = userProductListDao.updateQuntityToDB(remainingPQuantity,uproductId,upSubCatagoryId);  //calling method

		// System.out.println("pQuantity Record updated....................");

	}

	//-------------new added-------------------------------------------------
	public int getProductData(int productId, int pSubCatagoryId) {
		UserProductListDao userProductListDao=new UserProductListDao();
		int pPrice=userProductListDao.getProductDetailsTODB( productId, pSubCatagoryId);
		return pPrice;

	}

	//-------------------------new added -------------------------------------------
	//method for calculate the total product price selected by user-----created by tejashree
	public void  calculateTotalproductPrice(int uid2) {
		try {
			//jdbc connection
			// create the object of  ConnectionProgram class for load driver and establish connection
			ConnectionProgram connectionProgram=new ConnectionProgram();
			Connection con=connectionProgram.createConnection();
			// select query for retrive the product selected by user
			//upId, uid, userName, passward, firstName, lastName, phoneNo, productId, pName, pDescription, pSubCatagoryId, pSubCatagory, pPrice, pQuantity, pQuantity, pPrice
			String q="SELECT pQuantity,pPrice,uid,productId,upId,pName FROM  UserProductList where uid="+uid2;
			// prepared statement
			PreparedStatement ps=con.prepareStatement(q);
			// store the result into ResultSet
			ResultSet rs=ps.executeQuery();
			//System.out.println("count "+rs.getRow());
			while(rs.next()) {
				// Printing  the data 
				
				System.out.println("pQuantity >> " +rs.getInt(1)); 
				System.out.println("pPrice >> " +rs.getString(2));
				System.out.println("Product Name >> "+rs.getString(6));
				
				//store data into variables
				int uid=rs.getInt(3);   //---new added
				int ProductId=rs.getInt(4);
				int upId=rs.getInt(5);
				String pName=rs.getString(6);
				
				int pQuantity=rs.getInt(1);
				int pPrice	=rs.getInt(2);
				// calculate total Amount
				int totalAmount=pPrice*pQuantity;
				// print the total Amount
				System.out.println("Total product Amount  ="+totalAmount);
				// calling displayAmount method 
				displayAmount(totalAmount,ProductId,upId,pName,pQuantity,pPrice,uid); 

			} }

		catch(Exception e) {
			e.printStackTrace();
		}
	}

	// displayAmount method  ----created by vishal 
	public void displayAmount(int totalAmount, int productId, int upId, String pName, int pQuantity, int pPrice, int uid) {
		//System.out.println("Toatal Amount="+totalAmount);
		// calling insertTotalAmount method from productListDao class
		UserProductListDao userProductlistdao=new UserProductListDao();
		userProductlistdao.insertTotalPAmount(totalAmount,productId,upId,pName,pQuantity,pPrice,uid);
	}

	//------------------------------------end ------------------------------------------

	public static void main(String[] args) {
		UserProductList userProductList=new UserProductList();
		//userProductList.updateQuntity(0, 0, 0);

		// calling insertUserproductList method
		//userProductList.insertUserproductList(0, 0, 0); 
		//userProductList.calculateTotalproductPrice();

	}








}
