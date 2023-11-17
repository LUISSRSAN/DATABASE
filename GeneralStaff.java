package Project1;

public class GeneralStaff extends Employee{
private String duty;

public GeneralStaff(){
	duty = "";
}

public GeneralStaff(String duty){
	this.duty = duty;
}

public GeneralStaff(String deptName,String duty){
	super(deptName);
	this.duty = duty;
	
}
 public GeneralStaff(String name,int birthYear,String deptName,String duty){
	super(name,birthYear,deptName);
	this.duty = duty;
}

public String getDuty() {
	return this.duty;
	
}
@Override
public boolean equals(Object obj) {
	if (!(obj instanceof GeneralStaff)) {
		
		return false;
	}
	GeneralStaff other = (GeneralStaff) obj;
	if (this.duty == other.duty) {
		return true ;
	}
			 return false;
			 
}

@Override
public String toString() {
	return String.format("<content of Employee>GeneralStaff:Duty:%10s", this.duty);
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
