package com.tka.collection;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		int choice=0;
		Scanner scanner=new Scanner(System.in);
		ProductOperation operation=new ProductOperation();
		
		do {
			System.out.println("1. Add Product");
			System.out.println("2. Get Specific Product");
			System.out.println("3.Get All Product");
			
			System.out.println("0 To Terminated Application");
			System.out.println("Enter Your Choice :");
			choice=scanner.nextInt();
			
			switch (choice) {
			case 1:{
				Product product=ProductUtility.prepareProduct();
				String msg = operation.addProduct(product);
         		System.out.println(msg);

				
				break;
			}
			
			case 2: {
				System.out.println("pressed 2");
				
				break;
			}
			
			
			case 3: {
				Object obj=operation.getAllProject();
				System.out.println(obj);
				break;

			}
			default:
				System.out.println("Invalid Choice");
				choice=0;

			}
		} while (choice!=0);
		System.out.println("Application Terminated");
	
	
	}

}
