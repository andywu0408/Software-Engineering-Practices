package hw1;
import java.io.*;

// Helper class for writing output to Log files for part 2 & 3
public class FileOutputter  {
	public static FileWriter writer;
	static {
		try {
			writer = new FileWriter("Q2&3Log.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	public FileOutputter(String Path) throws IOException {
		writer = new FileWriter(Path);
	}
	
	public static void write(String str) throws IOException{
		writer = new FileWriter("Q2&3Log.txt", true);
		writer.write(str);
		close();
	}
	
	public static void close() throws IOException{
		writer.close();
	}
	
}
