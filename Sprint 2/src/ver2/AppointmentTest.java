package ver2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	

	@Test
	public void Appointmenttest() {
	Appointment actual = new Appointment(null,null);	
	actual.setAppointmentDate("21 jan 1998");
	assertEquals("21 jan 1998",actual.getAppointmentDate());
	
		
	}
	@Test
public void testToString() {
		
		String expected = "22 Feb 2019";
		Appointment actual = new Appointment(null,null);
		actual.setAppointmentDate(expected);
		String.format("patient d: %-12s ", expected);
		
		assertEquals(actual.getAppointmentDate(),expected.toString());
		

		
	}
}
	
	

