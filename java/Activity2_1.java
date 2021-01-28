package session2;

//Abstract class
abstract class Book{
	String title;
	//Abstract method
	abstract void setTitle(String s);
	//Concrete method
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	//Define abstract method
	public void setTitle(String s) {
		title = s;
	}
}
public class Activity2_1 {

	public static void main(String[] args) {
		//Initialize title of the book
		String title = "Atomic Habits";
		//Create object for MyBook
		MyBook newNovel = new MyBook();
		//Set title
		newNovel.setTitle(title);
		//Print result
		System.out.println("The title of the book is:" + newNovel.getTitle());

	}

}
