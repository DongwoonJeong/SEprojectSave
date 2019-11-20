package ver2;

import java.io.BufferedWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends Person{

	// instance variables 
	private int dateOfBirth;
	private String ssn;
	private String address;
	private String appointmentDate;
	private ArrayList<Appointment> appointment;
	private ArrayList<Doctor> doctor;
	private String DateOfBirth;

	// constructors
	public Patient(String name,int age, String gender,String appointmentDate,String ssn,String address , String DateOfBirth) {
		super.setName(name);
		super.setAge(age);
		super.setGender(gender);
		this.appointmentDate = appointmentDate;
		this.ssn = ssn;
		this.address = address;
		this.DateOfBirth = DateOfBirth;

	}

	public Patient(String name, String ssn, String appointmentDate) {
		super.setName(name);
		this.ssn = ssn;
		this.appointmentDate = appointmentDate;
	}

	public static void main(String[] args) throws Exception{
		getPatientPrescriptions();
	}


	public String getSsn() {
		return ssn;
	}

	public String getAddress() {
		return address; 
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	//@ManyToMany(mappedBy = "Patient")
	public ArrayList<Appointment> getAppointment(){
		return this.appointment;
	}

	//@ManyToMany(mappedBy = "Patient")
	public ArrayList<Doctor> getDoctor(){
		return this.doctor;
	}

	public void setAppointment(ArrayList<Appointment> appointment) {
		this.appointment = appointment;
	}
	public void setDateOfBirth(String DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}



	public static void getPatientPrescriptions() throws FileNotFoundException{

		File infile = new File ("appointmentFile.txt");
		Scanner scan = new Scanner(infile);

		while (scan.hasNext())
			System.out.println(scan.nextLine());
		System.out.println();
		System.out.println("Please enter the patient name from AppointmentFile for  getting their prescriptions");
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

	}



/* 
	 private Receptionist receptionist;
	 private Doctor doctor;
	 private Nurse nurse;
	  private Appointment appointment;




	 OneToOne(mappedBy = "receptionist")
	 public Receptionist getReceptionist() {
		 return receptionist;
	 }
	 @OneToOne(mappedBy = "patient")
	 public Doctor getDoctor() {
		 return doctor;
	 }
	 @OneToOne(mappedBy = "nurse")
	 public Nurse getNurse() {
		 return nurse;
	 }
 */
public String toString() {
	return String.format("%-16s /%-5s/%-7s/%-18s/%-18s/%-24s/%-16s"  
			,getName(), getAge() , getGender() ,getAppointmentDate(), getSsn() , getAddress(), getDateOfBirth());
}


}