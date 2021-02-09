package _textsteams.com.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream_Main {
	
/*	
	this approach is typically used for binary files more than for text files specially reading jpg,png files
*/
	public static void main(String[] args) {
		
/*       creating instances of FileInputStream and FileOutputStream. These are both classes which when you use them need to be opened and closed.
		 But in Java 7 we don't have to explicitly close them. Instead, we just instantiate them inside the TryWithResources Block, 
		 and then they will be closed automatically for us*/

		try(
				
				//FileInputStream in = new FileInputStream("textfile.txt");
				//FileOutputStream out = new FileOutputStream("newtext.txt");
				FileInputStream in = new FileInputStream("download.jpg");
				FileOutputStream out = new FileOutputStream("newImg2.jpg");
				) {
			int c;

			
			/*			
				here declare an integer variable named c. that's because the FileInputStream is going to be returning one byte at a time, represented as an integer. 
				Now I'll loop, I will create a while block, and inside a couple of pairs of parentheses I'll read to the character from the next available byte, 
				using c = in.read.
				If i get back a value of -1 that means there are no more bytes available, if the return value doesn't equal -1, 
				and then add a code block for the while statement, then write to the OutputStream passing the one character that received. 
				Just like the read method, the write method has a number of different signatures you can use. But if all you're trying to do is write a single byte, that's all you need to pass. 
				You don't need to pass an array, and you don't need to pass an offset and length.
			*/
			
			while((c = in.read()) != -1){
				System.out.println(in.read());
				out.write(c);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}  
	}
}
