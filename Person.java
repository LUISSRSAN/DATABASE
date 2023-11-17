
/*
 * Name: Luis Santiago
 * Date Created: July 25,2023
 * Description: Person class
 * 
 */



package Project1;

public class Person implements Comparable<Person>{
	
	private String name;
	private int birthYear;
	
	public Person(){
		name="";
		birthYear = 0;
	}
	
	public Person (String name,int birthYear){
		this.name = name;
		this.birthYear = birthYear;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public int  getBirthYear() {
		return this.birthYear;
	}
	
	public void setName (String name) {
		 this.name = name;
		
	}
	
	public void setBirthYear(int birthYear) {
		
			this.birthYear = birthYear;
	}
	
	
	// EQUALS METHOD INCOMPLETE 
public boolean equals(Object obj) {
	if (!(obj instanceof Person)) {
		
		return false;
	}
	Person other = (Person) obj;
	if (this.name == other.name && 
		this.birthYear == other.birthYear ) {
	return true ;
	}
	return false;
}


	public String toString() {
		
		return String.format("Person:Name %30s|Birth Year: %4d", this.name,this.birthYear);
		
	}
	
	
	@Override 
	public int compareTo(Person person) {
		
		if (this.birthYear < person.birthYear) {
			return -1 ;
		}
		else if (this.birthYear > person.birthYear) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

}
