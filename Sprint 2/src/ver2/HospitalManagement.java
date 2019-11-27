package ver2;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

public class HospitalManagement {

	public static void main(String[] args) throws Exception{
		getPatientPrescriptions();
		//Scanner 
		/*Scanner input = new Scanner(System.in);
		
		//patients and appointments list
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		
		readData(patients,appointments);
		
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
*/
	}

	public static void getPatientPrescriptions() throws FileNotFoundException{
		String correct;
		do {
		File infile = new File ("appointmentFile.txt");
		Scanner scan = new Scanner(infile);

		while (scan.hasNext())
			System.out.println(scan.nextLine());
		System.out.println();
		System.out.println("Welcome Doctor To Prescription Column");
		System.out.println("Please enter the patient name from AppointmentFile for  getting their prescriptions?");
		Scanner input = new Scanner(System.in);
		String result = input.next();

		System.out.println("Choice - 1 : Patient has injury");
		System.out.println("Choice - 2 : Patient has illness");
		System.out.println("Choice - 3 : Or Other Reason");
		System.out.println("Any other Choice : patient prescription not found");
		System.out.println("Please enter the Patient problem from the above list so doctor can prescribe medication for that problem");
		
		 
		int options = input.nextInt();
		if (options ==1) {
			System.out.println("Which injury has the patient needs to be prescirbed for ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter reason for which  prescription is needed: ");
			String reason = sc.nextLine();
			System.out.println("Patient: " + result+ " Has following problem which needs prescibed: " + reason);
			String textToAppend = "Patient name: " + result + " The Reason: "+ reason;

			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("PatientPrescriptions.txt", true));
				writer.newLine();
				writer.write(textToAppend);
				writer.close();
			}
			catch (IOException e) {

			}
			if (options ==2) {
				System.out.println("which kind of illnes patient wants to get prescribed" ); 
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter reason which needs prescription for: ");
				String reason1 = sc1.nextLine();
				System.out.println("Patient: " + result + " Has following problem which needs prescibed: " + reason1);
				String textToAppend1 = "Patient name: " + result + " The Reason: "+ reason1;
				try{
					BufferedWriter writer = new BufferedWriter(new FileWriter("PatientPrescriptions.txt", true)); 
					writer.newLine();   //Add new line
					writer.write(textToAppend1);
					writer.close();
				} catch (IOException e){
				}
				if (options ==3) {
					System.out.println("Which other reason the pateint needs prescription for:  ");
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Enter reason which needs prescription for: ");
					String reason2 = sc1.nextLine();
					System.out.println("Patient: " + result + " Has following problem which needs prescibed: " + reason1);
					String textToAppend3 = "Patient name: " + result + " The Reason: "+ reason1;
					try{
						BufferedWriter writer = new BufferedWriter(new FileWriter("patientPrescriptions.txt", true)); 
						writer.newLine();   //Add new line
						writer.write(textToAppend);
						writer.close();
					} catch (IOException e){
					}

				}
			}


		}
		 System.out.println("Enter Yes if (correct) or NO(if its wrong)? ");
	     correct = input.next();
		}
		while (correct.equals("NO"));
	}

	/*public static void readData(ArrayList<Patient> patientsList,ArrayList<Appointment> appointmentsList) throws Exception{
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
	}*/
}
