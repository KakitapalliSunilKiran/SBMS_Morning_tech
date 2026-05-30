package automotive;




interface students
{
	int sum(int x,int y);
}
//class Child implements students
//{
//
//	@Override
//	public int sum(int x, int y) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	
//	
//}
public class Java8FunctionLambda {

	public static void main(String[] args) {
		
		students obj = (x, y) ->x+y;
		int ans = obj.sum(100,200);
			
	
	}

}

