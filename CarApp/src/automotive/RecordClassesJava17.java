package automotive;

//for any Entity class we used to setters , getters , to STring , hashcode, all Arg constructor

record Car1(int num, String type, String name) {
	
	Car1(int num, String type, String name){
		
		if(num<0) {
			throw new IllegalArgumentException("please use valid");
		}
		this.num=567;
		this.type=type;
		this.name=name;
	}
	
}
public class RecordClassesJava17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//every filed is private and final 
		//c.type()
		//c.type=
		//Compact constructor 
		//Canonical Constructor 
		Car1 c = new Car1(111,"Volks","gfhj");
		System.out.println(c.type());
		System.out.println(c.num());
		System.out.println(c.name());

	}

}
