package myjava;
 
public class IndexOutOfBound {

	public static void main(String[] args){
		int arr[]= {1,2,3};
		 
		 try {
			 for(int i=0;i<5;i++) {
				 System.out.println(arr[i]);
			 }
		 }catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array IndexOut OfBounds Exception:\n "+e.getMessage());
			 
		}
	 

	}

}

// Output:
/*
1
2
3
Array IndexOut OfBounds Exception:
 Index 3 out of bounds for length 3
*/
