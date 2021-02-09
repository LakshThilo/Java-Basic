package java_lambda;

public class Person {
	
	private String firstname;
	private Gender gender;
	private int age;
	
	public Person(String name,int age,Gender gender) {
		
		this.firstname = name;
		this.gender = gender;
		this.age= age;
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person {"+"name: "+firstname +", gender: "+gender+", age: "+age+"}";
	}
	
	
	
}
