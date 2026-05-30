package automotive;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Java8PredefinedFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n1=11;
//		int n2=10;
//       BiPredicate<Integer,String> p = (n11,n12)->((n11+n12+"")%2==0);
//        System.out.println(p.test(n1,"Sunil"));
		//predicate is input for field function
        
//       String str="sunil";
//        Predicate<String> p1=s->s.length()>=5;
//        System.out.println(p1.test(str));
//        
        BiFunction<Integer,Integer,Integer> f1=(t1,t2)->t1*t2;
        System.out.println(f1.apply(5,6));
        //function is input for Map
//        
//        Function<String,String> f2=(s1)->s1.toUpperCase();
//        System.out.println(f2.apply("sunil"));
//        
//   //    f1.andThen(f2);
//   //     and, andThen //
//        
        Consumer<String> c1=(c)->System.out.println(c);
        c1.accept("sunil");
//        
        Supplier<Integer> s11=()->(int)Math.random();
        System.out.println(s11.get());
//        
	}

}
