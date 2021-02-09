package _textsteams.com.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	if you're working with character-based data, that is text files, it's recommended that use classes named FileReader and FileWriter instead. 
	These classes--unlike the InputStream and OutputStream--automatically handle character sets other than UTF-8.
*/
public class CharacterStream_Main {

	public static void main(String[] args) {

		try (
				FileReader in = new FileReader("textfile.txt");
				FileWriter out = new FileWriter("newfileNew.txt");
				) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
