package automotive;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
//		HashSet<Character> hs = new HashSet<>();
//		String s="geekss";
//		String req = new StringBuffer(s).reverse().chars().mapToObj(c->(char)c).filter(e->!hs.add(e)).map(c->String.valueOf(c)).findFirst().orElse("-1");
//		System.out.println(req);
//		Optional<Character> ch=new StringBuffer(s).reverse().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e1->e1.getValue()==1).map(Map.Entry::getKey).findFirst();
//		System.out.println(ch);
		
		// most frequent character in a String 
//		Optional<Character> ch =s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
//		if(ch.isPresent()) {
//			System.out.println(ch.get());
//		}else {
//			System.out.println("No max character");
//		}
		
//		Stream<String> s=Stream.of("Sunil","Kiran","kakitapalli");
//		Stream<String> s2=s.map(s1->s1.toLowerCase());
//		List<String> ll=s2.collect(Collectors.toList());
//		System.out.println(ll);
		
//		List<List<String>> l1=Arrays.asList(Arrays.asList("sunil","kiran","kakitapalli"),
//				Arrays.asList("sunil","kiran","kakitapalli"),
//				Arrays.asList("sunil","kiran","kakitapalli"));
//		Stream<String> obj =l1.stream().flatMap((List<String> s1)->s1.stream());
		
//		Integer[] arr= {1,5,56,66,77};
//		Stream<Integer> s22 =Arrays.stream(arr).distinct();
		//Integer[] arr22=(Integer[]) s22.toArray();
		
//		Integer[] arr33= {1,5,56,66,77};
//		Stream<Integer> s33 =Arrays.stream(arr33).sorted();
		//Integer[] arr34=(Integer[]) s33.toArray();
		
//		Integer[] arr44= {1,5,56,66,77};
//		Stream<Integer> s56 =Arrays.stream(arr44).sorted((I1,i2)->i2-I1);
		//Integer[] arr56=(Integer[]) s33.toArray();
	//	System.out.println(s56.collect(Collectors.toList()));
		
//		Stream<Integer> sd =Stream.of(1,2,3,4,5,6,7);
//		sd.peek(s1->System.out.println(s1));
		
//		Predicate<Integer> p =
//		        n -> n % 2 == 0;
//
//		System.out.println(p.test(10));
		
//		Function<String, Integer> f =
//		        s -> s.length();
//
//		System.out.println(f.apply("Java"));
		
//		Consumer<String> c =
//		        s -> System.out.println(s);
//
//		c.accept("Hello");
		
//		UnaryOperator<Integer> u =
//		        n -> n * n;
//
//		System.out.println(u.apply(5));
		
	List<Integer> al = Arrays.asList(10,20,30,40,50);
	Predicate<Integer> p = n->n>20;
	Long x = al.stream().filter(p).count();
	System.out.println(x);
		
		//different ways to create a stream 
	List<Integer> arrayList= Arrays.asList(10,20,30,40,50);
	Stream<Integer> streamfromArrayList = arrayList.stream();
	
	//from Array
	Integer arr[]= {10,20,30,40,50};
	Stream<Integer> streamFromArray = Arrays.stream(arr);
	
	int arr1[]= {10,20,30,40,50};
	IntStream streamFromArray1 = Arrays.stream(arr1);
	
	//from the static method 
	Stream<Integer> streamFromStaticMethod=Stream.of(100,3500,900);
	
	//from the stream builder
	Stream.Builder<Integer> streamBuilder = Stream.builder();
	streamBuilder.add(1000).add(900).add(3500);
	
	Stream<Integer> streamFromStreamBuilder= streamBuilder.build();
	
	//We can multiple Intermediate operations together to perform 
	//more complex operation before applying the terminal operation
	
	//Map
	Function<String,String> f=s->s.toLowerCase();
	Stream<String> staticStream=Stream.of("Hey","Iam","Sunil");
	Stream<String> afterMapping = staticStream.map(f);
	List<String> list = afterMapping.collect(Collectors.toList());
	
	//flat map
	List<List<String>> listoflist=Arrays.asList(
									Arrays.asList("sunil","kiran"),
									Arrays.asList("sunil","kiran"),
									Arrays.asList("sunil","kiran")
									);
	Stream<String> flatMapStream = listoflist.stream().flatMap((List<String> y)->y.stream());
	List<String> ll = flatMapStream.collect(Collectors.toList());
	System.out.println(ll);
	
	
		
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
