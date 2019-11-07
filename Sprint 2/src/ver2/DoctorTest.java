package ver2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoctorTest {

	@Test
	void testNote() {
		Doctor actual = new Doctor(null);
		actual.setNotes("hey this is the string i added");
		assertEquals("hey this is the string i added",actual.getNotes());
		
		
	}

}
