package encapsulation;

public class Book {
private String title,author;
private long isbn;
private boolean isBorrowed;

public Book(String title, String author, long isbn,boolean isBoroowed) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isBorrowed=isBorrowed;
}

void setTitle(String title) {
	this.title=title;
}

void setAuthor(String author) {
	this.author=author;
}

void setIsbn(long isbn) {
	this.isbn=isbn;
}
void isBorrowed(boolean isBorrowed) {
	if(isBorrowed) {
		System.out.println("The Book Is Not Available Because It Is Borrowed By Someone..");
	}
	else System.out.println(" The Book Is Available Right Now..");
}

String getTitle() {
	return title;
}

String getAuthor() {
	return author;
}

long getIsbn() {
	return isbn;
}

boolean getBorrowed() {
	return isBorrowed;
}

public void displayStatus() {
	System.out.println("The title of book is " +title + " And The Auhtor is: " + author + " "+ isbn + " "+ isBorrowed);
}
}
