package hw1;

import java.io.IOException;

public class SourceObserver implements Observer {
	private String name;
	private LibraryBook book;
	private boolean hasObserved;
	
	public SourceObserver(String name) {
		this.name = name;
	}

	@Override
	// ex. Casey OBSERVED Design Patterns LEAVING STATE: UNOBSERVED
	public void update(String src, String dest, LibraryBook book) throws IOException {
		if(!hasObserved) {
			FileOutputter.write(name + " OBSERVED " + book.name +
					 " LEAVING STATE: UNOBSERVED\n");
			hasObserved = true;
		} else {
			FileOutputter.write(name + " OBSERVED " + book.name +
					 " Leaving STATE: " + src + '\n');
		}
	}
	
	@Override
	public void setHasObserved(boolean b) {
		this.hasObserved = b;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}

	// only equals if this & rhs both are DestObserver and they have same name
	@Override
	public boolean equals(Object rhs) {
		if (!(rhs instanceof SourceObserver)) { 
            return false; 
        } 
		SourceObserver castedRhs = (SourceObserver) rhs; 
		return this.name == castedRhs.name;
	}
	
	@Override
	public int hashCode() {
	    return Integer.parseInt(this.name);  
	}
}
