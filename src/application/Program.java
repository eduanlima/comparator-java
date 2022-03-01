package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String args[]) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(new MyComparator());
		print(list);
		
		//Anonymous class 
		Comparator<Product> c = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(c);
		print(list);
		
		//Anonymous function or arrow function
		Comparator<Product> fc = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		list.sort(fc);
		print(list);
		
		//Simplification arrow function
		Comparator<Product> sfc = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	
		list.sort(sfc);
		print(list);
		
		//Improving simplification
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		print(list);
	}
	
	public static void print(List<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
	}
}
