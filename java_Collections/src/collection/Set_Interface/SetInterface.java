package collection.Set_Interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * 		///////////////   --------------  Set Interface   -------------------   /////////////////////////////

	Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. 
	We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
	
	A Set is a Collection that cannot contain duplicate elements. There are three main implementations of 
	Set interface:
		1. HashSet,
		2. TreeSet, and
		3. LinkedHashSet.

	HashSet, which stores its elements in a hash table, is the best-performing implementation;
	however it makes no guarantees concerning the order of iteration. TreeSet, which stores its elements in a red-black tree, orders its elements based on their values; 
	it is substantially slower than HashSet. LinkedHashSet, which is implemented as a hash table with a linked list running through it, 
	orders its elements based on the order in which they were inserted into the set (insertion-order).

	Set can be instantiated as:

	Set<data-type> s1 = new HashSet<data-type>();  
	Set<data-type> s2 = new LinkedHashSet<data-type>();  
	Set<data-type> s3 = new TreeSet<data-type>(); 
*/


public class SetInterface {

	public static void main(String[] args) {
		
			//new HashSetClass();
			//new LinkedHashSetClass();
			new TreeSetClass();
	
	}

}


/*
 * 
 			/////////////  ----------------  HashSet in Java ---------------  /////////////////
 
	This class implements the Set interface, backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; 
	in particular, it does not guarantee that the order will remain constant over time. This class permits the null element. 
	This class is not synchronized. However it can be synchronized explicitly like this: Set s = Collections.synchronizedSet(new HashSet(...));

	Points to Note about HashSet:

	1. HashSet doesn't maintain any order, the elements would be returned in any random order.
	2. HashSet doesn't allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
	3. HashSet allows null values however if you insert more than one nulls it would still return only one null value.
	4. HashSet is non-synchronized.
	
	The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException if HashSet has been modified after creation of iterator, 
	by any means except iterator�s own remove method.
	
	
	Constructors in HashSet:

	1. HashSet h = new HashSet(); 
	2. HashSet h = new HashSet(int initialCapacity); 
	3. HashSet h = new HashSet(int initialCapacity, float loadFactor);
	4. HashSet h = new HashSet(Collection C);


	HashSet Methods:
	
	1. boolean add(Element  e): It adds the element e to the list.
	2. void clear(): It removes all the elements from the list.
	3. Object clone(): This method returns a shallow copy of the HashSet.
	4. boolean contains(Object o): It checks whether the specified Object o is present in the list or not. If the object has been found it returns true else false.
	5. boolean isEmpty(): Returns true if there is no element present in the Set.
	6. int size(): It gives the number of elements of a Set.
	7. boolean(Object o): It removes the specified Object o from the Set.

*/
 class HashSetClass {
	 
	   public HashSetClass(){
		   System.out.println("Printting out the all HashSet values: :::::::::::::::::::::::");
	      // HashSet declaration
	      HashSet<String> hset =  new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add(null);
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
	      
	      boolean isCheck = hset.contains("Orange");
	      boolean isCheck2 = hset.contains("Orange2");
	      System.out.println("Check whether value is there or not: "+isCheck);
	      System.out.println("Check whether value is there or not: "+isCheck2);

	      HashSet<String> list = new HashSet<String>();
	      list = (HashSet<String>)hset.clone();
	      System.out.println(list);
	    }
	}
 
 
 
/* 
 * 
 * 		////////////////  -------------- LinkedHashSet Class  -------------  /////////////////////
 * 
	LinkedHashSet is also an implementation of Set interface, 
	it is similar to the HashSet and TreeSet except the below mentioned differences:

	1. HashSet doesn't maintain any kind of order of its elements.
	2. TreeSet sorts the elements in ascending order.
	3. LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set.
	
		constructors supported by the LinkedHashSet:

		1. LinkedHashSet(): This constructor is used to create a default HashSet.
		2. LinkedHashSet(Collection C): Used in initializing the HashSet with the elements of the collection C
		3. LinkedHashSet(int size): Used to initialize the size of the LinkedHashSet with the integer mentioned in the parameter.
		4. LinkedHashSet(int capacity, float fillRatio): Can be used to initialize both the capacity and the fill ratio,
														also called the load capacity of the LinkedHashSet with the arguments mentioned in the parameter.
														When the number of elements exceeds the capacity of the hash set is multiplied with the fill ratio
														thus expanding the capacity of the LinkedHashSet
	 
	*/

  class LinkedHashSetClass {
	  
     public LinkedHashSetClass(){
         // LinkedHashSet of String Type
    	 System.out.println("\nPrintting out the all LinkedHashSet values: :::::::::::::::::::::::");
         LinkedHashSet<String> lhset = new LinkedHashSet<String>();

         // Adding elements to the LinkedHashSet
         lhset.add("Z");
         lhset.add("PQ");
         lhset.add("N");
         lhset.add("O");
         lhset.add("KK");
         lhset.add("FGH");
         System.out.println(lhset);

         // LinkedHashSet of Integer Type
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

         // Adding elements
         lhset2.add(99);
         lhset2.add(7);
         lhset2.add(0);
         lhset2.add(67);
         lhset2.add(89);
         lhset2.add(66);
         System.out.println(lhset2);
         
         lhset2.remove(67);
         System.out.println("After removing values:\n"+lhset2);
         System.out.println("Checking values 89 is present: "+lhset2.contains(89));
         lhset2.clear();
         System.out.println("After deleting list check list Empty or not: "+lhset2.isEmpty());
    }
}
  
