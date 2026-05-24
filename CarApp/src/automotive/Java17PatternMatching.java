package automotive;

class A
{
	
}
class B{
	
}
class C{
	
}
public class Java17PatternMatching {
	
	public static void main(String args[]) {
//		Object obj=null;
//		switch(obj) 
//		{
//			case String s->System.out.println("It is a String");
//			case null ->System.out.println("It is a Null");
//			case Float s->System.out.println("It is a Float");
//			default -> System.out.println("Please enter valid input");
//		}
//		if(obj instanceof String) {
//			System.out.println("obj is a String");
//		}
//		else if(obj instanceof Integer) {
//			System.out.println("obj is a Integer");
//		}
//		else {
//			System.out.println("obj is a Some other");
//		}
		
		Object obj=new A();
		switch(obj) {
		case A a->System.out.println("It is class A");
		default -> System.out.println("Please Enter valid Input");
		}
	}

}
