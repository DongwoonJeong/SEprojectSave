import java.util.Set;

public class Doctor {
	
	private Set<Patient> patients;
	
	private Set<Nurse> nurses;
	
	private Receptionist receptionist;
	
	@OneToMany(mappedBy = "doctor")
	public Set<Patient> getPatient() {
		return this.patients;
	}
	
	@OneToMany(mappedBy = "doctor")
	public Set<Nurse> getNurses(){
		return this.nurses;
	}
	
	@OneToOne(optional = false)
	public Receptionist getReceptionist() {
		return this.receptionist;
	}
	
	public void getPrescriptions() {
	}
    
	public void wrriteNotesAsInstructed() {
	}
	
}
