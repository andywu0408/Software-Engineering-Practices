package hw1;
import java.io.IOException;


public class LibraryBook {
	private LBState state;
	private String name;

	public LibraryBook(String name){
		try {
			// All book starts out on the shelf
			state = OnShelf.getInst();
			this.name = name;
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setState(LBState state) {
		this.state = state;
	}

	public LBState getState() {
		return state;
	}

	public void shelf(){
		try {
			state.shelf(this);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void issue(){
		try {
			state.issue(this);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void extend(){
		try {
			state.extend(this);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void returnIt(){
		try {
			state.returnIt(this);
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

}
