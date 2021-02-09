package _textsteams.com.bufferedstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Streams {
	
/*	
	When you're dealing with large text files, it's a good idea to wrap your FileReaders and FileWriters inside classes that will buffer the operations. 
	Buffering the read and write operations is a good way of automatically managing memory so that you're efficiently putting content into memory and taking it out. 
	It's a pretty simple operation. You can use the buffered reader and buffered writer classes wrapped around any instance of a reader or writer such as FileReader and FileWriter.
*/
	public static void main(String[] args) {

		try (
				BufferedReader in = new BufferedReader(new FileReader("hamlet.xml"));
				BufferedWriter out = new BufferedWriter(new FileWriter("newfile2.txt"));
				) {
			int c;
			while ((c = in.read()) != -1) {
				//System.out.println(c);
				out.write(c);
				
			}
			System.out.println("All done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
/*
You still get the advantages of internationalization with the FileReader and FileWriter, 
that is they'll adapt automatically to different character sets. But now with the buffered classes, 
you get improved memory management and a more efficient use of system resources.*/