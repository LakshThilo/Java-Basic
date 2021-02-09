package _exception.com.lynda.javatraining.trywithresourse;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainTry_with_res {

	public static void main(String[] args) throws IOException {


		try (
//				FileReader fr = new FileReader("ATextFile.txt");
//				BufferedReader br = new BufferedReader(fr);
				BufferedReader br = new BufferedReader(new FileReader("ATextFile.txt"));
				){		
			String s;
			while((s = br.readLine()) != null) { 
				System.out.println(s); 
			} 

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}	
		System.out.println("Still Alive!!!");

	}

}
