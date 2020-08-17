package com.wipro.Collections.Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class Sets3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Prem");
		set.add("Vamsi");
		set.add("Krishna");
		
		
		Iterator<String> it = set.iterator();
		String query = "Prem";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}