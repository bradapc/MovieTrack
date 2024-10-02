package track;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Collection implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static ArrayList<Movie> collectionArr = new ArrayList<Movie>();
	
	public Collection() throws ClassNotFoundException, IOException {
		this.readCollection();
	}
	
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
	
	public int getCollectionSize() {
		return collectionArr.size();
	}
	
	public void saveCollection() throws IOException {
		FileOutputStream fos = new FileOutputStream("collection.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(collectionArr);
		oos.close();
	}
	
	public void readCollection() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("collection.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		collectionArr = (ArrayList<Movie>) ois.readObject();
		ois.close();
		System.out.println("Loaded collection from collection.tmp");
	}
}
