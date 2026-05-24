package automotive;

public class Java17Switchfeatures {
	
	public static void main(String args[]) {
//		int x=2;
//		switch(x) 
//		{
//			case 1:
//				System.out.println("Today is Sunday");
//				break;
//			case 2:
//				System.out.println("Today is Monday");
//				break;
//			case 3:
//				System.out.println("Today is wednesday");
//				break;
//			default:
//				System.out.println("Please enter proper input");	
//		}
		
//		int x=1;
//		switch(x) {
//				
//			case 1->
//			{
//				System.out.println("Today is Sunday");
//				System.out.println("Today is Sunday");
//			}
//			case 2->System.out.println("Today is Monday");
//			case 3->System.out.println("Today is wednes day");
//			default->System.out.println("Please enter a valid input");
//		}
		
//		int x=1;
//		String ans=switch(x) 
//		{
//			case 1->"Monday";
//			default->"please enter valid input";
//		};
//		System.out.println(ans);
		
//		int x=2;
//		int ans=switch(x) {
//			case 1->{
//				System.out.println("Today is Monday");
//				yield 1;
//			}
//			default->{
//				System.out.println("Today is Sunday");
//				yield 2;
//			}
//		};
//		System.out.println(ans);
//		
		int x=3;
		switch(x) {
			case 3,4->System.out.println("Today is Sunday");
			case 6,7->System.out.println("Today is Monday");
			default->System.out.println("Please enter a valid input");
		}
		
	}

}
