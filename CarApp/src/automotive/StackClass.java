package automotive;

import java.util.Stack;

public class StackClass {
	static int c=0;
	static int arr[]=new int[10];
     static void push(int x) {
    	 arr[c]=x;
    	 c++;
     }
     static int pop() {
    	 int x=arr[c];
    	 c--;
    	 return x;
     }
     static void display() {
    	 for(int i=0;i<c;i++) {
    		 System.out.println(i+"........"+arr[i]);
    	 }
    	 System.out.println("--------------------");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(100);
		push(200);
		push(300);
		push(400);
		pop();
		display();
		pop();
		display();
		

	}

}
