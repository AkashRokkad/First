package com.collections.edureka;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		
		// list1 can store only string objects
		ArrayList<String> list1 = new ArrayList<String>();  //type specific
		
		// list can store any type of object
		ArrayList list2 = new ArrayList();   //any type
		
		//Add data into the list
		
		list1.add("Akash"); //0
		list1.add("Manish");//1
		list1.add("Siddu"); //2
		//list1.add("Pradeep"); //3
		//list1.add("Siddu");  //4
		//list1.add(10); //error
		//list1.add(2.2); //error
		
		
		//Add data into list2
		
		list2.add(202);
		list2.add("student");
		list2.add(445.7);
		//list2.add(10,000);
		
		//Print reference to list
		System.out.println("list1 is : " + list1);
		System.out.println("list2 is : " + list2);
		
		//Get the element from the list
		String name = list1.get(2);
		System.out.println("name is :" +name);
		
		Object obj = list2.get(2);
		System.out.println("obj is :" +obj);
		
		//Update the element in the list
		list1.set(0, "Akhil");
		System.out.println("list1 now is :" +list1);
		
		//remove an element from list
		list1.remove(1);
		System.out.println("list1 after removing is :" +list1);
		
		// list1.clear(); //removes all lists
		
		//searching
		if(list1.contains("Akhil")) {
			System.out.println("Akhil is the number1");
		}
		
		//Iterating in ArrayList
		System.out.println("===Iterating with Enhanced for Loop====");
		for(String str : list1) {
			System.out.println(str);
		}
		System.out.println("======");
		
		System.out.println("===Iterator with Iterator====");
		Iterator<String> itr = list1.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
	}
}
