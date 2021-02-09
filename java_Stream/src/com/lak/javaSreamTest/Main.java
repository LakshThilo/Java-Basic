package com.lak.javaSreamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Person> list = getlistPerson();
	
		// Imperative approach
		List<Person> female = new ArrayList<Person>();
		
		for (Person person : list) {
			if (person.getGender()==Gender.FEMALE) {
				female.add(person);
				
			}
		}
		
		//System.out.println(female);
		//female.forEach(System.out::println);
		
		//Declaration approach 
		List<Person> femaleList  = list.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		
		System.out.println("===================");
		System.out.println("filtered list:");
		femaleList.forEach(System.out::println);
		
		//sort
		System.out.println("=======================================");
		System.out.println("actual list:");
		list.forEach(System.out::println);
		System.out.println("=======================================");
		
		List<Person> sorted = list.stream()
								  .sorted(Comparator.comparing(Person::getAge))
								  .collect(Collectors.toList());

		System.out.println("sorted list:");
		sorted.forEach(System.out::println);
		
		//min/max
		System.out.println("youngerst one in the list:");
		 list.stream()
		.min(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
		 
		 //Group
		 Map<Gender, List<Person>> grouByGender = list.stream()
		 .collect(Collectors.groupingBy(Person::getGender));
	
		System.out.println("grouping list:");

		 grouByGender.forEach((gender,people) -> {
			 System.out.println(gender);
			 people.forEach(System.out::println);
		 });
	}

	private static List<Person> getlistPerson() {
		return Arrays.asList(
				new Person("Lak", 29, Gender.MALE),
				new Person("Thilo", 24, Gender.FEMALE),
				new Person("Sam", 34, Gender.MALE),
				new Person("Tom", 28, Gender.FEMALE),
				new Person("Theo", 94, Gender.MALE),
				new Person("David", 55, Gender.MALE),
				new Person("Wije", 98, Gender.MALE)
				);    
	}


}
