package tesing_Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestAll {


	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("David");
		list.add("Dan");
		list.add("Chay");
		list.add("Hamza");
		
		
		System.out.println("\n"+list);
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i));
		}
		
	System.out.println("\n");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		
		ListIterator<String> litr = list.listIterator(list.size());
		
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
		System.out.println("\n");
		for(String st : list){
			System.out.println(st);
		}
		
		System.out.println("\nLambda expression");
		list.forEach(a->{
			
			System.out.println(a);
		});
	}
}
