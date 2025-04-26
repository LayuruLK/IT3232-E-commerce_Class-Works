package lk.ac.vau.fas.ict.first.Model;

public class Course {
	private String courseID;
	private String courseName;
	private String lecName;
	private  int duration;
	
	public Course(String courseID, String courseName, String lecName, int duration) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.lecName = lecName;
		this.duration = duration;
	}
	
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getLecName() {
		return lecName;
	}
	public void setLecName(String lecName) {
		this.lecName = lecName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}

