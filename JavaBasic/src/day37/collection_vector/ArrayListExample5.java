package day37.collection_vector;

import java.util.ArrayList;
import java.util.List;
class Book {
	Book(){};
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	private String name, author, publisher;
	private int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class ArrayListExample5 {
	public static void main(String[] args) {
		// Creating list of Books
		List<Book> list = new ArrayList<Book>();//Generic
		// Creating Books 
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104, "Let us Code it", "xyz", "pqr", 5));	
		
		Book b4 = new Book();
		b4.setId(105);
		b4.setAuthor("author");
		b4.setName("name");
		b4.setPublisher("publisher");
		list.add(b4);
		
		
		System.out.println("List of Book class elements: "+list);
		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).id);
//		System.out.println(list.get(0).publisher);
//		System.out.println(list.get(0).author);
//		System.out.println(list.get(0).quantity);
		//				   b1.name
		System.out.println(b1.getName());
		// Traversing list
		for (Book b : list) {
			System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
		}
	}
}
