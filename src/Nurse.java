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
	
	public void monitorThePatients() {
		
	}
	
	public void getPatientMedicalHistory() {
		
	}

	public void writeNotesAsInstructed() {
	}
	

}
