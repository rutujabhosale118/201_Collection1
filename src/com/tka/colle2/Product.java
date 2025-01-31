package com.tka.colle2;

public class Product {
	private int productid;
	private String productName;
	private int productQty;
	private double productprice;
	private String productdate;
	private String productexpdate;
	
	public Product() {

	}

	public Product(int productid, String productName, int productQty, double productprice, String productdate,
			String productexpdate) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productQty = productQty;
		this.productprice = productprice;
		this.productdate = productdate;
		this.productexpdate = productexpdate;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public String getProductdate() {
		return productdate;
	}

	public void setProductdate(String productdate) {
		this.productdate = productdate;
	}

	public String getProductexpdate() {
		return productexpdate;
	}

	public void setProductexpdate(String productexpdate) {
		this.productexpdate = productexpdate;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", productQty=" + productQty
				+ ", productprice=" + productprice + ", productdate=" + productdate + ", productexpdate="
				+ productexpdate + "]";
	}
	
	

}
