package ver2;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/*
 * package ver2;
import java.util.ArrayList;

public class Doctor extends Person {
	
	private String notes;
	
	private ArrayList<Patient> patients;
	
	private ArrayList<Receptionist> receptionists;
	
	public Doctor(String name) {
		super.setName(name);
	}
	//@OneToMany(mappedBy = "doctor")
	public ArrayList<Patient> getPatient() {
		return this.patients;
	}
	
	//@OneToOne(optional = false)
	public ArrayList<Receptionist> getReceptionist() {
		return this.receptionists;
	}
	
	public void getPrescriptions() {
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
	
}
 * 
 * */
public class Doctor extends Person {
	
	private String notes;
	
	private ArrayList<Patient> patients;
	
	private ArrayList<Receptionist> receptionists;
	
	public Doctor(String name) {
		super.setName(name);
	}
	//@OneToMany(mappedBy = "doctor")
	public ArrayList<Patient> getPatient() {
		return this.patients;
	}
	
	//@OneToOne(optional = false)
	public ArrayList<Receptionist> getReceptionist() {
		return this.receptionists;
	}
	
	/*public void getPrescriptions()throws FileNotFoundException {
		
		DoctorManagemet DoctorManagemetObject = new DoctorManagemet();
		DoctorManagemetObject.chargeFees();
	}*/
	
	public String toString() {
		return "Doctor: "+ getName();
	}
	public void Note (String Notes)  {
		
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void chargeFees() throws FileNotFoundException {
		DoctorManagemet DoctorManagemetObject = new DoctorManagemet();
		DoctorManagemetObject.chargeFees();
	}
	
}