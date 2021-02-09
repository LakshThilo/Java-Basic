package collection.IteretingCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class IteratingCollection {
	 
/*
		 * Ways to iterate the elements of the collection in java
		There are various ways to traverse the collection elements:

		1.By Iterator interface.
		2.By for-each loop.
		3.By ListIterator interface.
		4.By for loop.
		5.By forEach() method.
		6.By forEachRemaining() method.
		
*/
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();    
		list.add("One");   
		list.add("Two");  
		list.add("Three");    
		list.add("Four");  
		list.add("Five");
		list.add("Six");

		//Invoking arraylist object   
		System.out.println("Printing out list elements: "+list);  

		////////////////////////////////////////////////////	      

		//1.By Iterator interface.
		System.out.println("\n1. Traversing list through Iterator interface:");  
		Iterator<String> itr=list.iterator(); 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 


		/////////////////////////////////////////////////////      

	//2.By for-each loop.	

		System.out.println("\n2.Traversing list through for-each loop:");  
		for(String obj:list)  {
			System.out.println(obj); 
		} 



		////////////////////////////////////////////////////////////	      

	// 3.By ListIterator interface.

		System.out.println("\n3.Traversing list through List Iterator:");  
		//Here, element iterates in reverse order  
		ListIterator<String> list1=list.listIterator(list.size());  
		while(list1.hasPrevious())  
		{  
			System.out.println(list1.previous());  
		} 

		////////////////////////////////////////////////////////////////         

	// 4.By for loop.      

		System.out.println("\n4.Traversing list through for loop:");  
		for(int i=0;i<list.size();i++)  
		{  
			System.out.println(list.get(i));     
		}  

		//////////////////////////////////////////////////////////////////	      

	// 5.By forEach() method.   

		System.out.println("\n5.Traversing list through forEach() method and using lambda expression :");  
		//The forEach() method is a new feature, introduced in Java 8.  
		list.forEach(a->{                    //Here, we are using lambda expression  
			System.out.println(a);  
		}); 

		//////////////////////////////////////////////////////////////////////

	// 6.By forEach() method with Method Reference.

		System.out.println("\n6.Traversing list through forEach() with Method Reference :");
		//The forEach() method is a new feature, introduced in Java 8.
		list.forEach(System.out::println);

		//////////////////////////////////////////////////////////////////////

	//7.By forEachRemaining() method.

		System.out.println("\n7.Traversing list through forEachRemaining() method:");
		Iterator<String> itr3=list.iterator();  
		itr3.forEachRemaining(a-> //Here, we are using lambda expression  
		{  
			System.out.println(a);  
		});  

		////////////////////////////////////////////////////////////////
/*
			      System.out.println("");

   try  
    {  
        //Serialisation  
        FileOutputStream fos=new FileOutputStream("file");  
        ObjectOutputStream oos=new ObjectOutputStream(fos);  
        oos.writeObject(list);  
        fos.close();  
        oos.close();

        //De-serialisation  
        FileInputStream fis=new FileInputStream("file");  
        ObjectInputStream ois=new ObjectInputStream(fis);

      ArrayList  li=(ArrayList)ois.readObject();  
      System.out.println(li);    
    }catch(Exception e)  
    {  
        System.out.println(e);  
    }  
 */

	} 

}
