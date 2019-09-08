package ver1;
import java.util.Set;

public class Nurse {

	private Set<Patient> patients;

	private Set<Doctor> doctors;

	@OneToMany(mappedBy = "nurse")
	public Set<Patient> getPatient(){
		return this.patients;
	}

	@OneToMany(mappedBy = "nurse")
	public Set<Doctor> getDoctors(){
		return this.doctors;
	}

	public static void monitorThePatients() {
	public void monitorThePatients() {

	}

	public static void getPatientMedicalHistory() {
	public void getPatientMedicalHistory() {

	}

	public static void writeNotesAsInstructed() {
	public void writeNotesAsInstructed() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}