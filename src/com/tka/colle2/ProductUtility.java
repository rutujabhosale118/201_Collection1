package com.tka.colle2;

import java.util.Scanner;

public class ProductUtility {
	static Scanner scanner=new Scanner(System.in);
	public static Product prepareProduct() {

		System.out.println("Enter Product Id");
		int id=scanner.nextInt();

		System.out.println("Enter The Name");
		String name=scanner.next();

		System.out.println("Enter the Qty");
		int Quentity=scanner.nextInt();

		System.out.println("Enter the Price");
		double price=scanner.nextDouble();

		System.out.println("Enter the Productdate");
		String Price=scanner.next();

		System.out.println("Enter The Exdate");
		String Exdate=scanner.next();

		Product product=new Product(id, name, id, price, Exdate, Exdate);

		return product;

	}

}
