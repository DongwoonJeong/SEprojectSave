
import java.util.Set;
import java.io.FileNotFoundException;
import java.util.*;

public class driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		Patient patient1 = new Patient("Hoyong","middleName","Lee",940709,1105535413,"Male","1505 Lankford Dr",
				5765,927);
		patient1.bookAppointments();
		System.out.println(patient1.getFirstName());
		*/
		Receptionist  r2 = new Receptionist("Hello");
		r2.bookAppointments();
		r2.patientInformation();
		
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

package ver2;
import java.util.Set;
import java.util.*;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) {

		
		Patient patient1 = new Patient("Hoyong","middleName","Lee",940709,1105535413,"Male","1505 Lankford Dr",
				5765,927);
		patient1.bookAppointments();
		System.out.println(patient1.getFirstName());
		
		Patient kevin = new Patient("kevin");
		Receptionist r1 = new Receptionist("r1");
		
		
		

		// TODO Auto-generated method stub
		//Scanner 
		Scanner input = new Scanner(System.in);
		
		//our data
		Set<Patient> patients = new HashSet<Patient>();

		Set<Appointment> appointments = new HashSet<Appointment>();
		
		//what do you want to do?
		while (true) {
		System.out.println("What do you want to do: \n"
				+ "1. make a new appointment\n"
				+ "2. cancel an anppointment\n"
				+ "3. extit \n");
		
		int action = input.nextInt();
		
		//make a new appointment
		if (action == 1 )
			makeAppointment(patients,appointments);
		
		//cancel an appointment (will work later)
		//if (action == 2)
		
		//break
		if (action == 3 )
			break;
		}
		
		
		System.out.println("patients list: ");
		System.out.println(patients);
		
	}
	
	public static void makeAppointment(Set<Patient> patients, Set<Appointment> appointments) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a patient name: ");
		String name = input.next();
		
		System.out.println("Enter a patient age: ");
		Integer age = input.nextInt();
		
		System.out.println("Enter a patient gender: ");
		String gender = input.next();
		
		System.out.println("Enter a appointment date: ");
		String appointmentDate = input.next();
		
		System.out.println("Enter a patient ssn: ");
		String ssn = input.next();
		
		System.out.println("Enter a patient address: ");
		String address = input.next();
		
		//let's guess the patient has no previous record
		//make a new patient with information given
		Patient newPatient = new Patient(name, age, gender, appointmentDate,ssn,address);
		//make a new appointment with information given
		Appointment newAppointment = new Appointment(newPatient, appointmentDate);
		//make a new set of appointment for the patient (it is his first appointment)
		Set<Appointment> Set_newAppointments = new HashSet<Appointment>();
		//add the first appointment to the set.
		Set_newAppointments.add(newAppointment);
		
		/* when the patient has previous record(deal it later)
		//get previous appointment that a patient had
		Set<Appointment> PreviousAppointments = new HashSet<Appointment>();
		PreviousAppointments = newPatient.getAppointment();
		PreviousAppointments.add(newAppointment);
		newPatient.setAppointment(PreviousAppointments);
		*/
		
		//add new patient and new appointment to the data.
		patients.add(newPatient);
		appointments.add(newAppointment);
	}

}

