package hw1;
import java.io.*;
import java.lang.Exception;
import hw1.FileOutputter;

public class BadOperationException extends Exception{
	public static String error = "hw1.BadOperationException: ";
	public static void throwError(String method, String curState) {
		try {
			FileOutputter.write(error + "Can't use " + method + " in " + curState + " state\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
