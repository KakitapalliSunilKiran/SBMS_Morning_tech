package automotive;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tester {
	
	public static void main(String args[])
	{
//		//Constructor Injection
////		Car c = new Car(new GasEngine());
////		c.startCar();
//		
//		//Setter Injection
////		Car c = new Car();
////		c.setE(new PetrolEngine());
////		c.startCar();
//		//80 percent ->60
//		Car c = new Car();
//		c.e=new DieselEngine();
//		c.startCar();
		String str="programmming";
		Map<Character, Long> me =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Entry<Character, Long> hm=me.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(hm.getKey());
		System.out.println(hm.getValue());
		
	}
}
