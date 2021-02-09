package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;;

public class SoluctionJava8 {
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
				new Person("Kajol", 55, Gender.FEMALE),
				new Person("Dev", 28, Gender.MALE)
				);

	
 
		
		Collections.sort(people, (p1,p2) -> p1.getFirstname().compareTo(p2.getFirstname()));
		 // System.out.println( "========================================="+"\nsorted list:");
		 //sortedList.forEach(System.out::println);
		
		// Step 2: Create method that prints all element in the list
				  
		System.out.println("========================================="+"\nall peoples in list:");
		//printAllpeople(people);
		printConditionally(people,p -> true);
		
		System.out.println("========================================="+"\nprint all peoples in list using Cunsumer Interface:");
		performConditionally(people,p -> true, p -> System.out.println(p.getFirstname()));
		
		// Step 3: Create a method that print all people have first name beginning with 'D' 

		System.out.println("========================================="+"\n(using Interface)first name start with 'D':");
		printConditionally(people, p -> p.getFirstname().startsWith("D"));
		
		System.out.println("========================================="+"\n(using Interface)print all people whos age less than 30 and Females");
		printConditionally(people, p -> p.getAge()<=30 && p.getGender().equals(Gender.FEMALE));
	
	}

	/*
	 * private static void printConditionally(List<Person> people,Conditionally
	 * conditionally) {
	 * 
	 * for (Person person : people) { if(conditionally.check(person)) {
	 * System.out.println(person); } } }
	 */
	
	private static void printConditionally(List<Person> people,Predicate<Person> conditionally) {
		
		for (Person person : people) {
			if(conditionally.test(person)) {
				System.out.println(person);
			}
		}
	}
	
		private static void performConditionally(List<Person> people,Predicate<Person> conditionally,Consumer<Person> consumer) {
			
			for (Person person : people) {
				if(conditionally.test(person)) {
					consumer.accept(person);
				}
			}
	}

	/*
	 * private static void printAllpeople(List<Person> people) {
	 * 
	 * for (Person person : people) { System.out.println(person); } }
	 */

}

