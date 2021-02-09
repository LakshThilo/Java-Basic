package java_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SolutionJava7 {
	public static void main(String[] args) {
	
		
		List<Person> people = Arrays.asList(
				new Person("Charles", 45, Gender.MALE),
				new Person("Tom", 25, Gender.MALE),
				new Person("Thomas", 35, Gender.MALE),
				new Person("Levis", 25, Gender.MALE),
				new Person("Chalotte", 17, Gender.FEMALE),
				new Person("Dani", 22, Gender.MALE),
				new Person("Daniella", 25, Gender.FEMALE),
				new Person("Serma", 65, Gender.FEMALE),
				new Person("Kali ", 55, Gender.FEMALE),
				new Person("Dev", 28, Gender.MALE)
				);

	
		people.forEach(System.out::println);
		
		// step 1: Sort list by first name:
		/*
		 * List<Person> sortedList = people.stream()
		 * .sorted(Comparator.comparing(Person::getFirstname))
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(
		 * "========================================="+"\nsorted list:");
		 * sortedList.forEach(System.out::println);
		 */
		
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstname().compareTo(p2.getFirstname());
			}
		});
		
		// Step 2: Create method that prints all element in the list
		System.out.println("========================================="+"\nall peoples in list:");
		printAllpeople(people);
		
		// Step 3: Create a method that print all people have first name beginning with 'D' 
		System.out.println("========================================="+"\n(using Interface)first name start with 'D':");
		printConditionally(people, new Conditionally() {
			
			@Override
			public boolean check(Person p) {
				
				return p.getFirstname().startsWith("D");
			}
		});
		
		System.out.println("========================================="+"\n(using Interface)print all male peoles:");
		printConditionally(people, new Conditionally() {
			
			@Override
			public boolean check(Person p) {
				
				return p.getGender().equals(Gender.MALE);
			}
		});
		
		System.out.println("========================================="+"\n(using Interface)print all people whos age less than 30 and Females");
		printConditionally(people, new Conditionally() {
			
			@Override
			public boolean check(Person p) {
				
				return p.getAge()<=30 && p.getGender().equals(Gender.FEMALE);
			}
		});
	}

	private static void printConditionally(List<Person> people, Conditionally conditionally) {
		
		for (Person person : people) {
			if(conditionally.check(person)) {
				System.out.println(person);
			}
		}
	}

	private static void printAllpeople(List<Person> people) {
		
		for (Person person : people) {
			System.out.println(person);
		}
	}

}

