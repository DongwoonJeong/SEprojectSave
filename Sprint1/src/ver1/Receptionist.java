package ver1;
import java.util.Set;

import com.yattasolutions.umllab.examples.shop.Company;
import com.yattasolutions.umllab.examples.shop.Employee;
import com.yattasolutions.umllab.examples.shop.ManyToMany;

public class Receptionist {
	String patient;
	public static  bookAppointments() {
	}
	public static void cancelOrChangeAppointments() {

	private Set<Patient> patients;

	private Set<Doctor> doctor;

	@OneToMany(mappedBy ="receptionist")
	public Set<Doctor> getDoctor() {
		return this.doctor;
	}

	public static void patientInformation() {

	@OneToMany(mappedBy = "receptionist")
	public Set<Patient> getPatients(){
		return this.patients;
	}
	public static void patientFileRecords() {

	public void  bookAppointments() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	public void cancelOrChangeAppointments() {
	}

	 @ManyToMany(mappedBy="Receptionist" )
	   public bookAppointments<patient> bookAppointments {
	      return this.patient;
	public void patientInformation() {
	}
	public void patientFileRecords() {
	}

}