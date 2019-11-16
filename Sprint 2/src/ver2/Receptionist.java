
package ver2;
import java.util.ArrayList;

public class Receptionist extends Person{
	
	private ArrayList<Patient> patients;
	private ArrayList<Doctor> doctors;
	
	
	Receptionist(String name){
		super.setName(name);
	}
	
	//@OneToMany(mappedBy ="receptionist")
	public ArrayList<Doctor> getDoctor() {
		return this.doctors;
	}
	
	//@OneToMany(mappedBy = "receptionist")
	public ArrayList<Patient> getPatients(){
		return this.patients;
	}
	
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	public void setPrescriptions(ArrayList<Patient> prescriptions) {
		this.patients = patients;
	}
	
	public String toString() {
		return "Receptionist name: "+ getName();
	}	

}