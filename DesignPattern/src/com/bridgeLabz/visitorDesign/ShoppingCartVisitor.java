package com.bridgeLabz.visitorDesign;

public class ShoppingCartVisitor implements CartVisitor 
{

	@Override
	public int visit(Book book)
	{
		int cost=0;
		if(book.getPrice() > 50)
		{
			cost = book.getPrice()-5;
		}else cost = book.getPrice();
		System.out.println("Book Name : "+book.getBookName() + " Price = "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit)
	{
		int total = fruit.getPrice()*fruit.getWeight();
		System.out.println(fruit.getFruitName() + " price = "+total);
		return total;
	}

}
