package track;

import java.util.ArrayList;

public class Collection {
	private String owner;
	static ArrayList<Movie> collectionArr = new ArrayList<Movie>();
	
	public void addToCollection(Movie newMovie) {
		newMovie.setID(getCollectionSize() + 1);
		collectionArr.add(newMovie);
	}
	
	public void removeFromCollection(String movie) {
		for (int i = 0; i < collectionArr.size(); i++) {
			if (collectionArr.get(i).getName().equalsIgnoreCase(movie)) {
				collectionArr.remove(i);
				System.out.println("Removed " + movie + " from collection.");
				return;
			}
		}
		System.out.println("Could not find " + movie + " in your collection.");
	}
	
	public void printCollection() {
		for (int i = 0; i < collectionArr.size(); i++) {
			collectionArr.get(i).printMovieDetails();
			System.out.print("\n");
		}
	}
	
	public static int getCollectionSize() {
		return collectionArr.size();
	}
}
