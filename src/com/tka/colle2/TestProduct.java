package com.tka.colle2;

public class TestProduct {
	public static void main(String[] args) {
		//call addproduct method
		
		ProductOperation operation=new ProductOperation();
		
		Product product = ProductUtility.prepareProduct();
		
	String msg = operation.addProduct(product);
	
	System.out.println(msg);
	
	
	}

}
