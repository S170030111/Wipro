package com.wipro.Collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("prem");
		list.add("vamsi");
		list.add("murthy");
		
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}