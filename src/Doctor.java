import java.util.Set;

public class Doctor {
	
	private Set<Patient> patients;
	
	private Receptionist receptionist;
	
	@OneToMany(mappedBy = "patient")
	public Set<Patient> getPatient() {
		return this.patient;
	}
	
	@OneToOne(mappedBy = "receptionist", optional = false)
	public Receptionist() {
		return this.receptionist;
	}
	
	public void getPrescriptions() {
	}
    
	public static void wrriteNotesAsInstructed() {
	}
	
}
