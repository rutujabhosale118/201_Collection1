package com.tka.collection;

import java.util.Scanner;

public class ProductUtility {
	static Scanner scanner=new Scanner(System.in);
	public static Product prepareProduct() {

		System.out.println("Enter Product Id");
		int productid=scanner.nextInt();

		System.out.println("Enter The Name");
		String productname=scanner.next();

		System.out.println("Enter the Qty");
		int productQuentity=scanner.nextInt();

		System.out.println("Enter the Price");
		double productprice=scanner.nextDouble();

		System.out.println("Enter the Productdate");
		String productdate=scanner.next();

		System.out.println("Enter The Exdate");
		String productexpdate=scanner.next();

Product product=new Product(productid, productname, productQuentity, productprice, productdate, productexpdate);
		return product;

	}

}
