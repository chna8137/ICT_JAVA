package ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// PrintStream - System.out
public class Ex6_PrintWriter {
	
	static String path = "src/ex1/demo2.txt";
	public static void main(String[] args) throws Exception {
		
		// BufferedWriter, OutputStreamWriter 내장되어 있다.
		// PrintWriter(Stream, true) : autoflush
		PrintWriter pw = new PrintWriter(new FileOutputStream(path), true);
		pw.println("하이");
		pw.close();
	}

}
