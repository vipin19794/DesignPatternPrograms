package com.bridgeLabz.visitorDesign;

public interface CartVisitor
{

	int visit(Book book);
	int visit(Fruit fruit);
}