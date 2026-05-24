package automotive;




interface students
{
	int sum(int x,int y);
}
//class Child implements students
//{
//
//	@Override
//	public void getGrades() {
//		System.out.println("Hey my grades are A plus");
//	}
//	
//}
public class Java8FunctionLambda {

	public static void main(String[] args) {
		
		students obj = ( x, y) ->x+y;
		int ans = obj.sum(100,200);
			
	
	}

}

