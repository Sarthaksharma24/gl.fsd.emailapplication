package gl.fsd.emailapplication.assignment;
import java.util.Scanner;

public class Employee {
	private String firstname;
	private String lastname;
	private String department;
	
	
	public Employee( String firstname , String lastname, String department ){
		this.firstname = firstname;
		this.lastname=lastname;
		this.department=department;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname){
		this.firstname = firstname;
	}
	public String getLastName(){
		return lastname;
	}
	public void setLastName(String lastname){
		this.lastname = lastname;
	}
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String department){
		this.department = department;
	}
public static void main(String[] args ) {
		
		Employee dhoni = new Employee("Mahendera" ,"Dhoni", "Technical");
		dhoni.setFirstName("Mahendera");
		dhoni.setLastName("Dhoni");
		dhoni.setDepartment("Technical");
		
		
		
		
	}
}



