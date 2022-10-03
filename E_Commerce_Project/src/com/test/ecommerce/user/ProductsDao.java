package com.test.ecommerce.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.ecommerce.ConnectionProgram;

//create ProductDao class for jdbc ----created by suvarna
public class ProductsDao {
	////design method for insert Product data in to DB
	public boolean insertProductsToDB(String ct) {
		boolean f=false;
		//jdbc code
		try {
			//create object of ConnectionProg class for load driver and establish the connection to db
			ConnectionProgram connectionProgram=new ConnectionProgram();
			Connection con = connectionProgram.createConnection(); //connection method calling for establish connection and load driver

			//PreparedStatement
			String q="INSERT INTO products( productName,description)VALUES(?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1,ct );
			ps.setString(2,ct ); //set the value
			
			//execute.. i.e submit query to db 
			ps.executeUpdate();
			f=true;

		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}//end insertProductsToDB()
	
	
	//design method for insertPSubCategoriesToDB()
	
	public void insertPSubCategoriesToDB(int productId, String pSubCategories, int pPrice, int pQuantity) {
		//jdbc code
				try {
					//create object of ConnectionProg class for load driver and establish the connection to db
					ConnectionProgram connectionProgram=new ConnectionProgram();
					Connection con = connectionProgram.createConnection(); //connection method calling for establish connection and load driver

					//PreparedStatement   ------productsubcatagory ----productId, pSubCatagoryId, pSubCatagory, pPrice, pQuantity
					String q="INSERT INTO productsubcatagory(productId,pSubCatagory,pPrice,pQuantity)VALUES(?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(q);
					ps.setInt(1,productId );
					ps.setString(2,pSubCategories ); //set the value
					ps.setInt(3,pPrice );
					ps.setInt(4,pQuantity );
					
					//execute.. i.e submit query to db 
					ps.executeUpdate();
					//f=true;

				}catch(Exception e) {
					e.printStackTrace();
				}
	}//end insertPSubCategoriesToDB()


	//design method for displayAllProductsList() from db
	public void displayAllProductsList() {
		
		try {
			ConnectionProgram connectionProg=new ConnectionProgram();
			Connection con = connectionProg.createConnection();
			
			String q=" select * from products inner join ProductSubCatagory\r\n"
					+ " on products.productId=ProductSubCatagory.productId \r\n"
					+ " order by products.productId asc  ";  //products.productId   pPrice ----order by 
			PreparedStatement ps = con.prepareStatement(q);
			
			ResultSet rs = ps.executeQuery();
			System.out.println("*********Show All Product List *********");
			while(rs.next()) {
				//productId, productName, description, productId, pSubCatagoryId, pSubCatagory, pPrice, pQuantity
				System.out.println("productId : "+rs.getInt(1));
				System.out.println("productName :"+rs.getString(2));
				System.out.println("pSubCatagoryId :"+rs.getInt(5));
				System.out.println("pSubCatagory :"+rs.getString(6));
				System.out.println("pPrice :"+rs.getInt("pPrice"));
				System.out.println("pQuantity :"+rs.getInt("pQuantity"));
				System.out.println("*********************************");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	
}
