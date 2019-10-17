package hw1;

import java.io.*;

// This is designed in Singleton pattern
// Behavior is logged to a file named "Q1Log.txt" in the working directory
public class PrintManager {	
	private static PrintManager pm;
	private static FileWriter writer = null;

	private PrintManager(){}
	
	// Create one instance if none exists 
	public static PrintManager ThePrintManager(){	
		try {
			if(writer == null) {
				writer = new FileWriter("Q1Log.txt");
			}
			if(pm == null) {
				pm = new PrintManager();
				writer.write("Instance Created\n");	
				return pm;
			}
			writer.write("Previously Created instance returned\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pm;
	}
}

