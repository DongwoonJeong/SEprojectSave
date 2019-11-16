package ver2;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

public class HospitalManagement {

	public static void main(String[] args) throws Exception{
		
		//Scanner 
		Scanner input = new Scanner(System.in);
		
		//patients and appointments list
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		
		readData(patients,appointments);
		readData(patients,appointments);
		while (true) {
		System.out.println("welcome to South Gerogia Hospital management systems:   \n"
		                   +  "Please select choices from the above options:  \n"
				           +   "press 1 for Doctor:   \n "
		                   +   "press 2 for Receptionist:  \n"
				           +   "press 3 for Patient:    \n"
		                   +   "Press 4 for nurse:     \n"
				           +   "press 5 to Exit  \n"
				);
		System.out.println(); 
		System.out.println("Please enter your choice : ");
		int choice =  input.nextInt();
		switch(choice) {
	     
		case 1: System.out.println(" Welcome to Doctor section");
		
		break;
		
		case 2: System.out.println("welcome to  Receptionist section: ");
		
		break;
		
       case 3: System.out.println(" Welcome to Patient section ");
       
		
		break;
        
       case 4: System.out.println(" Welcome to Nurse section ");
		
		break;
        
		default: System.out.println("Incorrect choice !!! Try again");
		
		}
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
			makeAppointment(patients, appointments);
		
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
		
		System.out.println("completed succesfully");

	}

	
	public static void readData(ArrayList<Patient> patientsList,ArrayList<Appointment> appointmentsList) throws Exception{
		try {
			File file = new File("patientFile.txt");
			Scanner input = new Scanner(file);
		
			if(file.exists()) {
			
				input.nextLine();
				while (input.hasNextLine()) {
					String line = input.nextLine();
					String[] token = line.split("/");
					String name = token[0].trim();
					int age = Integer.parseInt(token[1].trim());
					String gender = token[2].trim();
					String appointmentDate = token[2].trim();
					String ssn = token[3].trim();
					String address = token[4].trim();
					String dateOfBirth = token[5].trim();
					
					Patient patient = new Patient(name,age,gender,appointmentDate,ssn,address,dateOfBirth);
					patientsList.add(patient);
				}
			}
		}
		catch(IOException e) {
		}
		
		try {
			File file = new File("appointmentFile.txt");
			Scanner input = new Scanner(file);
		
			if(file.exists()) {
			
				input.nextLine();
				while (input.hasNextLine()) {
					String line = input.nextLine();
					String[] token = line.split("/");
					String name = token[0].trim();
					String ssn = token[1].trim();
					String appointmentDate = token[2].trim();
					
					Patient patient = new Patient(name,ssn,appointmentDate);
					
					Appointment appointment = new Appointment(patient,appointmentDate);
					appointmentsList.add(appointment);
				}
			}
		}
		catch(IOException e) {
		}
	}
	
	public static void makeAppointment(ArrayList<Patient> patientList, ArrayList<Appointment> appointmentList) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a patient name: ");
		String name = input.nextLine();
		
		System.out.println("Enter a patient age: ");
		Integer age = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter a patient gender (M/W): ");
		String gender = input.nextLine();
		
		System.out.println("Enter a appointment date (MM-DD-YYYY): ");
		String appointmentDate = input.nextLine();
		
		System.out.println("Enter a patient ssn: ");
		String ssn = input.nextLine();
		
		System.out.println("Enter a patient address: ");
		String address = input.nextLine();
		
		System.out.println("Enter Date of Bitrh: ");
		String dateOfbirth = input.nextLine();
		
		System.out.println("New Appointment made\n\n");
		
		Patient newPatient = new Patient(name, age, gender, appointmentDate,ssn,address,dateOfbirth);
		Appointment newAppointment = new Appointment(newPatient, appointmentDate);
		
		patientList.add(newPatient);
		appointmentList.add(newAppointment);//
		
		try(FileWriter fw = new FileWriter("patientFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
				out.printf("patient name     /age  /gender /appointmentDate   /ssn               /address                 /date of birth   \n");
			
			for (int i=0; i< patientList.size(); i++) {
				out.println(patientList.get(i));
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
		
		try(FileWriter fw = new FileWriter("appointmentFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
				out.printf("patient name        /patient ssn         /appointment date    \n");
			
			for (int i=0; i< appointmentList.size(); i++) {
				out.println(appointmentList.get(i));
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
		
	}
	
	public static void cancelAppointment(ArrayList<Appointment> appointmentsList){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter patient's ssn: ");
		String ssn = input.nextLine();
		
		for(int i = 0; i < appointmentsList.size(); i++) {
			if (appointmentsList.get(i).getPatient().getSsn().equals(ssn))
				appointmentsList.remove(i);
		}
		
		try(FileWriter fw = new FileWriter("appointmentFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
				out.printf("patient name        /patient ssn         /appointment date    \n");
			
			for (int i=0; i< appointmentsList.size(); i++) {
				out.println(appointmentsList.get(i));
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
	}
	
	public static void changeAppointmentDate(ArrayList<Appointment> appointmentsList) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter patient's ssn: ");
		String ssn = input.nextLine();
		
		System.out.println("Enter new Date: ");
		String newDate = input.nextLine();
		
		for(int i = 0; i < appointmentsList.size(); i++) {
			if (appointmentsList.get(i).getPatient().getSsn().equals(ssn))
				appointmentsList.get(i).setAppointmentDate(newDate);
		}
		
		try(FileWriter fw = new FileWriter("appointmentFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
				out.printf("patient name        /patient ssn         /appointment date    \n");
			
			for (int i=0; i< appointmentsList.size(); i++) {
				out.println(appointmentsList.get(i));
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
	}
}
