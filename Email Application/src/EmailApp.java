/*
 * David Toribio 
 * 4/17/2022
 * Description: This program will create an email for a new worker based on the department
 * new worker is assigned to work in.
 */
public class EmailApp {

	public static void main(String[] args) {
		Email email = new Email("John", "Smith");
		System.out.println(email.showInfo());
	

	}

}
