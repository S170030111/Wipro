package com.wipro.AbstractClasses;
abstract class Compartment
{
	abstract String notice();
}
class FirstClass extends Compartment
{
	String notice()
	{
		return "This is First class compartment";
	}
}
class Ladies extends Compartment
{
	String notice()
	{
		return "This is First Ladies compartment";
	}
}

class General extends Compartment
{
	String notice()
	{
		return "This is General compartment";
	}
}

class Luggage extends Compartment
{
	String notice()
	{
		return "This is Luggage compartment";
	}
}
