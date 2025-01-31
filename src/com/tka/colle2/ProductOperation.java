package com.tka.colle2;

import java.util.ArrayList;
import java.util.List;

public class ProductOperation {
	List<Product>list=new ArrayList<Product>();
	public String addProduct(Product product) {
		list.add(product);
		return "Product Added Successfully !";
		
	}

}
