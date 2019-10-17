package hw1;
import java.io.IOException;

public interface Observer {
	
	public void update(String src, String dest, LibraryBook book) throws IOException;	
	public void setHasObserved(boolean b);
	public String getName();

}
