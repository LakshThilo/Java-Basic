package collection.Map_Interface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 ////////////// ----------------Java Map Interface ----------------////////////
 
  A map contains values on the basis of key, i.e. key and value pair. 
 Each key and value pair is known as an entry. A Map contains unique keys.

 A Map is useful if you have to search, update or delete elements on the basis of a key.

 There are two interfaces for implementing Map in java: Map and SortedMap, and 
 three classes: HashMap, LinkedHashMap, and TreeMap.

 A Map doesn't allow duplicate keys, but you can have duplicate values.
 HashMap and LinkedHashMap allow null keys and values,
 but TreeMap doesn't allow any null key or value.

 Class-:
  HashMap	            HashMap is the implementation of Map, but it doesn't maintain any order.
  LinkedHashMap     	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
  TreeMap	            TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
  
  
  Methods in Map Interface:

	1. public Object put(Object key, Object value): This method is used to insert an entry in this map.
	2. public void putAll(Map map): This method is used to insert the specified map in this map.
	3. public Object remove(Object key): This method is used to delete an entry for the specified key.
	4. public Object get(Object key):This method is used to return the value for the specified key.
	5. public boolean containsKey(Object key): This method is used to search the specified key from this map.
	6. public Set keySet(): This method is used to return the Set view containing all the keys.
	7. public Set entrySet(): This method is used to return the Set view containing all the keys and values.
  
*/

public class Map_Inteface {

	public static void main(String[] args) {
		 //new LinkedHashMapExample();
		 //new HashMapExample();
		 new TreeMapExample();
	}

}


/*
 ////////////------------------Java LinkedHashMap class-------------//////////////////////////
  * 

Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.

Points to remember
 Java LinkedHashMap contains values based on the key.
 Java LinkedHashMap contains unique elements.
 Java LinkedHashMap may have one null key and multiple null values.
 Java LinkedHashMap is non synchronized.
 Java LinkedHashMap maintains insertion order.
 
 K: It is the type of keys maintained by this map.
 V: It is the type of mapped values.
 */

class LinkedHashMapExample{
	
	public LinkedHashMapExample(){
		
		  LinkedHashMap<Integer,String> map1=new LinkedHashMap<Integer,String>();  
		  map1.put(97,"Amit");  
		  map1.put(98,"Vijay");  
		  map1.put(99,"Rahul"); 
		  
		  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map1.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
	      }
		  
		  System.out.println("\n");
		  
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      map.put(103, "Sukesh");
	      map.put(104,"Rakesh");   
	      map.put(105, "Kasun");
	      
	      map.putAll(map1);
	      
	      map.replace(97,"Shaman");
	      map.replace(98,"Suresh");
	      map.replace(99,"Kushi");
	      
	      //Returns a Set view of the mappings contained in this map    
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
//		  System.out.println("");
//	      map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	      
	      /*System.out.println("Updated list of elements:");  
	      map1.replaceAll((k,v) -> "Ajay");  
	      for(Map.Entry m:map1.entrySet())  
	      {  
	         System.out.println(m.getKey()+" "+m.getValue());   
	      } */
	 } 


}

/*
///////////////-------------- Java HashMap class --------------------//////////////////////

Java HashMap class implements the map interface by using a hash table. 
It inherits AbstractMap class and implements Map interface.

Points to remember
Java HashMap class contains values based on the key.
Java HashMap class contains only unique keys.
Java HashMap class may have one null key and multiple null values.
Java HashMap class is non synchronized.
Java HashMap class maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

As shown in the above figure, HashMap class extends AbstractMap class and implements Map interface.

HashMap class Parameters

  K: It is the type of keys maintained by this map.
  V: It is the type of mapped values.

$---------Methods of Java HashMap class-----------------$

1. void clear()	It is used to remove all of the mappings from this map.

2. boolean isEmpty()	It is used to return true if this map contains no key-value mappings.

3. Object clone()	It is used to return a shallow copy of this HashMap instance: 
                    the keys and values themselves are not cloned.

4. Set entrySet()	It is used to return a collection view of the mappings contained in this map.

5. Set keySet()	It is used to return a set view of the keys contained in this map.

6. V put(Object key, Object value)	It is used to insert an entry in the map.

7. void putAll(Map map)	It is used to insert the specified map in the map.

8. V putIfAbsent(K key, V value)	It inserts the specified value with 
                                   the specified key in the map only if it is not already specified.

9. V remove(Object key)	It is used to delete an entry for the specified key.
10. boolean remove(Object key, Object value)	It removes the specified values with the associated specified keys from the map.
*/

class HashMapExample {

