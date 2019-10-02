package ver2;
import java.util.Set;

public class Doctor {
	
	//private String name;
	private String notes;
	
	
	
	private Set<Patient> patients;
	
	private Set<Nurse> nurses;
	
	private Set<Receptionist> receptionists;
	
	public Doctor(String name) {
		this.setName(name);
	}
	private void setName(String name) {
		
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
    
	public void Note (String Notes) {
		this.setNotes(Notes);
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String add(String string) {
		return string;
	}
	
	

	
}
