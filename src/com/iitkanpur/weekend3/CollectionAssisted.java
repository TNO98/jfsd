package com.iitkanpur.weekend3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionAssisted {
	public static void main(String[] args) {
		System.out.println(" ArrayList with mixed data");
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(5.05);
		al.add("Malay");
		al.add(1909.87f);
		al.add(true);
		System.out.println(al);
		
		System.out.println("ArrayList for specific data");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Kolkata");
		city.add("Mumbai");
		System.out.println(city);
		
		System.out.println("-------------++++++++-------------");
		
		Vector vec = new Vector();
		vec.addElement(15);
		vec.addElement(17);
		vec.addAll(vec);
		
		if(vec.isEmpty()) {
			System.out.println(" vector is empty");
		}
		else {
			System.out.println("Vector has some values in it");
		}
		
		System.out.println(vec);
		
		// creating LinkedList
		
		System.out.println("\n");
		System.out.println("Linked List");
		LinkedList<String> names =new LinkedList<String>();
		names.add("Malay");
		names.add("Sunil");
		System.out.println(names);
		
	}
}
