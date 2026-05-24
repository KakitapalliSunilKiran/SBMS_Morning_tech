package automotive;

record Employee(int id,String name) {
	
//	Employee{
//
//        if(id <= 0) {
//            throw new IllegalArgumentException(
//                    "Invalid ID");
//        }
//
//        if(name == null) {
//            throw new IllegalArgumentException(
//                    "Name cannot be null");
//        }
//	}
	public Employee(int id, String name) 
	{

        if(id <= 0) {
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.name = name;
    }
	
}
public class Java17RecordClasses 
{
	public static void main(String args[]) {
		Employee e = new Employee(10,"sunil kiran");
		System.out.println(e.id());
		
		
	}
}
