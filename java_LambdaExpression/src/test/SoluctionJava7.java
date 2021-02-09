package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class SoluctionJava7 {
	public static void main(String[] args) {
	
		
		List<Person> people = Arrays.asList(
				new Person("Charles", 45, Gender.MALE),
				new Person("Tom", 25, Gender.MALE),
				new Person("Thomas", 35, Gender.MALE),
				new Person("Daniella", 25, Gender.FEMALE),
				new Person("Kajol", 55, Gender.FEMALE),
				new Person("Dev", 28, Gender.MALE)
				);

	

		
		// step 1: Sort list by first name:
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstname().compareTo(p2.getFirstname());
			}
		});
	
		// Step 2: Create method that prints all element in the list
		System.out.println("print sorted list: ");
		printAll(people);
		
		// Step 3: Create a method that print all people have first name beginning with 'D' 
		System.out.println("======================================\ncheck first name:");
		checkFirstName(people);
		
		System.out.println("======================================\nprint conditionally:");
		printConditinally(people,new Predicate<Person>() {

			@Override
			public boolean test(Person p) {
				
				return p.getGender().equals(Gender.MALE) && p.getFirstname().startsWith("C") && p.getAge()>30;
			}
		
		
		});
		
	}

	private static void printConditinally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if(predicate.test(person)) {
				
				System.out.println(person);
			}
		}
		
	}

	private static void checkFirstName(List<Person> people) {
		
		for (Person person : people) {
			if(person.getFirstname().startsWith("D")) {
				System.out.println(person);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
		
	}
}

