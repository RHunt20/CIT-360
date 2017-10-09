
package sample.practice;

public class Student implements jave.io.Serializable{

	private int ID;
	private String firstName;
	private String lastName;
	private String email;
	
	//Setters
	public void setID(int newID) { this.ID = newID; }
	public void setFirstName(String newFirstName) { this.firstName = newFirstName; }
	public void setLastName(String newLastName) { this.lastName = newLastName; }
	public void setEmail(String newEmail) { this.email = newEmail; }
	
	//Getters
	public int getID() { return ID; }
	public String() { return firstName; }
	public String() { return lastName; }
	public String() { return email; }
	
	//argument default constructor 
	public Student()
	{
	}

}