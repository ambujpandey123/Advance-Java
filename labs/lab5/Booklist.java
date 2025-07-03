package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Booklist {

	public static void main(String[] args) {
		ArrayList<Book> arr = new ArrayList<Book>();
		
		 Book book1 = new Book(1, "Book1", "Author1");
		 Book book2 = new Book(2, "Book2", "Author2");
		 Book book3 = new Book(3, "Book3", "Author3");
		 Book book4 = new Book(4, "Book4", "Author4");
		 Book book5 = new Book(5, "Book5", "Author5");
		 Book book6 = new Book(6, "Book6", "Author6");
		 
		 arr.add(book1);
		 arr.add(book2);
		 arr.add(book3);
		 arr.add(book4);
		 arr.add(book5);
		 arr.add(book6);
		
		 Book temp;
		 Collections.reverse(arr);
		 for (int i = arr.size() - 1,j=0; i >= j; i--,j++) {
			    temp=arr.get(j);
			    arr.set(j, arr.get(i));
			    arr.set(i,temp);      
		 }
		 
		 
		 int sum=0;
		 for(Book b : arr) {
			 System.out.println(b.getBookid());
			 sum+=b.getBookid()%2==0?b.getBookid():0;
		 
		 } 
		 System.out.println("Sum of Even Number is :"+sum);
	}

}
