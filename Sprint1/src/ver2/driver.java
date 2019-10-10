package ver2;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner 
		Scanner input = new Scanner(System.in);
		
		//our data
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		
		//File file = new File ("tcpprobe.dat");
		
		//what do you want to do?
		while (true) {
		System.out.println("What do you want to do: \n"
				+ "1. make a new appointment\n"
				+ "2. cancel an anppointment\n"
				+ "3. change appointment date\n"
				+ "4. extit \n");
		
		int action = input.nextInt();
		
		//make a new appointment
		if (action == 1 )
			makeAppointment(patients,appointments);
		
		//cancel an appointment (will work later)
		if (action == 2)
			cancelAppointment(appointments);
		
		//change appointment date
		if (action == 3)
			changeAppointmentDate(appointments);
		
		//break
		if (action == 4 )
			break;
		}
		
		System.out.println("patients list: ");
		System.out.println(patients);
		System.out.println("Appointment list: ");
		System.out.println(appointments);
		
	}
	
	public static void makeAppointment(ArrayList<Patient> patients, ArrayList<Appointment> appointments) {
		
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
		ArrayList<Appointment> Set_newAppointments = new ArrayList<Appointment>();
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
	public static void cancelAppointment(ArrayList<Appointment> appointments) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ssn: ");
		String ssn = input.next();
		
		boolean find=false;
		for(int i = 0; i< appointments.size(); i++) {
			if (appointments.get(i).getPatient().getSsn().equals(ssn)) {
				appointments.remove(i);
				find = true;
			}
		}
		if (find == false)
			System.out.println("no such appointment");
		
	}
	public static void changeAppointmentDate(ArrayList<Appointment> appointments) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ssn: ");
		String ssn = input.next();
		
		boolean find=false;
		for(int i = 0; i< appointments.size(); i++) {
			if (appointments.get(i).getPatient().getSsn().equals(ssn)) {
				System.out.println("Enter the new date: ");
				String appointmentDate = input.next();
				appointments.get(i).setAppointmentDate(appointmentDate);
				find = true;
			}
		}
		if (find == false)
			System.out.println("no such appointment");
		
	}

}
