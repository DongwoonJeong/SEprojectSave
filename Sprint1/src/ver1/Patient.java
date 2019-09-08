package ver1;
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

	public static void bookAppointments() {
	public void bookAppointments() {
	}

	public static void cancelorChangeAppointments() {
	public void cancelorChangeAppointments() {
	}

	public static void patientInformation() {
	public void patientInformation() {
	}
	public static void payTheMedicalBill() {
	public void payTheMedicalBill() {
	}

	public static void getPrescriptions() {
	public void getPrescriptions() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}