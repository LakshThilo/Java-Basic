package collection.Queue_Interface;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

/*
	////////////////  ---------------- Queue Interface --------------------- //////////////////////
	 
	A Queue is designed in such a way so that the elements added to it are placed at the end of Queue and removed from the beginning of Queue. 
	The concept here is similar to the queue we see in our daily life, for example, when a new iPhone launches we stand in a queue outside the apple store, 
	whoever is added to the queue has to stand at the end of it and persons are served on the basis of FIFO (First In First Out), 
	The one who gets the iPhone is removed from the beginning of the queue 
	 
	Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. 
	There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
	
	Few important characteristics of Queue are:

	1. The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
	2. The Java Queue supports all methods of Collection interface including insertion, deletion etc.
	3. LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
	4. If any null operation is performed on BlockingQueues, NullPointerException is thrown.

	Queue interface in Java collections has two implementation: LinkedList and PriorityQueue, these two classes implements Queue interface.
	Queue is an interface so we cannot instantiate it, rather we create instance of LinkedList or PriorityQueue and assign it to the Queue like this:

	Queue q1 = new LinkedList();
	Queue q2 = new PriorityQueue();
	
	Methods of Queue interface
	
	1. boolean add(E e): This method adds the specified element at the end of Queue. Returns true if the the element is added successfully or 
	   false if the element is not added that basically happens when the Queue is at its max capacity and cannot take any more elements.

	2. E element(): This method returns the head (the first element) of the Queue.

	3. boolean offer(object): This is same as add() method.

	4. E remove(): This method removes the head(first element) of the Queue and returns its value.

	5. E poll(): This method is almost same as remove() method. The only difference between poll() and remove() is that poll() method returns null if the Queue is empty.

	6. E peek(): This method is almost same as element() method. The only difference between peek() and element() is that peek() method returns null if the Queue is empty.
	
	
*/

public class QueueInterface {

	public static void main(String[] args) {
		
		//new LinkedListClass();
		new PriorityQueueClass();
		//new ArrayDequeExample();
	}

}


/*
 * 	
	 
 
 /////////////////////  ------------------ LinkedList  -----------------  //////////////////////////// 
  
  
*/
  
 class LinkedListClass {
	 
	   public LinkedListClass() {
		  
	      /*
	       * We cannot create instance of a Queue as it is an
	       * interface, we can create instance of LinkedList or
	       * PriorityQueue and assign it to Queue
	       */
	      Queue<String> q = new LinkedList<String>();
		    
	      //Adding elements to the Queue
	      q.add("Rick");
	      q.add("Maggie"); 
	      q.add("Glenn");
	      q.add("Negan");
	      q.add("Daryl");
		    
	      System.out.println("Elements in Queue:/n"+q);

	      /*
	       * We can remove element from Queue using remove() method,
	       * this would remove the first element from the Queue 
	       */
	      System.out.println("\nRemoved element: "+q.remove());
	      System.out.println("Elements in Queue:"+q);
		    
	      /*
	       * element() method - this returns the head of the
	       * Queue. Head is the first element of Queue
	       */
	      System.out.println("\nHead: "+q.element());
	      System.out.println("Elements in Queue:"+q);
		    
	      /*
	       * poll() method - this removes and returns the 
	       * head of the Queue. Returns null if the Queue is empty
	       */
	      System.out.println("\npoll(): "+q.poll());
	      System.out.println("Elements in Queue:"+q);
		    
	      /*
	       * peek() method - it works same as element() method,
	       * however it returns null if the Queue is empty
	       */
	      System.out.println("\npeek(): "+q.peek());
	      System.out.println("Elements in Queue:"+q);
		    
	      //Again displaying the elements of Queue
	      System.out.println("\nElements in Queue:"+q);
	      System.out.println("\n\n=======================================================================");
	   }
}
 
