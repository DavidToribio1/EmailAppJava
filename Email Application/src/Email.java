import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix = "vanguardians.com";
	private int mailboxCapacity = 500;
	private int defaultPass = 12;
	
	
	
	//Constructor for first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPass);
		System.out.println("your passoword is: " + this.password);
		// generate email
		this.email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
		
	}
	
	
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
		
	}
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	
	
	
	private String setDepartment() {
		
		System.out.println("New worker: " + this.firstName + "." + "\nDepartment Codes: \n1 for Sales \n2 for Development\n3 for Accounting\n0 for none\n Enter department code:");
		
		Scanner input = new Scanner(System.in);
		
		int depChoice = input.nextInt();
		
		if(depChoice == 1) {
			return "Sales";
		} 
		else if(depChoice == 2) {
			return "Dev";
		}
		else if (depChoice ==3) {
			return "Acct";
		}
		else {
			return "";
		}
	}

	
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%"; 
		char[] password = new char[length];
		
		for(int i=0; i< length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	
}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

}
}