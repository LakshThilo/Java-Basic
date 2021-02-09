package collections_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class Collections_class {

	public static void main(String[] args) {

		List<String> collections = new ArrayList<String>();

		System.out.println();
		System.out.println(
				"Add all data to list using Collections Class in java.util.collections and have use AddAll method in Collections class");

		// Add all data to list using Collections Class in java.util.collections
		// and have use AddAll method in Collections class
		Collections.addAll(collections, "ArrayList", "LinkedList", "Vector", "Stack", "HashSet", "LinkedHashSet",
				"TeeSet", "LinkedList", "PrirityQueue", "BlockingQueue", "BlockingPriorityQueue");

		// 1. Lambda expression in first ways
		System.out.println("\nMethod Reference in first ways");
		collections.forEach(System.out::println);

		// Print out the normal list of data
		System.out.println("\nPrint out the normal list of data \n" + collections);

		System.out.println();

		// Shot the data using sort method in Collection class
		Collections.sort(collections);

		// 2. Second way of printing out the data using Lambda expression
		System.out.println(
				"Sorting the list using Collections sort method and print using Lamda expression in second way List---------->");
		collections.forEach(item -> System.out.println(item));

		// Adding another data(Map) to the List
		collections.add("Map");

		System.out.println();

		// After adding data print out the list
		collections.forEach(item -> System.out.println(item));

		// print out the natural List as it is
		System.out.println("\nprint out the  natural List as it is\n" + collections);

		System.out.println("\nUsing Binary search Value is in : " + Collections.binarySearch(collections, "HashSet")
				+ "rd index in the list\n");

		List<String> allList = null;
		try {
			// allList = Arrays.asList("12","23");
			Collections.copy(allList, collections);
		} catch (NullPointerException e) {
			// e.printStackTrace();
			e.getMessage();
		} catch (IndexOutOfBoundsException e) {
			// e.printStackTrace();
			e.getMessage();
		} finally {

			System.out.println("Strat final block");
			allList.forEach(item -> System.out.println(item));
			System.out.println("Printing out the newly created array:" + allList);
			System.out.println("Finished final block");

		}
		System.out.println("\nOutside the finall block\n");
		List<String> list = new Vector<String>();
		Collections.addAll(list, "ArrayList", "LinedList", "Vector", "Stack");
		list.forEach(System.out::println);
		System.out.println();

		Set<String> set = new HashSet<String>();
		Collections.addAll(set, "HashSet", "LinkedHashSet", "TreeSet");
		System.out.println("First way to use For-Each-------------->");
		set.forEach(System.out::println);
		System.out.println();
		System.out.println("Second way to use For-Each-------------->");
		set.forEach(item -> System.out.println(item));
		System.out.println();

		Queue<String> queue = new PriorityQueue<String>();
		Collections.addAll(queue, "LinkedList", "PriorityQueue", "BlockingQueue", "ProrityBlockingQueue");
		// queue.forEach(System.out::println);

		// System.out.println();

	}

}
