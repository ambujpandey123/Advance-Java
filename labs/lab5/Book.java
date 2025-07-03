package Collection;

public class Book {
	int bookid;
	String bookname;
	String AuthorName;
	
	public Book(int bookid, String bookname, String authorName) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.AuthorName = authorName;
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", AuthorName=" + AuthorName + "]";
	}
	

}
