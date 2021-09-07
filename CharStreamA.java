package pack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamA {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("E:/workspace/t.txt");
		FileWriter fw = new FileWriter("E:/workspace/t3.text");
		
		char buffer[] = new char[20];
		fr.read(buffer);
		String s = new String(buffer);
		System.out.println(s);
		
		fw.write(buffer);
		
		fr.close();
		fw.close();
	}

}