/*             
    ////////////   -----------  Java PriorityQueue class  ---------------  /////////////////////////////
 


 	Java PriorityQueue class is a queue data structure implementation in which objects are processed based on their priority. 
 	It is different from standard queues where FIFO (First-In-First-Out) algorithm is followed.

 	In a priority queue, added objects are according to their priority. By default, the priority is determined by objects� natural ordering. 
 	Default priority can be overridden by a Comparator provided at queue construction time.
 	
 	
  	PriorityQueue Features :	

	1. PriorityQueue is an unbounded queue and grows dynamically. The default initial capacity is '11' which can be overridden using initialCapacity parameter in appropriate constructor.
	2. It does not allow NULL objects.
	3. Objects added to PriorityQueue MUST be comparable.
	4. The objects of the priority queue are ordered by default in natural order.
	5. A Comparator can be used for custom ordering of objects in the queue.
	6. The head of the priority queue is the least element based on the natural ordering or comparator based ordering. When we poll the queue, it returns the head object from the queue.
	7. If multiple objects are present of same priority the it can poll any one of them randomly.
	8. PriorityQueue is not thread safe. Use PriorityBlockingQueue in concurrent environment.
	9. It provides O(log(n)) time for add and poll methods.
	
	Methods of PriorityQueue Class :
	
	1. boolean add(E e): Adds the element into the PriorityQueue.
	
	2. void clear(): This method removes all the elements from the PriorityQueue.
	
	3. boolean contains(Element e): This method returns true, if the specified element is present in the Queue.
	
	4. boolean Offer(E e): Same as add() method.
	
	5. E peek(): Returns the head(the first element) of the Queue.
	
	6. E poll(): Removes the head of the Queue and returns it.
	
	7. boolean remove(E e): This method removes the specified element from the Queue and returns true if the deletion is successful. If the specified element is not present in the Queue then it returns false.
	
	8. int size(): Returns the size of the Queue.
	
	10. object[] toArray(): Returns array containing all the elements of Queue.
 */
 
  class PriorityQueueClass {
	  
     public PriorityQueueClass(){
     
         
         PriorityQueue<String> queue = new PriorityQueue<String>(15, new MyComparator());
         queue.add("Tyrion Lannister");
         queue.add("Daenerys Targaryen");
         queue.add("Arya Stark");
         queue.add("Petyr Baelish");
         System.out.println("\nElements in PriorityQueue:\n"+queue);
 /*
    * What I am doing here is removing the highest priority element from Queue and displaying it.
    * The priority I have set is based on the string length. The logic for it is written in Comparator
  */
         Iterator<String> itr = queue.iterator();
         while(itr.hasNext()) {
        	 System.out.print(itr.next()+", ");
         }
         System.out.println("\n");
         while (queue.size() != 0)
         {
             System.out.println("queue.poll(): "+queue.poll());
         
         }
         
         System.out.println("\n=======================================================================\n");
         
         //Creates a PriorityBlockingQueue containing the elements in the specified collection.
         Vector<Integer> v = new Vector<Integer>(); 
         v.addElement(1); 
         v.addElement(2); 
         v.addElement(3); 
         v.addElement(4); 
         v.addElement(5); 
   
         // create object of PriorityBlockingQueue 
         // using PriorityBlockingQueue(Collection c) constructor 
         PriorityQueue<Integer> pbq  = new PriorityQueue<Integer>(v); 
            
         // print queue 
         System.out.println("Creates a PriorityQueue containing the elements in the specified collection:\n" + pbq); 
         System.out.println("\n=======================================================================\n");
                           
     }
 }
 
  
  class MyComparator implements Comparator<String> {
	  
     @Override
     public int compare(String x, String y)
     {
        return x.length() - y.length();
     }
  }
  
/* 
 //////////////////  ----------------  	Deque Interface ---------------------  ///////////////

  Deque is a Queue in which you can add and remove elements from both sides.
  Deque is an interface and has two implementations: LinkedList and ArrayDeque. By implementation I refer that these classes LinkedList and ArrayDeque implements Deque interface, 
  so we can create the instance of these and assign it to the Deque like this:

	Deque dq = new LinkedList();
	Deque dq = new ArrayDeque();
	
	When to use ArrayList and when to use ArrayDeque?
	ArrayDeque has the ability to add or remove the elements from both ends (head or tail), on the other hand removing last element from ArrayList takes O(n) time 
	as it traverses the whole list to reach the end. So if you want to add or remove elements from both ends choose ArrayDeque over ArrayList, 
	however if you only want to perform the opreation on the tail (at the end) then you should choose ArrayList.
	
	
	Methods of Deque interface :

	1. void addFirst(E e): Inserts the specified element at the beginning of the Deque.

	2. void addLast(E e): Inserts the specified element at the end of the Deque.

	3. boolean contains(Object o): Returns true if the specified element is present in the Deque.

	4. E getFirst(): It returns the first element of the Deque.

	5. E getLast(): It returns the last element of the Deque.

	6. E peekFirst(): Returns the first element of Deque, or null if the Deque is empty.

	7. E peekLast(): Returns the last element of Deque, or null if the Deque is empty.

	8. E pollFirst(): Returns and removes the first element of Deque, or null if the Deque is empty.

	9. E pollLast(): Returns and removes the last element of Deque, or null if the Deque is empty.

	10. int size(): Returns the number of elements present in Deque.
	
  */
  
 class ArrayDequeExample {

	   public ArrayDequeExample() {
			  
	       /*
		* We cannot create instance of a Deque as it is an
		* interface, we can create instance of ArrayDeque or
		* LinkedList and assign it to Deque
		*/
	       Deque<String> dq = new ArrayDeque<String>();
		    
	       /*
		* Adding elements to the Deque.
		* addFirst() adds element at the beginning 
	        * and addLast() method adds at the end.
		*/
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daryl");
		    
		System.out.println("Elements in Deque:"+dq);

	        /*
		 * We can remove element from Deque using remove() method,
		 * we can use normal remove() method which removes first 
		 * element or we can use removeFirst() and removeLast()
		 * methods to remove first and last element respectively.
		 */
		System.out.println("Removed element: "+dq.removeLast());
		    
		/*
		 * element() method - returns the head of the
		 * Deque. Head is the first element of Deque
		 */
		 System.out.println("Head: "+dq.element());
		    
		/*
		 * pollLast() method - this method removes and returns the 
		 * tail of the Deque(last element). Returns null if the Deque is empty.
		 * We can also use poll() or pollFirst() to remove the first element of
		 * Deque.
		 */
		System.out.println("poll(): "+dq.pollLast());
		    
		/*
		 * peek() method - it works same as element() method,
		 * however it returns null if the Deque is empty. We can also use 
		 * peekFirst() and peekLast() to retrieve first and last element
		 */
		System.out.println("peek(): "+dq.peek());
		    
		//Again printing the elements of Deque
		System.out.println("Elements in Deque:"+dq);
	   }
	} 
  