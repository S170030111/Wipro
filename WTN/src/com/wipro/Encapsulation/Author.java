package com.wipro.Encapsulation;

public class Author {
		  private String name;
		  private String email;
		  private char gender;
		  Author(String name,String email,char gender){
		    this.name=name;
		    this.email=email;
		    this.gender=gender;
		  }
		  public String gName() {
			  return name;  
			 
			}
		  public String gEmail() {
			  return email;  
			 
			}
		  public char gGender() {
			  return gender;  
			 
			}
		}
		class Book{
		  private String Bname;
		  Author a;
		  public Author getAuthor() {
			return a;
		}
		public void setAuthor(Author a) {
			this.a = a;
		}
		Book(String Bname){
			  this.Bname=Bname;
		  }
		  public String getBname() {
			return Bname;
		}
		
		  public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQtyInStock() {
			return qtyInStock;
		}
		public void setQtyInStock(int qtyInStock) {
			this.qtyInStock = qtyInStock;
		}
		private double price;
		  private int qtyInStock;
	}
