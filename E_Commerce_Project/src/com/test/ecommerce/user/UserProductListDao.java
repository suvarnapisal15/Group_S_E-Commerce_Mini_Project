package com.test.ecommerce.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.ecommerce.ConnectionProgram;

public class UserProductListDao {

	// // create insertUserproductList method
	public void insertUserproductList(int uproductId, int upSubCatagoryId, int upQuantity) {

		// Connection variable con
		Connection con=null;
		try {

			//jdbc connection
			// create the object of  ConnectionProgram class for load criver and establish connection
			ConnectionProgram connectionProgram=new ConnectionProgram(); 
			con=connectionProgram.createConnection(); 
			// insert query for insert data selected from user
			//upId, uid, userName, passward, firstName, lastName, phoneNo, productId, pName, pDescription, pSubCatagoryId, pSubCatagory, pPrice, pQuantity
			int uid=1;
			String userName="teju";
			String passward="teju1325";
			String firstName="tejashri";
			String lastName="patil";
			long phoneNo=2342314500L;
			int productId=uproductId;//1;
			String pName="E_Equipments";
			String pDescription ="Electronics Equipments";
			int pSubCatagoryId = upSubCatagoryId;//1;
			String pSubCatagory ="mobile";
			int pPrice =20000;
			int pQuantity= upQuantity;//1;
			String q="INSERT into userProductList(uid,userName,passward,firstName,lastName,phoneNo,productId,pName,pDescription,pSubCatagoryId,pSubCatagory,pPrice,pQuantity)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			//prepared statement
			PreparedStatement ps=con.prepareStatement(q); 
			// insert the value for userProduct list column
			ps.setInt(1, uid);
			ps.setString(2,userName );
			ps.setString(3, passward); 
			ps.setString(4, firstName); 
			ps.setString(5, lastName); 
			ps.setLong(6, phoneNo);
			ps.setInt(7, productId); 
			ps.setString(8,pName);
			ps.setString(9,pDescription); 
			ps.setInt(10, pSubCatagoryId); 
			ps.setString(11, pSubCatagory);
			ps.setInt(12, pPrice); 
			ps.setInt(13, pQuantity); 
			// execute update method for insert data into table
			int i=ps.executeUpdate();
			System.out.println("insertion complete"+i);

		} catch(Exception e) { 
			e.printStackTrace(); 
		} 
	}

