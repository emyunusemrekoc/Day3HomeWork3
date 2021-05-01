package homeWork3;

public class InstructorManager extends UserManager {
	
		public void addMultiple(Instructor[] users) {
			for(Instructor user:users) {
				System.out.println(user.getProfession()+ " "+ user.getDepartment() +" eklendi");
			
			}
	}
}