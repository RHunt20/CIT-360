
package sample.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactoru;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentInClass {

	//Create config object
	public static void main(String[] args) {
	
	//pulls in configuration information
	configuration config = new Configuration();
	
	//creates sessionfactory object from config object
	config.configure("Hibernat.cfg.xml");
	
	//Opens a new Hibernate session
	SessionFactoru factory = config.buildSissionFactory();
	
	//creates transaction within the session 
	Session session = factory.openSession();
	
	//Creates transaction within session
	Transaction tran = session.beginTransaction();
	
	//Create a new student object to ass to the database
	Student student1 = Student();
	
	//Set Student Information
	student1.setFistName("Ryan");
	student1.setLastName("Hunter");
	student1.setEmail("ryah.hunter@gmail.com");
	
	//Saves the transaction
	session.persist(student1);
	
	//Displays a statement that the information was persisted
	System.out.println(Student persisted");
	
	//Commits
	tran.commit();
	
	//Closes session
	session.close();
	
	}
}