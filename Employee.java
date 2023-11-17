
/*
 * Name: Luis Santiago
 * Date Created: July 25,2023
 * Description: Employee class
 */

package Project1;
//INCOMPLETE CLASS 
public class Employee extends Person {
	
	private String deptName;
	private static int numEmployees;
	private int employeeID ;
	
	// COMPUTE EMPLOYEE ID 
	public Employee(){
		deptName = "";
		
	}
	//COMPUTE employeeid 
	public Employee(String deptName) {
		this.deptName = deptName;
		
	}

	public Employee(String name,int birthYear,String deptName) {
		super(name,birthYear);
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		
		return this.deptName;
	}
	
	public static int getNumEmployees() {
		return Employee.numEmployees;
	}
	
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public boolean equals (Object obj) {
	if (!(obj instanceof Employee)) {
			
			return false;
		}
		Employee other = (Employee) obj;
		if (this.deptName == other.deptName && 
			this.numEmployees == other.numEmployees && 
			this.employeeID == other.employeeID  
			) {
		return true ;
		}
		return false;
	}
	
	
	
	@Override 
	public String toString() {
		return String.format("<content of Person>Employee: Department: %20s| Employee Number:%3d", this.deptName,this.employeeID);
	}
	
	@Override
	public int compareTo(Person person){
		
		
		if (this.employeeID < person.employeeID) {
			return -1 ;
		}
		else if (this.employeeID > person.employeeID) {
			return 1;
		}
		else {
			return 0;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
