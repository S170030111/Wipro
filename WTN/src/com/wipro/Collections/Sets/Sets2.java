package com.wipro.Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class Sets2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Prem");
		set.add("vamsi");
		set.add("krishna");
				
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}