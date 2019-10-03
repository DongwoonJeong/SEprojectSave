package ver2;
import java.util.Set;

public class Receptionist extends Person{
	
	private Set<Patient> patients;
	
	private Set<Doctor> doctors;
	
	Receptionist(String name){
		super.setName(name);
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
	
	public String toString() {
		return "Receptionist name: "+ getName();
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
