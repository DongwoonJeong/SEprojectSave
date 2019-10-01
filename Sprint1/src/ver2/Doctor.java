import java.util.Set;

public class Doctor {
	
	private String name;
	
	private Set<Patient> patients;
	
	private Set<Nurse> nurses;
	
	private Set<Receptionist> receptionists;
	
	public Doctor(String name) {
		this.name = name;
	}
	//@OneToMany(mappedBy = "doctor")
	public Set<Patient> getPatient() {
		return this.patients;
	}
	
	//@OneToMany(mappedBy = "doctor")
	public Set<Nurse> getNurses(){
		return this.nurses;
	}
	
	//@OneToOne(optional = false)
	public Set<Receptionist> getReceptionist() {
		return this.receptionists;
	}
	
	public void getPrescriptions() {
	}
    
	public void wrriteNotesAsInstructed() {
	}
	
}
