package automotive;

import java.util.Arrays;
import java.util.function.Consumer;

public class Java8MethodReferences {
	
//	public static int square(int x) {
//		return x*x;
//	}
//	public static int square(int x,int y) {
//		return x+y;
//	}
	public void display(String str) {
		System.out.println("the value of str is "+str);
	}
	public static void main(String args[]) 
	{
//		BiFunction<Integer,Integer,Integer> f = Java8MethodReferences::square;
//		System.out.println(f.apply(5,5));
//		Function<Double,Double> f=Math::sqrt;
//		System.out.println(f.apply(5.0));
//		Java8MethodReferences obj = new Java8MethodReferences();
//		Consumer<String> c= obj::display;
//		c.accept("Sunil");
		
//		Consumer<String> c = System.out::println;
//		//c.accept("sunil kiran");
//		Arrays.asList("Sunil","Kiran","Kakt").forEach(x->c.accept(x));
		
	}

}
