package com.wipro.Encapsulation;

public class Encapsulation1 {
	
	public static void main(String[] args) {
		  Book b=new Book("prem");
		  
		  Author au=new Author("prem","prembattineni@gmail.com",'M');
		  b.setPrice(120.50);
		  b.setQtyInStock(200);
		  b.setAuthor(au);
		  
		  
		  System.out.println("Book Name:"+b.getBname()+"\n"+"Price:"+b.getPrice()+"\n"+"Quantity:"+b.getQtyInStock());
		  System.out.println(b.getAuthor().gName());
		  System.out.println(b.getAuthor().gEmail());
		  System.out.println(b.getAuthor().gGender());
		}
		}
