package automotive;

import java.util.function.BiFunction;

class Customer
{
	Customer(int id , String name){
		System.out.println("Hey I am in Constructor"+name);
	}
}
public class Java8MethodReferences {
	
	public static void main(String args[]) 
	{
//          Supplier<Customer> supplier = Customer::new;
//         Customer c =  supplier.get();
		BiFunction<Integer , String,Customer> function = Customer::new;
		Customer obj = function.apply(100, "Sunil");
	}

}
