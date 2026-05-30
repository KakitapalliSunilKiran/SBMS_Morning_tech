package automotive;

record Employee1(int id,String name, double salry) {
	
	Employee1{
		if(id<0) {
			throw new IllegalArgumentException("wrong value");
		}
	}
	
}
//In Record class Every property is private and final 
public class Java17RecordClasses_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 obj = new Employee1(-10,"Sunil",54667867.789);
		System.out.println(obj.id());
		System.out.println(obj.name());
		System.out.println(obj.salry());
		
		//if id < 0 

	}

}
