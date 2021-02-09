package java_Generic.com.generic_examples;

public class Generic_Multiple_Type_Parameters {

		 public static void main(String[] args) {
				
			 Test <String, Integer> obj = new Test<String, Integer>("GfG", 15); 
			            
			        obj.print(); 

			        Test.genericDisplay(11,12); 
			        
			        // Calling generic method with String argument 
			        Test.genericDisplay("GeeksForGeeks","helping"); 
			   
			        // Calling generic method with double argument 
			        Test.genericDisplay(1.0,2.2);       
			}

}

  class Test<T, U>{
	
	  	T obj1;  // An object of type T 
	    U obj2;  // An object of type U 
	  
	    // constructor 
	    Test(T obj1, U obj2) 
	    { 
	        this.obj1 = obj1; 
	        this.obj2 = obj2; 
	    } 
	  
	    // To print objects of T and U 
	    public void print() 
	    { 
	        System.out.println(obj1); 
	        System.out.println(obj2); 
	    }
	    

	    // A Generic method example 
	    static <T,U> void genericDisplay (T element,U elmt) 
	    { 
	        System.out.println(element.getClass().getName() +  " = " + element); 
	       // System.out.println(elmt.getClass().getName() +  " = " + elmt); 
	                          
	    } 
}

