package track;

import java.io.Serializable;
import java.time.LocalDate;

public class Movie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String author;
	private int year;
	private LocalDate dateAdded;
	private int rating;
	private String genre;
	static String[] possibleGenres = {"horror","thriller","comedy","action","drama"};
	
	public Movie(String name, int year, String author, int rating) {	
		this.setName(name);
		this.setYear(year);
		this.setAuthor(author);
		this.dateAdded = LocalDate.now();
		this.setRating(rating);
	}
	
	public static void printPossibleGenres() {
		for (int i = 0; i < possibleGenres.length; i++) {
			System.out.print("'" + possibleGenres[i] + "' ");
		}
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String s) {
		for (int i = 0; i < possibleGenres.length; i++) {
			if (possibleGenres[i].equalsIgnoreCase(s)) {
				genre = s;
			}
		}
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int newRating) {
		if (newRating >= 0 && newRating <= 5) {
			rating = newRating;
		}
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
		System.out.println("Your rating: " + getRating());
	}
}
