package com.wipro.Collections.Maps.Maps4;

public class Maps4 {

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("prem", 955518657);
		contactsList.addContact("vamsi", 964484154);
		contactsList.addContact("murthy", 948462684);
				
		System.out.println("prem: " + contactsList.doesContactNameExist("prem"));
		System.out.println("955518657: " + contactsList.doesContactNumberExist(955518657));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}