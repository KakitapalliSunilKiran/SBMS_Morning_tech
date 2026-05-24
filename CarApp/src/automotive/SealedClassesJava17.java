package automotive;


sealed interface Person permits Student
{
	void display();
}
final class Student implements Person
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
//sealed ->Limited hieraqchy is allowed
//final -> no hierachy
//non-selaed -> Unlimeted

public class SealedClassesJava17 
{

}

