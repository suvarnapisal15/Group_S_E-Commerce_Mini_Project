package com.test.ecommerce;

import java.util.Scanner;

import com.test.ecommerce.admin.Admin;
import com.test.ecommerce.user.User;
import com.test.ecommerce.user.UserProductList;
import com.test.ecommerce.user.UserRegistration;
import com.test.ecommerce.user.UserRegistrationDao;
//EcommerceMain class -----created by suvarna
public class EcommerceMain {

	public static void main(String[] args) throws Exception {

		System.out.println("********** Welcome To E-Commerce Application **********");
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("\n============>>> Create Account <<<============");
			System.out.println("PRESS 1 to Create USer Login");
			System.out.println("PRESS 2 to Create Admin Login");
			System.out.println("PRESS 3 to Exit E-Commerce App");
			System.out.println("-----------------------------------------------");
			System.out.print("Enter Your Choice>> ");
			int c=sc.nextInt();
			if(c==1) {
				//create user login
				//add user into db---uId, userName, password, firstName, lastName, phoneNo, email, address, city
				//new change added by suvarna---------------------------------------------3
				System.out.println("<<<<<Enter User Details For Create User Login....>>>>>>>>");
				//Scanner sc = new Scanner(System.in);
				System.out.println("Enter the user name");
				String Username = sc.next();
				System.out.println("Enter the Password");
				String password = sc.next();
				System.out.println("Enter the FirstName");
				String firstName = sc.next();
				System.out.println("Enter the LastName");
				String lastName = sc.next();
				System.out.println("Enter the phoneNo");
				String phoneNo = sc.next();
				System.out.println("Enter the email");
				String email = sc.next();
				System.out.println("Enter the address");
				String address = sc.next();
				System.out.println("Enter the City");
				String City = sc.next();
				
				//create user object to store user details   --new added by suvarna
				User user=new User(Username,password,firstName,lastName,phoneNo,email,address,City); //--new added by suvarna
				//System.out.println("user object : "+user);//print the user object		//--new added by suvarna
				//System.out.println("user id >> "+user.getuId());//0
				//-----------------------------------------------------------------------------
				UserRegistration userRegistration=new UserRegistration();
				userRegistration.userRegistration(user); //calling userRegistration---for register user
				//				
				//UserRegistrationDao userRegistrationDao=new UserRegistrationDao();
				//userRegistrationDao.selectUserRegInfo();
				
				


				while(true) {
					System.out.println("************ Do you want to buy any Products ***************");

					System.out.println("PRESS 1 to Select Product For Purchase");
					System.out.println("PRESS 2 to Exit From Product List");
					System.out.println("-----------------------------------------------");

					int c2=sc.nextInt();
					if(c2==1){
						System.out.println("Enter Product Id >>");
						int productId=sc.nextInt();
						System.out.println("Enter Product SubCatagoryId >>");
						int pSubCatagoryId=sc.nextInt();
						System.out.println("Enter Product Quantity  >>");
						int pQuantity=sc.nextInt();
						
						

						UserProductList userProductList = new UserProductList();
						userProductList.updateQuntity(productId,pSubCatagoryId,pQuantity);
						
						//System.out.println("user.getuid() ::"+user.getuId());   //0 new added
						//System.out.println("user.getUsername() ::"+user.getUsername());   //new added
						UserRegistrationDao userRegistrationDao=new UserRegistrationDao();
						int uid=userRegistrationDao.getRegUserUId();   //new added
						//System.out.println("User Id :"+uid);//new added
						
						
						//System.out.println("new++++++++++");
						int pPrice = userProductList.getProductData(productId,pSubCatagoryId);   //--select q  new added
					   // System.out.println("get product price"+pPrice);

						//new added by suvarna
						userProductList.insertUserproductList(uid,user.getUsername(),user.getPassword(),user.getFirstName(),user.getLastName(),user.getPhoneNo(),user.getEmail(),user.getAddress(),user.getCity(),productId,pSubCatagoryId,pQuantity,pPrice);  //----new added

						//userProductList.insertUserproductList(productId,pSubCatagoryId,pQuantity);  //for inserting user selected product into db
					//---------------------------------calculateTotalproductPrice
						while(true) {
							System.out.println("************ Cart View - Display Product Total Amount  ***************");

							System.out.println("PRESS 1 to Buy Products");
							System.out.println("PRESS 2 to Exit From Cart ");
							System.out.println("-----------------------------------------------");

							int c3=sc.nextInt();
							if(c3==1) {
								userProductList.calculateTotalproductPrice(uid);  //cal total price of selected product
								while(true) {
									System.out.println("************ Payment Page ***************");

									System.out.println("PRESS 1 to Pay");
									System.out.println("PRESS 2 to Exit From Payment Page ");
									System.out.println("-----------------------------------------------");
									
									int c4=sc.nextInt();
									if(c4==1) {
										System.out.println("Payment Successfully............");
									}else if(c4==2) {break;}else {}
								}
								
							}
							else if(c3==2) {break;}
							else {}
						}
						//----------------------------------
					
					}
					else if(c2==2) {
						break;
					}else {}	
				}//while end
				System.out.println("Thank You For Visiting.................");

			}
			else if(c==2) {

				//create admin login
				Admin admin =new Admin();
				admin.adminRegistration();  //calling adminLogin---for register admin

				while(true) {
					System.out.println("\n============>>> Admin Portal <<<============");
					System.out.println("PRESS 1 to Display User History");
					System.out.println("PRESS 2 to Check Product Quantity");
					System.out.println("PRESS 3 to Exit Admin Portal");
					System.out.println("-----------------------------------------------");
					System.out.print("Enter Your Choice >> ");
					int c1=sc.nextInt();
					if(c1==1) {
						admin.displayUserHistory();}
					else if(c1==2){
						admin.checkProducQuantity();}
					else if(c1==3) {
						break;
					}
					else {}
				}//end while
				System.out.println("Thank You For Visiting Admin Portal.................");

			}
			else if(c==3){
				//exit app
				break;
			}
			else {

			}

		}//end while loop
		System.out.println("Thank You For Using E_Commerce Application...........");
	}
}
