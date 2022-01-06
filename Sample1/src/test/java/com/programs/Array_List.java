package com.programs;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
ArrayList al = new ArrayList();
		
		al.add(10);
		al.add("Hi");
		al.add('C');
		
		//print the collections
		System.out.println(al);
		//Size
		System.out.println("The size of collection:"+al.size());
		//remove
		al.remove(2);
		System.out.println("after removing one collection"+al);
		
		//add elements using index
		
		al.add(2,"Java");
		System.out.println("After inserting the element:"+al);
		
		//retrieve particular element in collection
		System.out.println(al.get(1));
		
		// set method/replace value
		al.set(1, "Hello");
		System.out.println("after replaced the value:"+al);
		
		// search -contains()
		
		System.out.println(al.contains("Hello"));

	}

}

