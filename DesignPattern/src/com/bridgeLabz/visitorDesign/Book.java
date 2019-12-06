package com.bridgeLabz.visitorDesign;

public class Book implements ItemElement
{
      private int price;
      private String bookName;
      
      public Book(int price, String bookName)
      {
    	  this.price = price;
    	  this.bookName = bookName;
      }
      
      public int getPrice()
      {
    	  return price;
      }
      
      public String getBookName()
      {
    	  return bookName;
      }
      
      public int accept(CartVisitor visitor)
      {
  		return visitor.visit(this);
  	}
}
