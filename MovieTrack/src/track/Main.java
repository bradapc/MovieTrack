package track;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FileHandler.createCollectionFile();
		FileHandler.writeToCollectionFile();
		Collection myCollection = new Collection();
		
		String input = "";
		Scanner stdin = new Scanner(System.in);
		System.out.println("Welcome to your movie collection. Please enter a command. Type help to see commands.");
		input = stdin.nextLine();
		while (!input.equalsIgnoreCase("quit")) {
			if (input.equalsIgnoreCase("help")) {
				System.out.println("Commands:");
				System.out.println("view: view your current collection");
				System.out.println("add: add a movie to your current collection");
				System.out.println("delete: delete a movie from your collection");
				System.out.println("help: shows possible commands");
				System.out.println("quit: quit the program");
			} else if (input.equalsIgnoreCase("view")) {
				myCollection.printCollection();
			} else if (input.equalsIgnoreCase("add")) {
				System.out.println("Enter the title: ");
				String title = stdin.nextLine();
				System.out.println("Enter the year: ");
				int year = stdin.nextInt();
				stdin.nextLine();
				System.out.println("Enter the author: ");
				String author = stdin.nextLine();
				System.out.println("Enter a rating (0-5): ");
				int userRating = stdin.nextInt();
				stdin.nextLine();
				System.out.print("Enter one of the following genres: ");
				Movie.printPossibleGenres();
				String genre = stdin.nextLine();
				Movie newMovie = new Movie(title, year, author, userRating);
				myCollection.addToCollection(newMovie);
				System.out.println("Added " + title + " to your collection. You have " + myCollection.getCollectionSize() + " movies in your collection.");
			} else if (input.equalsIgnoreCase("delete")) {
				System.out.println("Enter the title of the movie to delete.");
				String title = stdin.nextLine();
				myCollection.removeFromCollection(title);
			} else {
				System.out.println("Please enter a valid command. Type help to see commands.");
			}
			input = stdin.nextLine();
		}
	}

}
