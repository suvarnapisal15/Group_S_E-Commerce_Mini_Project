package com.test.ecommerce.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.ecommerce.ConnectionProgram;

//AdminDao class created by vishal
public class AdminDao {
	//design method for insert admin login details into db-------created by vishal
	public void InsertAdminRegToDB(String Username,String password,String firstName,String lastName,long phoneNo,String email,String address,String City) throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
				ConnectionProgram connectionProgram = new ConnectionProgram();
				con = connectionProgram.createConnection();
				ps = con.prepareStatement("INSERT into adminregistration(userName, password,firstName,lastName,phoneNo,email,address,city) VALUES (?,?,?,?,?,?,?,?)");
					
							ps.setString(1,Username);
							ps.setString(2,password);
							ps.setString(3,firstName);
							ps.setString(4,lastName);
							ps.setLong(5,phoneNo);
							ps.setString(6,email);
							ps.setString(7,address);
							ps.setString(8,City);
						int j = ps.executeUpdate();
							System.out.println("Admin Registration complete" +   j);
							//System.out.println("Do you want to enter more data then press Y");
					
			}
			catch (Exception e) {
				e.printStackTrace();
			} finally {
				con.close();
				ps.close();
					}
		}

	
	//design method for display user history to admin ------created by vishal
	public void displayUserHistoryFromDB(int userId) {
		try {
		//System.out.println("vishal");
// connection object	
	ConnectionProgram connectionProgram=new ConnectionProgram(); 
	Connection con = connectionProgram.createConnection();
	
	// prepare Statement 
	String q="select * from  userproductlist WHERE uId="+userId;

		PreparedStatement ps = con.prepareStatement(q);
		
                
               ResultSet rs = ps.executeQuery();
               while(rs.next()) {
            	   //System.out.println("uPaId="+rs.getInt(0));
            	   System.out.println("upId="+rs.getInt(1));
                   System.out.println("uId="+rs.getInt(2));
              
               System.out.println("userName="+rs.getString(3));
               System.out.println("password="+rs.getString(4));
               System.out.println("firstName="+rs.getString(5));
               System.out.println("lastName="+rs.getString(6));
               System.out.println("phoneNo="+rs.getLong(7));
               System.out.println("productId="+rs.getInt(8));
               System.out.println("pName="+rs.getString(9));
               System.out.println("pDescription="+rs.getString(10));
               System.out.println("pSubCatagoryId="+rs.getInt(11));
               System.out.println("pSubcatagory="+rs.getString(12));
               System.out.println("pPrise="+rs.getInt(13));
               System.out.println("pQuantity="+rs.getInt(14));
               
               
               }
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}
}
