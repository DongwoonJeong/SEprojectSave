package prob1;
import java.util.Set;

public class Patient {

	 
	 public String id;
	 public String firstName;
	 public String lastName;
	 public String patientId;
	 
	 public Patient(String id, String firstname, String lastName, String patientId) {
		 this.id = id;
		 this.firstName=firstname;
		 this.lastName= lastName;
		 this.patientId=patientId;
		 
	 }
	 
	 
	 

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

     public Appointment getAppointment() {
    	 return appointment;
     }
	public void bookAppointments() {
	}


	public void cancelorChangeAppointments() {
	}


	public void patientInformation() {
	}
	
	public void payTheMedicalBill() {
	}


	public void getPrescriptions() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}