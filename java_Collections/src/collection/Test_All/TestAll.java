package collection.Test_All;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestAll {

	public static void main(String[] args) {
		
		Student s1 = new Student("zxy","Lakshitha");
		Student s2 = new Student("abc","Kanyaru");
		Student s3 = new Student("qwr","Michella");
		Student s4 = new Student("ztg","Jhon");
		
		AllStudents als = new AllStudents();
		als.addStudents(s4);
		als.addStudents(s2);
		als.addStudents(s3);
		als.addStudents(s1);
		
		als.printMap();
		
	}

}

class AllStudents{
	
	private TreeMap<String, Student> students;
	
	public AllStudents(){
		
		students = new TreeMap<>();
	}
	
	public void addStudents(Student s){
		
		students.put(s.getId(),s);
	}
	public void printMap(){
		
		  Set set = students.entrySet();
		  
		    // Get an iterator
		    Iterator it = set.iterator();
		 
		    // Display elements
		    while(it.hasNext()) {
		      Map.Entry me = (Map.Entry)it.next();
		      System.out.print("Key is: "+me.getKey() + " & ");
		      Student s = (Student)me.getValue();
		      System.out.println("Value is: "+s.getName());
		    } 
		
		
	}
}

class Student{
	
	private String name;
	private String id;
	
	public Student(String id,String name){
		
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
