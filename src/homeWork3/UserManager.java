package homeWork3;

public class UserManager {

	public void addMultiple(User[] users) {
		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi");
		}
	}

}
