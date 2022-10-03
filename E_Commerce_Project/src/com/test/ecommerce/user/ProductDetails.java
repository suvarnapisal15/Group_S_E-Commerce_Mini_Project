package com.test.ecommerce.user;

public class ProductDetails {
	//productName, description, productId, pSubCatagoryId, pSubCatagory, pPrice, pQuantity
	
	private String productName;
	private String description;
	private int productId;
	private int pSubCatagoryId;
	private String pSubCatagory;
	private int pPrice ;
	private int pQuantity;
	
	
	
	
	public ProductDetails(String productName, String description, int productId, int pSubCatagoryId,
			String pSubCatagory, int pPrice, int pQuantity) {
		super();
		this.productName = productName;
		this.description = description;
		this.productId = productId;
		this.pSubCatagoryId = pSubCatagoryId;
		this.pSubCatagory = pSubCatagory;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getpSubCatagoryId() {
		return pSubCatagoryId;
	}
	public void setpSubCatagoryId(int pSubCatagoryId) {
		this.pSubCatagoryId = pSubCatagoryId;
	}
	public String getpSubCatagory() {
		return pSubCatagory;
	}
	public void setpSubCatagory(String pSubCatagory) {
		this.pSubCatagory = pSubCatagory;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	@Override
	public String toString() {
		return "ProductDetails [productName=" + productName + ", description=" + description + ", productId="
				+ productId + ", pSubCatagoryId=" + pSubCatagoryId + ", pSubCatagory=" + pSubCatagory + ", pPrice="
				+ pPrice + ", pQuantity=" + pQuantity + "]";
	}
	
	
	
}
