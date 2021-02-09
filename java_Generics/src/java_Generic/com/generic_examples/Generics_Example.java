package java_Generic.com.generic_examples;

public class Generics_Example{

	public static void main (String[] args) 
	{ 
		// instance of Integer type 
		Generic_Class <Integer> iObj = new Generic_Class<Integer>(15); 
		System.out.println(iObj.getObject()); 

		// instance of String type 
		Generic_Class <String> sObj = 
				new Generic_Class<String>("GeeksForGeeks"); 
		System.out.println(sObj.getObject()); 
	} 
}

class Generic_Class<T>{

	// An object of type T is declared 
	T obj; 
	Generic_Class(T obj) 
	{ 
		this.obj = obj; 

	}  // constructor 
	public T getObject()  { return this.obj; } 
} 
   

