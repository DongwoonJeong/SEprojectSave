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