package hw1;
import java.io.IOException;

public interface LBState {
	public void shelf(LibraryBook book) throws IOException;

	public void issue(LibraryBook book) throws IOException ;

	public void extend(LibraryBook book) throws IOException;

	public void returnIt(LibraryBook book) throws IOException;

	public String toString();
}
