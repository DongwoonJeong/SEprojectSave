package ver2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoctorTest {

	@Test
	void Notestest() {
		Doctor takeNotes = new Doctor(null);
		takeNotes.setNotes("hey this is the string i added");
		assertEquals("hey this is the string i added",takeNotes.getNotes());
		
		
	}

}