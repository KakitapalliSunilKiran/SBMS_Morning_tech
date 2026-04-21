package automotive;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tester {
	
	public static void main(String args[])
	{

//		HashSet<Character> hs=new HashSet<>();
//		String str="suneels";
//		str.chars().mapToObj(c->(char)c).forEach(x->{
//			if(hs.contains(x)) {
//				System.out.println(x);
//			}
//			else {
//				hs.add(x);
//			}
//		});
//		
//		java 8 to 25 properties 
		HashSet<Character> hs = new HashSet<>();
		String s="geekss";
//		String req = new StringBuffer(s).reverse().chars().mapToObj(c->(char)c).filter(e->!hs.add(e)).map(c->String.valueOf(c)).findFirst().orElse("-1");
//		System.out.println(req);
//		Optional<Character> ch=new StringBuffer(s).reverse().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e1->e1.getValue()==1).map(Map.Entry::getKey).findFirst();
//		System.out.println(ch);
		
		// most frequent character in a String 
		Optional<Character> ch =s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
		if(ch.isPresent()) {
			System.out.println(ch.get());
		}else {
			System.out.println("No max character");
		}
	}
}

//Record classes and its practice
//sealed classes and its practice
//first repeating element in string
//last repeating element in string 
//most frequent element in String
//least frequent element in String 
//second most frequent element in String 
//first non repeating element in String 
//last non repeating element in String
