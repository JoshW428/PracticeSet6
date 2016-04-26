package base;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import domain.PersonDomainModel;

public class Person_Test {
	
	private static PersonDomainModel Josh;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Josh = new PersonDomainModel();
		Josh.setFirstName("Josh");
		Josh.setLastName("Weinick");
		Josh.setCity("Livingston");
		Josh.setPostalCode(12345);
		Josh.setStreet("12 Windwood");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//adding person
		PersonDomainModel y;
		y = PersonDAL.getPerson(Josh.getPersonID());
		PersonDAL.addPerson(y);
		
		//Update Person
		y.setLastName("NewLastName");
		PersonDAL.updatePerson(y);
		
		//Delete Person
		PersonDAL.deletePerson(y.getPersonID()); 
		}

}
