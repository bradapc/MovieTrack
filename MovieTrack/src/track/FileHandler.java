package track;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
	public static void createCollectionFile() {
		try {
			File collectionFile = new File("collection.txt");
			if (collectionFile.createNewFile()) {
				System.out.println("File created: " + collectionFile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occured creating your collection file.");
			e.printStackTrace();
		}
	}
	public static void writeToCollectionFile() {
		try {
			FileWriter colWriter = new FileWriter("collection.txt");
			colWriter.write("bradapc's Collection - Collection.txt!");
			colWriter.close();
		} catch (IOException e) {
			System.out.println("Error writing to file.");
			e.printStackTrace();
		}
	}
}
