package automotive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

	public static void main(String[] args) 
	{
		List<Integer> al = Arrays.asList(10,20,30,40);
		Stream<Integer> ss =al.stream()
				.filter(x5->x5%2==0)
				.peek(x->System.out.print(x+" "))
				.map(x6->x6+10)
				.peek(x->System.out.print(x+" "));
		ss.collect(Collectors.toList());
	}
}
