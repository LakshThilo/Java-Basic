package _textsteams.com.scanningtext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
	One of the most common cases in reading files is tokenized text. For example, comma delimited files where you get lines of text separated by commas, 
	spaces, tabs, or other characters. Java has a class that handles this automatically called the scanner class. 


*/
public class ScaningText_Main {

	public static void main(String[] args) {
		
/*		Now when you scan, you're going to be reading one section of text at a time separated by tokens, and the default separating token is a space character. 
		So to read the first file, textfile.txt. 
		
		And then I'll change the condition for my while clause to s.hasNext. The syntax for the scanner is very similar to an iterator. 
		You call hasNext to determine whether there's any more content to read, and then you can call the next method to get the next segment of content
		Now within the while loop, if there's any more content to read, I'll grab it using the next method, and then output it to the console. 
		
		I'll use System.output, and I'll output s.next. And Notice that just like hasNext, there are multiple versions of the next method. 
		The default next method returns a string, but you can also get nextBoolean, nextDouble, and so on. and these methods serve to automatically cast values to their correct data types.
		
		The scanner class can be used to easily read this sort of tokenized text, and it works well to read very large files, grab the text from those files already separated, 
		and then process the text as needed in your application.
		
	*/	
		try (
				Scanner  s = new Scanner(new BufferedReader(new FileReader("tokenizedtext.txt")));

				) {
			//s.useDelimiter("-");
			s.useDelimiter(",");
			
			while (s.hasNext()){
				System.out.println(s.next());
			}
			System.out.println("All done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
}
