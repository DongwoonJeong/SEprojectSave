import java.util.Set;

public class Receptionist {
	
	private Set<Patient> patients;
	
	private Set<Doctor> doctor;
	
	@OneToMany(mappedBy ="receptionist")
	public Set<Doctor> getDoctor() {
		return this.doctor;
	}
	
	@OneToMany(mappedBy = "receptionist")
	public Set<Patient> getPatients(){
		return this.patients;
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