/* 
 * 
 ////////////// ------------------ SortedSet Interface -------------------///////////////////////
 			 
		SortedSet is the alternate of Set interface that provides a total ordering on its elements. 
		The elements of the SortedSet are arranged in the increasing (ascending) order.
		The SortedSet provides the additional methods that inhibit the natural ordering of the elements.
		
		The SortedSet can be instantiated as:
		
			SortedSet<data-type> set = new TreeSet(); 
		    
 
  /////////////////  -------------------   TreeSet Class in Java -----------------------  ////////////////////////////
  
  TreeSet is similar to HashSet except that it sorts the elements in the ascending order while HashSet doesn�t maintain any order. 
  TreeSet allows null element but like HashSet it doesn't allow. Like most of the other collection classes this class is also not synchronized,
  however it can be synchronized explicitly like this: SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
  
   TreeSet, which stores its elements in a red-black tree, orders its elements based on their values; 
	it is substantially slower than HashSet. LinkedHashSet, which is implemented as a hash table with a linked list running through it, 
	orders its elements based on the order in which they were inserted into the set (insertion-order).

   The important points about Java TreeSet class are:

	Java TreeSet class contains unique elements only like HashSet.
	Java TreeSet class access and retrieval times are quiet fast.
	Java TreeSet class doesn't allow null element.
	Java TreeSet class is non synchronized.
	Java TreeSet class maintains ascending order.
	
	$-- important methods-- $
	** 1. E ceiling(E e)	    -:   It returns the equal or closest greatest element of the specified element from the set, 
	                                 or null there is no such element.
	                      
	   2. Iterator descendingIterator()  -: 	It is used iterate the elements in descending order.
	 
	   3. E floor(E e)	-:      It returns the equal or closest least element of the specified element from the set,
	                           or null there is no such element.
	                           
	   4.  E higher(E e) -:	It returns the closest greatest element of the specified element from the set, 
	                        or null there is no such element.
	                        
       5.  Iterator iterator() -:	It is used to iterate the elements in ascending order.
       
       6.  E lower(E e)  -:   	It returns the closest least element of the specified element from the set, 
                                or null there is no such element.
                                
       7.   E pollFirst() -:	It is used to retrieve and remove the lowest(first) element.
 
       8.   E pollLast()  -:	It is used to retrieve and remove the highest(last) element.   
  */
  
   class TreeSetClass {
	   
	     public TreeSetClass() {
	    	 //Creating and adding elements  
	    	 System.out.println("\nPrintting out the all TreeSet values: :::::::::::::::::::::::");
			  TreeSet<String> al=new TreeSet<String>();  
			  al.add("Thomas");  
			  al.add("Kattak");  
			  al.add("Smith");  
			  al.add("Lakisha");  
			  
			  //Traversing elements  
			/*  Iterator<String> itr=al.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }  
			  System.out.println("");
			  System.out.println("Traversing element through Iterator in descending order");  
		         Iterator i=al.descendingIterator();  
		         while(i.hasNext())  
		         {  
		             System.out.println(i.next());  
		         } */
		         
		      TreeSet<Integer> set = new TreeSet<Integer>();
			  	 set.add(24);  
		         set.add(06);  
		         set.add(12);  
		         set.add(15);
		         set.add(44);  
		         set.add(76);  
		         set.add(93);  
		         set.add(95);
		         
		         System.out.println(set);
//		         System.out.println("Lowest Value: "+set.pollFirst());  
//		         System.out.println(set);
//		         System.out.println("Highst Value: "+set.pollLast());
		         
		         System.out.println("Returns the equal or closest greatest element: "+set.ceiling(94));
			   
		         System.out.println("Reverse Set: "+set.descendingSet());  
		           
		         //System.out.println("Head Set: "+set.headSet(24, true));  
		          
		         System.out.println("SubSet: "+set.subSet(12, true, 76, true));  
		           
		         //System.out.println("TailSet: "+set.tailSet("C", false));  
	    }
	 }