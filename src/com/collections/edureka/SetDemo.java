package com.collections.edureka;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>(); //Data is unordered but it is alphabetically sorted.
		
		
		//Here data is not added as in indexing approach.
		//We got hashcodes for elements which are being added
		set.add("Jordan");
		set.add("Maxwell");
		set.add("Neesham");
		set.add("Maxwell");
		set.add("Ferguson");
		set.add("Maxwell");
		
		System.out.println("set is : " +set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("Neesham");
		System.out.println("set after removing Neesham  is : " +set);
		
		if(set.contains("Ferguson")){
			System.out.println("Ferguson is in the set");
		}
		
		System.out.println("set size is : " +set.size());
	}

}
