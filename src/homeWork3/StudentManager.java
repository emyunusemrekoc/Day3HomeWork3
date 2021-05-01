package homeWork3;

public class StudentManager extends UserManager {

	public void addMultiple(Student[] users) {
		for (Student user : users) {
			System.out.println(user.getSchool() + " " + user.getStudentNumber() + " eklendi");

		}

	}
}