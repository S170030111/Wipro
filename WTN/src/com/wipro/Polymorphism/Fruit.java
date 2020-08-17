package com.wipro.Polymorphism;

public class Fruit {
String name;
String taste;
int size;
void eat()
{
	name="goa";
	taste="good";
}

}
class Apple extends Fruit{
	void eat()
	{
		name="apple";
		taste="good";
	}
}
	class Orange extends Fruit{
		void eat()
		{
			name="Orange";
			taste="good";
		}
}
