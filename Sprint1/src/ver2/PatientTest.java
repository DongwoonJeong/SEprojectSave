package ver2;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import ver2.Appointment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PatientTest extends Person {
	String name1 ="John";
	int age1 =18;
	String gender1 ="Male";
	String appointmentDate1 ="20191010";
	String ssn1 ="000000000";
	String address1 ="1500 Patterson St";
	String dateOfBirth1 ="1980-01-01";

	Patient expected = new Patient(name1,age1,gender1,appointmentDate1,ssn1,address1,dateOfBirth1);
	
	@Test
	@DisplayName("Tests for Patient class")
	void testPatient() {
			//Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
			//assertSame(expected,actual);
	}

	@Test
	@DisplayName("Tests for Patient class")
	void testGetDateOfBirth() {
		//Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		//assertEquals(expected.getDateOfBirth(),actual.getDateOfBirth());
	}
	@Test
	@DisplayName("Tests for Patient class")
	void testGetSsn() {
		//Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		//assertEquals(expected.getSsn(),actual.getSsn());
	}

	@Test
	@DisplayName("Tests for Patient class")
	void testGetAddress() {
		//Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		//assertEquals(expected.getAddress(),actual.getAddress());
	}

	@Test
	@DisplayName("Tests for Patient class")
	void testGetAppointmentDate() {
		//Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		//assertEquals(expected.getAppointmentDate(),actual.getAppointmentDate());
	}

	@Test
	@DisplayName("Tests for Patient class")
	void testGetAppointment() {
		//Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		//assertEquals(expected.getAppointment(),actual.getAppointment());
	}

	@Test
	@DisplayName("Tests for Patient class")
	void testGetDoctor() { // To be implemented for later.
	//	Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		//assertEquals(expected.getDoctor(),actual.getDoctor());
	}// To be implemented for later.
	// To be implemented for later.
	// To be implemented for later.
	
	@Test
	@DisplayName("Tests for Patient class")
	 public void testgetDateOfBirth() {
		//Patient actual = new Patient("John doe",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		//assertEquals(expected.getDateOfBirth(), actual.getDateOfBirth());
		}
	@Test
	void testSetAppointment() {
		
	}

	@Test
	@DisplayName("Tests for Patient class")
	void testToString() {
		Patient actual = new Patient("John",18,"Male","20191010","000000000","1500 Patterson St","1980-01-01");
		String.format("patient name: %-12s /Age: %-5s/ Gender: %-4s/ Appointment Date: %-12s/ SSN: %-14s/ Address: %-24s/ Date Of Birth: %-24s"  
				,actual.getName(), actual.getAge() , actual.getGender() ,actual.getAppointmentDate(), actual.getSsn() , actual.getAddress(), actual.getDateOfBirth());
		assertEquals(expected.toString(),actual.toString());
	}

}
