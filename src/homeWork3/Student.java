package homeWork3;

public class Student extends User{
	private String studentNumber;
	private String school;
	
	public Student() {
		
	}
	
	public Student(int id, String userName, String password, String email, String firstName, String lastName,
			String studentNumber, String school) {
		super(id, userName, password, email, firstName, lastName);
		this.studentNumber = studentNumber;
		this.school = school;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
