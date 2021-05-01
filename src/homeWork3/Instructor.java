package homeWork3;

public class Instructor extends User{
	private String profession;
	private String department;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String userName, String password, String email, String firstName, String lastName,
			String profession, String department) {
		super(id, userName, password, email, firstName, lastName);
		this.profession = profession;
		this.department = department;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	

}
