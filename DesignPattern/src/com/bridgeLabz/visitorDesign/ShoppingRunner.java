package com.bridgeLabz.visitorDesign;

public class ShoppingRunner 
{

	public static void main(String[] args) 
	{
		ItemElement[] items = new ItemElement[]{new Book(275, "java"),new Book(850, "python"),
				new Fruit(90, 3, "papaya"), new Fruit(160, 2, "mango")};
		
		int total = calculatePrice(items);
		System.out.println("Total Price = "+total);
	}

	private static int calculatePrice(ItemElement[] items)
	{
		CartVisitor visitor = new ShoppingCartVisitor();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
