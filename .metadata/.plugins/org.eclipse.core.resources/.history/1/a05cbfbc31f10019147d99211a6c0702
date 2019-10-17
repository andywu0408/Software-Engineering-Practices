package hw1;
import java.io.*;
import hw1.BadOperationException;
import hw1.FileOutputter;

public class Borrowed implements LBState {
	// Singleton
	private static Borrowed instance;
	
	private Borrowed(){}
	
	public static Borrowed getInst() throws IOException{	

		if(instance == null) {
			instance = new Borrowed();
			FileOutputter.write("Borrowed Instance Created\n");	
			return instance;
		}
		return instance;
	}
	
	@Override
	public void shelf(LibraryBook book) throws IOException {
		BadOperationException.throwError("shelf", instance.toString());
	}
	@Override
	public void issue(LibraryBook book) throws IOException  {
		BadOperationException.throwError("issue", instance.toString());
	}
	@Override
	public void extend(LibraryBook book) throws IOException {
		book.setState(Borrowed.getInst());
		FileOutputter.write("Leaving State Borrowed for State Borrowed\n");
	}
	@Override
	public void returnIt(LibraryBook book) throws  IOException {
		book.setState(GotBack.getInst());
		FileOutputter.write("Leaving State Borrowed for State GotBack\n");
	}
	@Override
	public String toString() {
		return "Borrowed";
	}
}
