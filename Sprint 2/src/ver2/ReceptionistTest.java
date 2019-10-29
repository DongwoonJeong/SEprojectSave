package ver2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReceptionistTest {

	

	//@Test
	// public void toStringReceptionist() {
	//	String toString = .toString();
//	}
	
	@Test
	@DisplayName("Receptionist get patients name")
	void testRedMartian_toString() {
		Receptionist name = new Receptionist("");
		assertTrue(name.toString().contains(String.valueOf(name.getName())));
	}

	
		
	

}
