package Data_Stracture;

import java.util.Stack;

public class Stack_Program {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		 
		System.out.println(" Is Stack empty: "+st.isEmpty());
		 st.push(10);
		 st.push(20);
		 st.push(30);
		 System.out.println("Elements: "+ st);
		 System.out.println("top element: "+st.peek());
		 System.out.println("remove top: "+ st.pop());
		 System.out.println("top element: "+st.peek());
		
		 System.out.println("Cantains: "+ st.contains(10));

		 System.out.println(" Is Stack empty: "+st.empty());
	}

}
