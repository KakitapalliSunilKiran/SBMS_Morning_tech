package automotive;


sealed class Vehicle permits Lorry,Bus 
{
	void display() 
	{
		System.out.println("I am in display class");
	}
}
final class Lorry extends Vehicle
{
	void display() 
	{
		System.out.println("I am in Lorry class");
	}
}
non-sealed class Bus extends Vehicle
{
	void display() 
	{
		System.out.println("I am in Bus class");
	}
}

public class Java17SealedClasses extends Bus {

}
