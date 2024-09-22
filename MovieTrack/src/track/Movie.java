package track;

import java.time.LocalDate;

public class Movie {
	private int id;
	private String name;
	private String author;
	private int year;
	private LocalDate dateAdded;
	
	public Movie(String name, int year, String author) {	
		this.setName(name);
		this.setYear(year);
		this.setAuthor(author);
		this.dateAdded = LocalDate.now();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public void setID(int newID) {
		id = newID;
	}
	
	public int getID() {
		return id;
	}
	
	public void printMovieDetails() {
		System.out.println("ID: " + getID());
		System.out.println("Title: " + getName());
		System.out.println("Author: " + getAuthor());
		System.out.println("Year: " + getYear());
		System.out.println("Added on: " + dateAdded);
	}
}
