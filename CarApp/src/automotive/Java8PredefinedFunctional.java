package automotive;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8PredefinedFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
        Predicate<Integer> p = (n1)->(n1%2==0);
        System.out.println(p.test(n));
        
        String str="sunil";
        Predicate<String> p1=s->s.length()>=5;
        System.out.println(p1.test(str));
        
        Function<Integer,Integer> f1=(t)->t*t;
        System.out.println(f1.apply(5));
        
        Function<String,String> f2=(s1)->s1.toUpperCase();
        System.out.println(f2.apply("sunil"));
        
   //    f1.andThen(f2);
   //     and, andThen //
        
        Consumer<String> c1=(c)->System.out.println(c);
        c1.accept("sunil");
        
        Supplier<Integer> s11=()->(int)Math.random();
        System.out.println(s11.get());
        
	}

}
