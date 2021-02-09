package method_reference.com.lak.method_reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



//  method reference can can in two occasions 
/**	
	 1. to express this kind of lambda expression :
	 
	 		() -> printMassege(); === Main::printMassege();  - here Class name and method itself()
			mean take no input arguments and calling a method with out any arguments 
							

	// 2. and when we having one input argument and  calling method with that same argument
	  				
	  				p -> System.out.println(p) === System.out::println
	  				this says to compiler to am take argument and passing in
	  
	 
*/
public class Main {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				printMessage();
			}
		});
		Thread t2 = new Thread(() -> printMessageLambda()); 
		
		t.start();
		//======================================
		
		t2.start();
		
		List<Person> people = Arrays.asList(
				new Person("Charles", 45, Gender.MALE),
				new Person("Tom", 25, Gender.MALE),
				new Person("Thomas", 35, Gender.MALE),
				new Person("Serma", 65, Gender.FEMALE),
				new Person("Kajol", 55, Gender.FEMALE)
				);
		
		Collections.sort(people,new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				
				return p1.getFirstname().compareTo(p2.getFirstname());
			}
		});
		
		//people.forEach(System.out::println);
		//performConditionally(people,p -> true);
	}

	private static void performConditionally(List<Person> people) {
		
		
	}
	
	public  static void printMessage() {
		System.out.println("Printing messaage");
		
	}
	public  static void printMessageLambda() {
		System.out.println("Printing messaage using lambda");
		
	}
}
