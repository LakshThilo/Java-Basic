package collection.List_Inteface;

import java.util.*;


/*
 * 
 * 
 	 ----------   List Interface  ----------

	A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. 
	Elements can be inserted or accessed by their position in the list, using a zero-based index.
	List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. 
	It can have duplicate values.

	List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

	To instantiate the List interface, we must use :

	List <data-type> list1= new ArrayList();  
	List <data-type> list2 = new LinkedList();  
	List <data-type> list3 = new Vector();  
	List <data-type> list4 = new Stack();  
	There are various methods in List interface that can be used to insert, delete, and access the elements from the list.
	
	
	
*/
public class ListInterfaceClass {

	public static void main(String[] args) {
		
		// new ArrayListClass();
		   new LinkedListClass();
		 //new VectorClass();
		 //new StackClass();
	}
}	
	/*
	 * /////////////////------------ ArrayList ------------------//////////////////////// 
	 
	 	Java ArrayList class uses a dynamic array for storing the elements. 
		It inherits AbstractList class and implements List interface.
	
		The important points about Java ArrayList class are:

	 	Java ArrayList class can contain duplicate elements.
	 	Java ArrayList class maintains insertion order.
	 	Java ArrayList class is non synchronised.
	 	Java ArrayList allows random access because array works at the index basis.
	 
		In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur 
		if any element is removed from the array list.
		
		add(E e), add(int index, E e)
		addAll(Collection<? extends E> c), addAll(int index, collection<? extends E> c)  
		clear() , contains(), inEmpty()
		clone(), get(int index), indexOf(Object o)
		set(int index, E element)
		sort(Comparator<? super E> c)
		forEach(Consumer<? super E> action) - Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
		
		
*/
	
	
	
class ArrayListClass {

			
				
			public ArrayListClass() {	
				System.out.println("\n\nPrinting out all ArrayList values ::::::::::::::::::::::");
				ArrayList<String> list=new ArrayList<String>();    
			      list.add("One");   
			      list.add("Two");  
			      list.add("Three");    
			      list.add("Four");
			      list.add("Five"); 
			      System.out.println("--------------Before update:-------- "+list.get(0));   
			      System.out.println(list); 
			      
		          //Updating an element at specific position  
		          list.set(0,"Zero");  
		          list.add(1, "One");
		          
		          list.remove(5);
		          System.out.println("--------------After update:--------- "+list.get(0));   
		    
			      //Invoking arrayList object
			      System.out.println(list);
				  System.out.println("Check .contain() and isEmpty() \n"+list.contains("Four")+", "+list.isEmpty());

			      System.out.println("Printing out the all ArrayList Values: ");
			      Iterator<String> itr = list.iterator();
			      while(itr.hasNext()) {
			    	  System.out.println(itr.next());
			      }
			      
			      ArrayList<String> list2 = new ArrayList<>();
			      list2.add("Five");
			      list2.add("Six");
			      list2.add("Seven");
			      list2.add("Eight");
			      
			      list.addAll(list2);
			      
			      System.out.println("After adding second list:\n"+list);
			      
			      List<String> range = new ArrayList<String>();
			      range = list.subList(2, 4);
			      
			      System.out.println("\nReturn between 2nd(including) and 4th(excluding) in the given list:\n"+range);
			      
			      int pos = list.indexOf("Four");
			      System.out.println("\nPrinting out position of give value: "+pos);
			      
			      String stringPos = list.get(3);
			      System.out.println("\nGetting the actual value according given position: "+stringPos);
			      
			      int list_size = list.size();
			      System.out.println("\nprint the array size: "+list_size);
			           
			      
			}

}

