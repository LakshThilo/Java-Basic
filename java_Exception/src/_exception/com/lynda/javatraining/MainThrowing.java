package _exception.com.lynda.javatraining;

import _exception.com.Inda.javatraining.exception.WrongFileException;
import _exception.com.lynda.javatraining.util.MyFileReader;

import java.io.IOException;

public class MainThrowing {

	public static void main(String[] args) throws IOException {

		String fileContent = MyFileReader.readFile("textFile.txt");
		System.out.println(fileContent);
		
		try {
			if (fileContent.equals("Right file")) {
				System.out.println("You chose right file");
			} else {
				throw(new WrongFileException());
			}
		} catch (WrongFileException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
