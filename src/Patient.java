//package prob1;
import java.util.Scanner;
import java.util.Set;

public class Patient {

	 // instance variables 
	
	 private String firstName;
	 private String middleName;
	 private String lastName;
	 private int dateOfBirth;
	 private int ssn;
	 private String sex;
	 private String address;
	 private int patientId;
	 private int appointmentDate;
	 private int numOfAppointments;
	 private List <Appointments> appointments;
	 
	 
	
	  // constructors
	 public Patient(String firstName, String middleName, String lastName, int dateOfBirth, int ssn, String sex, String address, int patientId, int appointmentDate){
		 this.firstName= firstName;
		 this.middleName = middleName;
		 this.lastName= lastName;
		 this.dateOfBirth= dateOfBirth;
		 this.ssn= ssn;
		 this.sex =sex;
		 this.address= address;
		 this.patientId=patientId;
		 this.appointmentDate= appointmentDate;

	 }
	 
	 Public String getFirstName() {
		 return firstName;
		 
	 }
	 
	 Public String getMiddleName() {
		 return middleName;
		 
	 }
	 
	 Public String getLastName() {
		 return lastName;
		 
	 }
	 
	 Public LocalDate getDateOfBirth() {
		 return dateOfBirth;
		 
	 }
	 Patient(String ssn) {
		 this.ssn = ssn;
	 }
	 
	 public String getSsn() {
		 return ssn;
		 
	 }
	 
	 public String getPatientGender() {
		 return sex;
	 }
	 public String getPatientAddress() {
		 return address; 
		 
	 }
	 
	 public int getPatientId() {
		 return patientId;
	 }
	 
	 public int getPatntApptDate() {
		 return appointmentDate;
	 }
	 
	 public int getNumOfAppoints() {
		 return appointments.size();
	 }
	 
	 public void addAppointments(appointments s) {
		 appointments.add(s);
	 }
	 
	 public boolean equals(object o) {
		 Patient i = (Patient)o;
		 return this.ssn.equals(i.ssn);
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
     
	public void bookAppointments() {
		System.out.println("enter appointment date :");
		Scanner input= new Scanner(System.in);
		this.appointmentDate = input.nextInt();
	}


	public void cancelorChangeAppointments() {
	}


	public void patientInformation() {
	}
	
	public void payTheMedicalBill() {
	}


	public void getPrescriptions() {
	}

	public String toString() {
		return firstName+" "+lastName;
	}
}