	public HashMapExample() {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements: " + hm);
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		System.out.println("After invoking put() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(104, "Ravi");
		map.putAll(hm);

		System.out.println("After invoking putAll() method ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
			//////////////// --------WAYS ITERATE MAP VALUES --------------///////////////

			///////////////// -------- Way 1 to Iterate to Map values WITH FOOR-EACH
			///////////////// ----------- //////////////////////
			System.out.println("After invoking putAll() method and Way 1 to Itarate Map Values for-each");
			for (Map.Entry m1 : map.entrySet()) {
				System.out.println(m1.getKey() + " " + m1.getValue());
			}

			////////////// ----- Way 2 to Iterate Map Values Iterator Interface and
			////////////// WHILE-LOOP---------///////////////////////
			System.out.println("Way 2 that Itarate Map Values:");
			Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry<Integer, String> entry = entries.next();
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

///////////////////////////// --------WAY 3 to Iterate Using Java 8 ForEach --------------//////////////////////
				map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
			}
		
	}
}

/*
 * 
 ///////////////////-------------Java TreeMap class-----------------/////////////////////
  * 
 	Java TreeMap class hierarchy
 	Java TreeMap class is a red-black tree based implementation. It provides an efficient means of storing key-value pairs in sorted order.

	The important points about Java TreeMap class are:

 	Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 	Java TreeMap contains only unique elements.
 	Java TreeMap cannot have a null key but can have multiple null values.
 	Java TreeMap is non synchronized.
	Java TreeMap maintains ascending order.
	
	Constructors in TreeMap:

	1. TreeMap() : Constructs an empty tree map that will be sorted by using the natural order of its keys.
	2. TreeMap(Comparator comp) : Constructs an empty tree-based map that will be sorted by using the Comparator comp.
	3. TreeMap(Map m) : Initializes a tree map with the entries from m, which will be sorted by using the natural order of the keys.
	4. TreeMap(SortedMap sm) : Initializes a tree map with the entries from sm, which will be sorted in the same order as sm.
	
	
	Methods of TreeMap:

	1. boolean containsKey(Object key): Returns true if this map contains a mapping for the specified key.
	2. boolean containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
	3. Object firstKey(): Returns the first (lowest) key currently in this sorted map.
	4. Object get(Object key): Returns the value to which this map maps the specified key.
	5. Object lastKey(): Returns the last (highest) key currently in this sorted map.
	6. Object remove(Object key): Removes the mapping for this key from this TreeMap if present.
	7. void putAll(Map map): Copies all of the mappings from the specified map to this map.
	8. Set entrySet(): Returns a set view of the mappings contained in this map.
	9. int size(): Returns the number of key-value mappings in this map.
	10. Collection values(): Returns a collection view of the values contained in this map.
	11. Object clone(): The method returns a shallow copy of this TreeMap.
	12. void clear(): The method removes all mappings from this TreeMap and clears the map.
	13. SortedMap headMap(Object key_value): The method returns a view of the portion of the map strictly less than the parameter key_value.
	14. Set keySet(): The method returns a Set view of the keys contained in the treemap.
	15. Object put(Object key, Object value): The method is used to insert a mapping into a map
	16. SortedMap subMap((K startKey, K endKey): The method returns the portion of this map whose keys range from startKey, inclusive, to endKey, exclusive.
	17. Object firstKey(): The method returns the first key currently in this tree map.
 */


 class TreeMapExample { 
	 
	 TreeMapExample(){
		 
		   
	        TreeMap<String, Double> tm = new  TreeMap<>(new TreeCompare()); 
	        tm.put("Head First Java", 807.34); 
	        tm.put("Java: A Beginners Guide 6th "+ "Edition", 593.05); 
	        tm.put("Java: The Complete Reference"+    " 9th Edition", 531.31); 
	        tm.put("Core Java Volume I_Fundamentals"+  " 9th Edition", 544.34); 
	        tm.put("Effective Java 2nd Edition", 373.70); 
	  
	        // Values can be null 
	        tm.put("Java 8 in action", null); 
	  
	        // Last entry with the same key  
	        // reflected in output 
	        tm.put("Java 8 in action", 539.65); 
	          
	        Set<Map.Entry<String, Double>> set =    tm.entrySet(); 
	         
	        System.out.println("Printing out all Keys and Values: ");
	        for(Map.Entry<String,Double> me : set) 
	         System.out.println("Key: "+me.getKey()+"  Value: Rs."  +me.getValue()); 
	                             
	          
	        tm.remove("Core Java Volume I_Fundamentals"+  " 9th Edition"); 
	                   
	        System.out.println("\n...After removal of "+  "Core Java..."); 
	                          
	        for(Map.Entry<String,Double> me : set) 
	          System.out.println(me.getKey()+": Rs." +me.getValue()); 
	                               
		 
	 }
	 
	 
    // May be replaced by an external class 
    static class TreeCompare  implements Comparator<String> 
    { 
        /* Compares keys based on the  
           last word's natural ordering */
        public int compare(String a, String b) 
        { 
            int i,j,k; 
  
            //Sorting by surnames 
            i = a.lastIndexOf(' '); 
            j = b.lastIndexOf(' '); 
            k = a.substring(i).compareToIgnoreCase(b.substring(j)); 
                             
            if(k==0) 
                return a.compareToIgnoreCase(b); 
            else return k; 
        } 
          
    } 
  
} 
		           
