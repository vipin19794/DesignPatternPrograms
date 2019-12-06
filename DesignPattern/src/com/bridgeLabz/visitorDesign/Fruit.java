package com.bridgeLabz.visitorDesign;

public class Fruit implements ItemElement
{
	private int price;
	private int weight;
    private String fruitName;
    
    public Fruit(int price, int weight, String fruitName)
    {
  	  this.price = price;
  	  this.weight = weight;
  	  this.fruitName = fruitName;
    }
    
    public int getPrice()
    {
  	  return price;
    }
    
    public int getWeight()
    {
  	  return weight;
    }
    
    public String getFruitName()
    {
  	  return fruitName;
    }
    
    public int accept(CartVisitor visitor)
    {
		return visitor.visit(this);
	}
}