	public void insertUserproductList(int uid2, String uusername, String upassword, String ufirstName, String ulastName,String uphoneNo, String uemail, String uaddress, String ucity, int productId2, int pSubCatagoryId2, int pQuantity2, int pPrice2) {

		// Connection variable con
		Connection con=null;String productName=null;
		try {

			//jdbc connection
			// create the object of  ConnectionProgram class for load criver and establish connection
			ConnectionProgram connectionProgram=new ConnectionProgram(); 
			con=connectionProgram.createConnection(); 
			//-------------get product name--------------------------------------------------------------
			String query="  select products.productName,products.description ,ProductSubCatagory.* from products inner join ProductSubCatagory on products.productId=ProductSubCatagory.productId where products.productId="+productId2+" and ProductSubCatagory.pSubCatagoryId="+pSubCatagoryId2;   
			PreparedStatement pst = con.prepareStatement(query);

			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) { productName=rs.getString(1);}
			//-------------------------------------------------------------------------
			// insert query for insert data selected from user
			//upId, uid, userName, passward, firstName, lastName, phoneNo, productId, pName, pDescription, pSubCatagoryId, pSubCatagory, pPrice, pQuantity
			int uid=uid2;//1;
			String userName=uusername;//"teju";
			String passward=upassword;//"teju1325";
			String firstName=ufirstName; //"tejashri";
			String lastName=ulastName; //"patil";
			String phoneNo=uphoneNo; //2342314500L;
			int productId=productId2;//1;
			String pName=productName;//"E_Equipments";
			String pDescription = productName; //"Electronics Equipments";
			int pSubCatagoryId =pSubCatagoryId2;//1;
			String pSubCatagory = "mobile";
			int pPrice =pPrice2;
			int pQuantity= pQuantity2;//upQuantity;//1;
			String q="INSERT into userProductList(uid,userName,passward,firstName,lastName,phoneNo,productId,pName,pDescription,pSubCatagoryId,pSubCatagory,pPrice,pQuantity)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			//prepared statement
			PreparedStatement ps=con.prepareStatement(q); 
			// insert the value for userProduct list column
			ps.setInt(1, uid);
			ps.setString(2,userName );
			ps.setString(3, passward); 
			ps.setString(4, firstName); 
			ps.setString(5, lastName); 
			ps.setString(6, phoneNo);
			ps.setInt(7, productId); 
			ps.setString(8,pName);
			ps.setString(9,pDescription); 
			ps.setInt(10, pSubCatagoryId); 
			ps.setString(11, pSubCatagory);
			ps.setInt(12, pPrice); 
			ps.setInt(13, pQuantity); 
			// execute update method for insert data into table
			int i=ps.executeUpdate();
			//System.out.println("insertion complete"+i);

		} catch(Exception e) { 
			e.printStackTrace(); 
		} 
	}

	//------------------------new added----------------------------
	// create method insertTotalPAmount
	public void insertTotalPAmount(int totalAmount, int productId, int upId, String pName, int pQuantity, int pPrice, int uid) {
		// Connection variable con
		Connection con=null;
	try {
		//jdbc connection
	      // create the object of  ConnectionProgram class for load criver and establish connection
		ConnectionProgram connectionProgram=new ConnectionProgram(); 
		 con = connectionProgram.createConnection();
		 // inseri query to insert product details into userproductamount table
		String q="insert into userproductamount(uId,productId,upId,pPrise,pQuantity,totalPrise)values(?,?,?,?,?,?)";
		// preaperStatement
		 PreparedStatement ps = con.prepareStatement(q);
		   // inserting value
			ps.setInt(1, uid);
			ps.setInt(2, productId);
			ps.setInt(3,upId);
			ps.setInt(4,pPrice);
			ps.setInt(5,pQuantity);
		    ps.setInt(6, totalAmount );
		    // execute method to pass the query to database
            int i=  ps.executeUpdate();
            //System.out.println("completed"+i);
		}
		catch(Exception e) {
			e.printStackTrace();
	}
	}
	//---------------------------end new --------------------------
	//design method for selectQuntityToDB()----created by suvarna------------------------------------------
	//design method for updateQuntity into db ProductSubCatagory---table
	public int selectQuntityToDB(int uproductId, int upSubCatagoryId){


		//for select the original count of quantity in to table ProductSubCatagory for particular pSubCatagory
		int pQuantity=0; //Initialize and declare var pQuantity to store total quantity into db
		try {
			ConnectionProgram connectionProg=new ConnectionProgram();
			Connection con = connectionProg.createConnection();

			//query
			int pId=uproductId;
			int pSubCatId=upSubCatagoryId;
			String q=" SELECT * FROM  ProductSubCatagory WHERE productId="+pId+" AND pSubCatagoryId="+pSubCatId;   
			PreparedStatement ps = con.prepareStatement(q);

			ResultSet rs = ps.executeQuery();
			System.out.println("*********Show User Selected Product List *********");

			while(rs.next()) {
				//productId, pSubCatagoryId, pSubCatagory, pPrice, pQuantity
				System.out.println("productId : "+rs.getInt(1));
				System.out.println("pSubCatagoryId :"+rs.getInt(2));
				System.out.println("pSubCatagory :"+rs.getString(3));
				System.out.println("pPrice :"+rs.getInt("pPrice"));
				//System.out.println("pQuantity :"+rs.getInt("pQuantity"));
				pQuantity=rs.getInt("pQuantity"); //assine pQuantity from db to var pQuantity
				//System.out.println("*********************************");
			}


		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return pQuantity;  //return  pQuantity to method
	}
	//design method for updateQuntityToDB() ----created by suvarna
	public boolean updateQuntityToDB(int remainingPQuantity, int uproductId, int upSubCatagoryId) {
		boolean f=false;
		//jdbc code
		try {
			//create object of ConnectionProg class for load driver and establish the connection to db
			ConnectionProgram connectionProg=new ConnectionProgram();
			Connection con = connectionProg.createConnection(); //connection method calling for establish connection and load driver

			//PreparedStatement
			int rPQuantity=remainingPQuantity;
			int pId=uproductId;
			int pSubCatId=upSubCatagoryId;
			String q="UPDATE  ProductSubCatagory SET  pQuantity="+rPQuantity+" WHERE productId=? AND pSubCatagoryId=?";

			PreparedStatement ps = con.prepareStatement(q);
			//ps.setInt(1, rPQuantity);
			ps.setInt(1, pId); //set the value
			ps.setInt(2,pSubCatId);


			//execute.. i.e submit query to db 
			ps.executeUpdate();
			f=true;

		}catch(Exception e) {
			e.printStackTrace();
		}
		return f; //return true/false to method

	}

	//new added by suvarna
	public int getProductDetailsTODB(int productId, int pSubCatagoryId) {
		//Object product;
		int pPrice=0;
		try {
			ConnectionProgram connectionProg=new ConnectionProgram();
			Connection con = connectionProg.createConnection();

			//query
			//productName, description, productId, pSubCatagoryId, pSubCatagory, pPrice, pQuantity
			String q="  select products.productName,products.description ,ProductSubCatagory.* from products inner join ProductSubCatagory on products.productId=ProductSubCatagory.productId where products.productId="+productId+" and ProductSubCatagory.pSubCatagoryId="+pSubCatagoryId;   
			PreparedStatement ps = con.prepareStatement(q);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				/*
				 * System.out.println("productName : "+rs.getString(1));
				 * System.out.println("description : "+rs.getString(2));
				 * System.out.println("productId :"+rs.getInt(3));
				 * System.out.println("pSubCatagoryId :"+rs.getInt(4));
				 * System.out.println("pSubCatagory :"+rs.getString("pSubCatagory"));
				 * System.out.println("pPrice :"+rs.getInt("pPrice"));
				 * System.out.println("pQuantity :"+rs.getInt("pQuantity"));
				 */
				//System.out.println("------------------------------------------------");
				String productName=rs.getString(1);
				String description= rs.getString(2);
					int	pId=rs.getInt(3);
					int pSubCatId=rs.getInt(4);
					String pSubCatagory=rs.getString("pSubCatagory");
					 pPrice=rs.getInt("pPrice");
					int pQuantity=rs.getInt("pQuantity");
					
					//rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString("pSubCatagory"), s.getInt("pPrice"), rs.getInt("pQuantity")
				//ProductDetails productDetails=new ProductDetails(productName,description,pId,pSubCatId,pSubCatagory,pPrice,pQuantity);
				
//				productDetails.setProductId(rs.getInt(productId));
//				productDetails.setProductName(rs.getString("productName"));
//				productDetails.setProductName(rs.getString("description"));
//				productDetails.setProductName(rs.getString("pSubCatagoryId"));
//				productDetails.setProductName(rs.getString("pSubCatagory"));
//				productDetails.setProductName(rs.getString("pPrice"));
//				productDetails.setProductName(rs.getString("pQuantity"));
				
				//ProductDetails productDetails=new ProductDetails();

				//System.out.println("*********************************");
			}


		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return  pPrice;
		
	}

	


}
