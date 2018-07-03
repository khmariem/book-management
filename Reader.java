import java.util.ArrayList;
import java.util.Calendar;

/**
 * 
 * @author Mariem Khlifi
 *
 */


public class Reader {
	public int readerId;
	private String readerName;
	private String readerLastName;
	private Calendar readerBirthDate;
	private String readerPassword;
	private ArrayList<String> readerBooks;
	
	public Reader(String name,String lastName,Calendar birthDate,String password) {
		this.readerName = name;
		this.readerLastName = lastName;
		this.readerBirthDate = birthDate;
		this.readerPassword = password;
		
	}
	
	public Reader(String name, String lastName, String password) {
		this.readerName = name;
		this.readerLastName = lastName;
		this.readerPassword = password;
	}
	
	public void setName(String fName, String lName) {
		this.readerName=fName;
		this.readerLastName=lName;
	}
	
	public String getName() {
		return this.readerName;
	}
	
	public String getLastName() {
		return this.readerLastName;
	}
	
	public void setBirthDate(Calendar birthDate) {
		this.readerBirthDate = birthDate;
	}
	
	public Calendar getBirthDate() {
		return this.readerBirthDate;
	}
	
	public void setPassword(String password) {
		this.readerPassword = password;
	}
	
	public String getPassword() {
		return this.readerPassword;
	}
	
	public ArrayList<String> getBooks() {
		return this.readerBooks;
	}
	
	public void addBook(String book) {
		boolean alreadyIn=false;
		if (this.readerBooks!=null) {
			for (int i=0;i<this.readerBooks.size();i++) {
				if (book.equals(this.readerBooks.get(i)) ){
					alreadyIn=true;
				}
			}
		}
		if (alreadyIn==false) {
			this.readerBooks.add(book);
		}
		
	}
	
	public void deleteBook(String book) {
		boolean alreadyIn=false;
		if (this.readerBooks!=null) {
			for (int i=0;i<this.readerBooks.size();i++) {
				if (book.equals(this.readerBooks.get(i)) ){
					alreadyIn=true;
				}
			}
		}
		if (alreadyIn==true) {
			this.readerBooks.remove(book);
		}
	}
}
