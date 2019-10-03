package ver2;
import java.util.Set;

public class Doctor extends Person {
	
	private String notes;
	private int followUp;
	
	private Set<Patient> patients;
	
	private Set<Nurse> nurses;
	
	private Set<Receptionist> receptionists;
	
	public Doctor(String name) {
		super.setName(name);
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
	
	public String toString() {
		return "Doctor: "+ getName();
	}
	public void Note (String Notes) {
		this.setNotes(Notes);
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void followUp(long appointment) {
		
	}
	
}


