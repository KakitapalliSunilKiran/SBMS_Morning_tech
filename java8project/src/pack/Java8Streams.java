package pack;

import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

sealed class Rectangele permits square{
	
}
sealed class square extends Rectangele 
{
	
}
final class circle extends square{
	
}
record Student(int id,String name) {}
public class Java8Streams 
{
	public static void main(String args[])
	{
//		Student obj=new Student(100,"sunil");
//		System.out.println(obj.id());
//		System.out.println(obj.toString());
//		String s="geekss";
//		//first repeating element in String 
//		HashSet<Character> hs = new HashSet<>();
//		Character ch = s.chars().mapToObj(c->(char)c).filter(c->!hs.add(c)).findFirst().get();
//		System.out.println(ch);
//		//Last Repeating element
//		HashSet<Character> hs1 = new HashSet<>();
//		Character ch1 = new StringBuffer(s).reverse().chars().mapToObj(c->(char)c).filter(c->!hs1.add(c)).findFirst().get();
//		System.out.println(ch1);
//		//Most frequent character in Stringmax
//		s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted(Map.Entry.getComparingByValue())
//		
		
		int arr[]= {10,20,30,40,50,60};
		int key=500;
		int start=0;
		int end=arr.length-1;
		boolean found=false;
		while(start<=end) 
		{
			int mid=(start+end)/2;
			if(arr[mid]==key) {
				//System.out.println("element found");
				found=true;
				break;
			}
			else if(arr[mid]>key) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		if(found==false) {
			System.out.println("elemnt not found");
		}else {
			System.out.println("element found");
		}
		
	}

}
