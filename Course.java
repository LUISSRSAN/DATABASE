

/*
 * Name: Luis Santiago
 * Date Created: July 25,2023
 * Date Modified: July 26,2023
 * Description: Course class
 */


package Project1;



public class Course implements Comparable<Course>{
private boolean isGraduateCourse ;
private int courseNum ;
private String courseDept;
private int numCredits ;

	public Course (boolean isGraduateCourse,int courseNum,String courseDept,int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum =courseNum;
		this.courseDept =courseDept;
		this.numCredits = numCredits;
	}
	
	public boolean isGraduateCourse(boolean isGraduateCourse) {
		
		if (this.isGraduateCourse == false) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public int getCourseNum() {
		return this.courseNum;
	}
	
	public String getCourseDept() {
		return this.courseDept;
	}
	
	
	public int getNumCredits() {
		return this.numCredits;
	}
	public String getCourseName() {
		String courseName;
		if (isGraduateCourse ==true) {
			courseName = "G" + courseDept + courseNum;
		}
		else {
			courseName = "U" + courseDept + courseNum;
		}
		
		return   courseName;
	}
	
	@Override
	public boolean equals (Object obj) {
	if (!(obj instanceof Course)) {
			
			return false;
		}
		Course other = (Course) obj;
		if (this.isGraduateCourse == other.isGraduateCourse && 
			this.courseNum == other.courseNum && 
			this.courseDept == other.courseDept && 
			this.numCredits == other.numCredits) {
		return true ;
		}
		return false;
	}
	@Override
	
	public String toString() {
		return String.format("Course: %3s-%3d| Number of Credits: %02d|Graduate/Undergraduate",this.courseDept,this.courseNum,this.numCredits,this.isGraduateCourse);
	}
	
	/// Need to programming Compare to 
	
	@Override
	public int compareTo(Course course) {
		if (this.courseNum < course.courseNum) {
			return -1 ;
		}
		else if (this.courseNum > course.courseNum) {
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
