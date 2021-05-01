package homeWork3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ahmet");
		student1.setLastName("kocak");
		student1.setStudentNumber("58879641");
		student1.setSchool("ODTU");
		student1.setEmail("ahmetkocak@gmail.com");
		student1.setUserName("ahmetkocak78");
		student1.setPassword("7825");

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Kayhan");
		student2.setLastName("Demir");
		student2.setStudentNumber("45678925");
		student2.setSchool("BOUN");
		student2.setEmail("kayhanx@gmail.com");
		student2.setUserName("kayhanx");
		student2.setPassword("1245");

		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setDepartment("Yazýlým");
		instructor1.setProfession("Java");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setUserName("Engin12");
		instructor1.setPassword("1233");

		Instructor instructor2 = new Instructor();
		instructor2.setId(4);
		instructor2.setFirstName("Osman");
		instructor2.setLastName("Sakýp");
		instructor2.setDepartment("Front-End");
		instructor2.setProfession("C#");
		instructor2.setEmail("osmansakýp@gmail.com");
		instructor2.setUserName("osmansakýp14");
		instructor2.setPassword("2568");

		User[] users = { instructor1, student1,student2,instructor2 };
		
		UserManager user = new UserManager();
		user.addMultiple(users);
		
		Instructor[] instructors = {instructor1,instructor2};
		InstructorManager instructor = new InstructorManager();
		System.out.println();
		instructor.addMultiple(instructors);
		
		Student[] students = {student1,student2};
		StudentManager student = new StudentManager();
		System.out.println();
		student.addMultiple(students);
 	}
	

}
