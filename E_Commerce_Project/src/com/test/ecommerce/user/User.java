package com.test.ecommerce.user;
//created by suvarna
public class User {
//uId,Username,password,firstName,lastName,phoneNo,email,address,City
	private int uId;
	private String Username;
	private String password ;
	private String firstName ;
	private String lastName ;
	String phoneNo;
	private String email;
	private String address;
	private String City ;
	
	//generate constructor
	public User(int uId, String username, String password, String firstName, String lastName, String phoneNo,
			String email, String address, String city) {
		super();
		this.uId = uId;
		Username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		City = city;
	}


	public User(String username, String password, String firstName, String lastName, String phoneNo, String email,
			String address, String city) {
		super();
		Username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		City = city;
	}


	public User() {
		super();
		
	}

	//generate getters and setters for all field
	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}

	//generate toString()
	@Override
	public String toString() {
		return "User [uId=" + uId + ", Username=" + Username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + ", email=" + email + ", address=" + address
				+ ", City=" + City + "]";
	}
	
	



	
	
	
	
	
}