/*//////////////////------------ LinkedList ------------------//////////////////////// 

	 * Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure.
	 * It inherits the AbstractList class and implements List and Deque interfaces.

	 The important points about Java LinkedList are:

	  Java LinkedList class can contain duplicate elements.
	  Java LinkedList class maintains insertion order.
	  Java LinkedList class is non synchronized.

	  In Java LinkedList class, manipulation is fast because no shifting needs to occur.
	  Java LinkedList class can be used as a list, stack or queue.

			1. offer​(E e): This method Adds the specified element as the tail (last element) of this list.
			2. offerFirst​(E e): This method Inserts the specified element at the front of this list.
			3. offerLast​(E e): This method Inserts the specified element at the end of this list.
			4. peek​(): This method retrieves, but does not remove, the head (first element) of this list.
			5. peekFirst​(): This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
			6. peekLast​(): This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
			7. poll​(): This method retrieves and removes the head (first element) of this list.
			8. pollFirst​(): This method retrieves and removes the first element of this list, or returns null if this list is empty.
			9. pollLast​(): This method retrieves and removes the last element of this list, or returns null if this list is empty.
		   10. pop​(): This method Pops an element from the stack represented by this list.
		   11. push​(E e): This method Pushes an element onto the stack represented by this list.
		   12. remove​(): This method retrieves and removes the head (first element) of this list.
		   13. remove​(int index): This method removes the element at the specified position in this list.

		  *
		  */

 class LinkedListClass {

	public LinkedListClass(){
		System.out.println("\n\n:::::::::::::::::::::::::::::Printing out all LinkedList values :::::::::::::::::::::::::::::\n");
		  LinkedList<String> al = new LinkedList<String>();  
		  al.add("Wotson");  
		  al.add("Emma");  
		  al.add("Michel");  
		  al.add("Jackson"); 
		  
		  System.out.println("Before replace Emma\n"+al);
		  al.add(1, "Gaurav"); 
		  System.out.println("After replace Emma\n"+al);
		  
		  LinkedList<String> ll2 = new LinkedList<String>();  
          ll2.add("Sonoo");  
          ll2.add("Hanumat");  
          //Adding second list elements to the first list  
          al.addAll(ll2);  
          
          //al.addFirst("Lokesh");  
          //System.out.println("After invoking addFirst(E e) method: "+ll);  
          //Adding an element at the last position  
         // al.addLast("Harsh");  
          
          al.offer("lak");
          al.offerFirst("praba");
          al.offerLast("wije");
          System.out.println("\nUsing offer: "+al);
		  
		System.out.println("\nprinting a LinkedList  values");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		  
   ////////////// ------------------- reverse a list of elements ---------------------/////////////////  
          System.out.println("\nreverse a LinkedList  values");
          Iterator<String> i = al.descendingIterator();  
          while(i.hasNext())  
          {  
              System.out.println(i.next());  
          }  
            
  
	}

}
/*

		////////////////////   -------------------  Vector in Java  -----------------   /////////////////////

 	Vector implements List Interface. Like ArrayList it also maintains insertion order but it is rarely used in non-thread environment 
 	as it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements.

 	Three ways to create vector class object:
 
		Method 1:
		Vector vec = new Vector();
 	
 	It creates an empty Vector with the default initial capacity of 10. It means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector. 
 	Note: By default vector doubles its size. i.e. In this case the Vector size would remain 10 till 10 insertions and once we try to insert the 11th element It would become 20 (double of default capacity 10).

		Method 2:
		Vector object= new Vector(int initialCapacity)

 	Vector vec = new Vector(3);
 	It will create a Vector of initial capacity of 3.

		Method 3:
		Vector object= new vector(int initialcapacity, capacityIncrement)
 	
 	Vector vec= new Vector(4, 6)
 
 Here we have provided two arguments. The initial capacity is 4 and capacityIncrement is 6. 
 It means upon insertion of 5th element the size would be 10 (4+6) and on 11th insertion it would be 16(10+6).
 
 */
 
  class VectorClass{
	  
	   public VectorClass(){
		   System.out.println("\n\nPrinting out all Vector values :::::::::::::::::::::::::");
	      /* Vector of initial capacity(size) of 2 */
	      Vector<String> vec = new Vector<String>(2);

	      /* Adding elements to a vector*/
	      vec.addElement("Apple");
	      vec.addElement("Orange");
	      vec.addElement("Mango");
	      vec.addElement("Fig");

	      /* check size and capacityIncrement*/
	      System.out.println("Size is: "+vec.size());
	      System.out.println("Default capacity increment is: "+vec.capacity());

	      vec.addElement("fruit1");
	      vec.addElement("fruit2");
	      vec.addElement("fruit3");

	      /*size and capacityIncrement after two insertions*/
	      System.out.println("Size after addition: "+vec.size());
	      System.out.println("Capacity after increment is: "+vec.capacity());

	      /*Display Vector elements*/
	      Enumeration<String> en = vec.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.print(en.nextElement() + " ");
	   }
	}
 
 
 
 
 

 
  class StackClass {

  	/**
		 Java provides a Stack class which models the Stack data structure. The Stack class is part of Java’s collections framework.
	 	The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
	 	Java collection framework provides many interfaces and classes to store the collection of objects.
	 	One of them is the Stack class that provides different operations such as push, pop, search, etc.

	 	In this section, we will discuss the Java Stack class, its methods, and implement the stack data structure in a Java program.
	 	But before moving to the Java Stack class have a quick view of how the stack works.

	 	The stack data structure has the two most important operations that are push and pop. The push operation inserts an element
	 	into the stack and pop operation removes an element from the top of the stack. Let's see how they work on stack.
	 */

		public StackClass() {
			System.out.println("\n\nPrinting out all Stack values ::::::::::::::::::::::::::");
			Stack<String> stack = new Stack<String>();
			stack.push("Ayush");
			stack.push("Garvit");
			stack.push("Amit");
			stack.push("Ashish");
			stack.push("Ashish");
			stack.push("Garima");
			//stack.clear();  
			//System.out.println("Printing out the stacks values :");
			Iterator<String> itr = stack.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

			System.out.println("=== Iterate over a Stack using Java 8 forEach() method ===");
			stack.forEach(plate -> {
				System.out.println(plate);
			});

			System.out.println("\n=== Iterate over a Stack using iterator() and Java 8 forEachRemaining() method ===");
			Iterator<String> platesIterator = stack.iterator();
			platesIterator = stack.iterator();
			platesIterator.forEachRemaining(plate -> {
				System.out.println(plate);
			});


			System.out.println("\n=== Iterate over a Stack from TOP to BOTTOM using listIterator() ===");
			// ListIterator allows you to traverse in both forward and backward directions.
			// We'll start from the top of the stack and traverse backwards.
			ListIterator<String> platesListIterator = stack.listIterator(stack.size());
			while (platesListIterator.hasPrevious()) {
				String plate = platesListIterator.previous();
				System.out.println(plate);
			}
		}
	}
