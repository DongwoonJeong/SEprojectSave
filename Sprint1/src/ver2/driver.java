package ver2;
import java.util.Set;
import java.util.*;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Patient patient1 = new Patient("Hoyong","middleName","Lee",940709,1105535413,"Male","1505 Lankford Dr",
				5765,927);
		patient1.bookAppointments();
		System.out.println(patient1.getFirstName());
		*/
		Patient kevin = new Patient("kevin");
		Receptionist r1 = new Receptionist("r1");
		
		Set<Appointment> appointments = new HashSet<Appointment>();
		Appointment ap1 = new Appointment(11072019);
		Appointment ap2 = new Appointment(11212019);
		
		ap1.setPatient(kevin);
		ap2.setPatient(kevin);
		appointments.add(ap2);
		appointments.add(ap1);
		
		Set<Patient> patients = new HashSet<Patient>();
		patients.add(kevin);
		
		r1.setPatients(patients);
		
		kevin.setAppointment(appointments);
		System.out.println(kevin.getAppointment());
		System.out.println(r1.getPatients());
		
	}

}
