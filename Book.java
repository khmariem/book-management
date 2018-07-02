import java.util.ArrayList;
import java.util.Calendar;



public class Book {
	
    public int bookId;
    public String name;
    public ArrayList<String> bookAuthor;
    public Calendar releaseDate;
    public boolean bookStatus;
    public String bookCategory;
    
    public Book(String name,ArrayList<String> authors,Calendar date,String category) {
    	this.name=name;
    	this.bookAuthor=authors;
    	this.releaseDate=date;
    	this.bookCategory=category;
    	this.bookStatus=true;
    }
    
    public void setStatus(boolean status) {
    	this.bookStatus=status;
    }
    
    public boolean getStatus() {
    	return this.bookStatus;
    }
    
    public void setAuthors(ArrayList<String> authors) {
    	this.bookAuthor=authors;
    }
    
    public ArrayList<String> getAuthors(){
    	return this.bookAuthor;
    }
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void setDate(Calendar date) {
    	this.releaseDate=date;
    }
    
    public Calendar getDate() {
    	return this.releaseDate;
    }
    
    public void setCategory(String category) {
    	this.bookCategory=category;
    }
    
    public String getCategory() {
    	return this.bookCategory;
    }
    
    
    public void borrowBook() {
    	this.setStatus(false);
    }
    
    public void returnBook() {
    	this.setStatus(true);
    }
    
}
