package gl.fsd.emailappservices;

import java.util.Random;

import gl.fsd.emailapplication.assignment.Employee;



public class CredentialsGenerator {
	private Employee employee;
	private String generateEmailId;
	private char[] generatePassword = new char[8];
	
	
	public  CredentialsGenerator(Employee employee) {
		this.employee = employee;
	}
	public void generateEmailId() {
	String departmentShortName = getDepartmentShortName();	
	
	String emailID = employee.getFirstName()  .toLowerCase()
		+ "." + employee.getLastName().toLowerCase()
		+ "@" + departmentShortName + ".gl.com";				
	

	this.generateEmailId = emailID;
}

private String getDepartmentShortName() {
	
	String departmentName = employee.getDepartment();
	
	if (departmentName.equals("Technical")) {
		return "tech";
	}else if (departmentName.equals("Admin")) {
		return "adm";
	}else if (departmentName.equals("Human Resource")) {
		return "hr";
	}else if (departmentName.equals("Legal")) {
		return "lgl";
	}
	return "";
}

public void generatePassword() {
	
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-/.?<>)";

	String allValues = capitalLetters + smallLetters 
			+ numbers + specialCharacters;
	
	Random randomObj = new Random();			


	
	for (int i=0; i < 8; i++) {

		int boundValue = allValues.length();
		int randomIndex = randomObj.nextInt(boundValue);		
		char randomChar = allValues.charAt(randomIndex);			
		this.generatePassword[i] = randomChar;
	}	
}


public void showCredentials(char[] generatePassword) {

	System.out.print("Dear " + employee.getFirstName() + ", ");
	System.out.println("Your generated credentials are as follows");
	System.out.println("Email ID: " + generateEmailId);
	System.out.print("Password: ");
	System.out.println(generatePassword);
}

}
	


