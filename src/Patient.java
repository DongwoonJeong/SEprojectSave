import java.util.Set;

public class Patient {
	
	 public String patient;
	 
	 private Receptionist receptionist;
	 
	 private Doctor doctor;
	 
	 private Nurse nurse;
	 
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
	

}
