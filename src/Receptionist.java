import java.util.Set;

public class Receptionist {
	
	private String name;
	
	private Set<Patient> patients;
	
	private Set<Doctor> doctors;
	
	Receptionist(String name){
		this.name = name;
	}
	
	//@OneToMany(mappedBy ="receptionist")
	public Set<Doctor> getDoctor() {
		return this.doctors;
	}
	
	//@OneToMany(mappedBy = "receptionist")
	public Set<Patient> getPatients(){
		return this.patients;
	}
	
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	
	
	
	public void addPatient(Patient newPatient) {
		patients.add(newPatient);
	}
	
	public void  bookAppointments() {
	}
	public void cancelOrChangeAppointments() {
	}
	
	public void patientInformation() {
	}
	public void patientFileRecords() {
	}

}
