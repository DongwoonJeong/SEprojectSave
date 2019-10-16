package ver2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	

	@Test
	public void Appointmenttest() {
	Appointment takeappointmentDate = new Appointment(null,null);	
	takeappointmentDate.setAppointmentDate("21 jan 1998");
	assertEquals("21 jan 1998",takeappointmentDate.getAppointmentDate());
	
		
	}
	@Test
public void testToString() {
		
		String Appointmentdate = "22 Feb 2019";
		Appointment p = new Appointment(null,null);
		p.setAppointmentDate(Appointmentdate);
		String.format("patient d: %-12s ", Appointmentdate);
		
		assertEquals(p.getAppointmentDate(),Appointmentdate.toString());
		

		
	}
	
	
	
}
