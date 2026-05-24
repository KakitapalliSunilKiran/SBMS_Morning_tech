package automotive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

	public static void main(String[] args) 
	{
		
		//flatmap
		//List of List<Integers> -> list of Integers
		
//		List<Integer> ans = ss.collect(Collectors.toList());
//		//ss.forEach(x3->System.out.println(x3));
//		System.out.println(ans);
		//distnict, sorted ,limit , skip
		
		List<Integer> al = Arrays.asList(10,20,30,10,10,20);
		List<Integer> al2= al.stream().skip(4).collect(Collectors.toList());
		System.out.println(al2);
		
		
		
		
		 

	}

}
