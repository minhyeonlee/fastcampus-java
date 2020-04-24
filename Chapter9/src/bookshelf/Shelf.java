package bookshelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;

	// constructor
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	// getter
	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}
}
