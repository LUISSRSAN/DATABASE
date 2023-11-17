package Project1;

public class Faculty extends Employee{
	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		this.coursesTaught = new Course[100];
		this.numCoursesTaught=0;
		this.isTenured = false;
	}
	
	public Faculty (boolean isTenured) {
		this();
		this.isTenured= isTenured;
	}
	
	public Faculty (String deptName,boolean isTenured) {
		
		
		super (deptName);
		this.isTenured = isTenured;
	}
	
	public Faculty (String name , int birthYear,String deptName,boolean isTenured) {
		super(name,birthYear,deptName);
		this.isTenured = isTenured;
	}
	
	public boolean isTenured() {
		return isTenured;
	}
	
public int  getNumCoursesTaught() {
	return this.numCoursesTaught;
}
	
public void setIsTenured(boolean isTenured) {
	this.isTenured = isTenured;
}
	
public void addCoursesTaught(Course course) {
	this.coursesTaught[this.numCoursesTaught]=course;
	this.numCoursesTaught ++;
}

public void addCoursesTaught(Course [] courseList) {
	for (int i =0;i<courseList.length;i++) {
		addCoursesTaught(courseList[i]);
		
	}
}
	
public Course getCoursesTaught(int index) {
	if (index <0 || index >numCoursesTaught) {
		return null;
	}
	
	return this.coursesTaught[index];

}


public String getCourseTaughtAsString(int index) {
	String list = "";
	if (index <0 || index >numCoursesTaught) {
		return ""; 
	}
	if ( index >0) {
		list = coursesTaught[index] + " ";
	}
	
	return list;
}

public String getAllCoursesTaughtAsString() {
	String list = "";
	for (int i =0;i<numCoursesTaught;i++) {
		list = coursesTaught[i]+ " ";
	}
	return list;
}

@Override 
public boolean equals (Object obj) {
	if (!(obj instanceof Faculty)) {
		
		return false;
	}
	Faculty other = (Faculty) obj;
	if (this.coursesTaught == other.coursesTaught&& 
		this.numCoursesTaught == other.numCoursesTaught &&
		this.isTenured == other.isTenured) {
	return true ;
	}
	return false;
}




public String toString() {
	
	return String.format("<content of Employee> Faculty %11s|Number of Coures:%3d|CouresTaught:%s",this.isTenured,this.numCoursesTaught,getAllCoursesTaughtAsString());
	
}



public int compareTo(Person p) {
	if (this.numCoursesTaught < p.numCoursesTaught) {
		return -1 ;
	}
	else if (this.numCoursesTaught > p.numCoursesTaught) {
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
