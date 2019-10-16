package ver2;
import java.util.Scanner;
import java.util.ArrayList;

public class Patient extends Person{

	 // instance variables 
	 private int dateOfBirth;
	 private String ssn;
	 private String address;
	 private String appointmentDate;
	 private ArrayList<Appointment> appointment;
	 private ArrayList<Doctor> doctor;
	 private String DateOfBirth;
	
	 // constructors
	 public Patient(String name,int age, String gender,String appointmentDate,String ssn,String address , String DateOfBirth) {
		 super.setName(name);
		 super.setAge(age);
		 super.setGender(gender);
		 this.appointmentDate = appointmentDate;
		 this.ssn = ssn;
		 this.address = address;
		 this.DateOfBirth = DateOfBirth;
	 }
	 
	 
	 public String getSsn() {
		 return ssn;
	 }
	 
	 public String getAddress() {
		 return address; 
	 }
	 
	 public String getAppointmentDate() {
		 return appointmentDate;
	 }
	 
	 //@ManyToMany(mappedBy = "Patient")
	 public ArrayList<Appointment> getAppointment(){
		 return this.appointment;
	 }
	 
	 //@ManyToMany(mappedBy = "Patient")
	 public ArrayList<Doctor> getDoctor(){
		 	return this.doctor;
	 }
	 
	 public void setAppointment(ArrayList<Appointment> appointment) {
		 	this.appointment = appointment;
	 }
	 public void setDateOfBirth(String DateOfBirth) {
			this.DateOfBirth = DateOfBirth;
		}
	 public String getDateOfBirth() {
		 	return DateOfBirth;
	 }
	 
  /* 
	 private Receptionist receptionist;

	 private Doctor doctor;

	 private Nurse nurse;
	  private Appointment appointment;
	 
	 
	 
	

	 OneToOne(mappedBy = "receptionist")
	 public Receptionist getReceptionist() {
		 return receptionist;
	 }

	 @OneToOne(mappedBy = "patient")
	 public Doctor getDoctor() {
		 return doctor;
	 }

	 @OneToOne(mappedBy = "nurse")
	 public Nurse getNurse() {
		 return nurse;
	 }
*/
	public String toString() {
		return String.format("patient name: %-12s /Age: %-5s/ Gender: %-4s/ Appointment Date: %-12s/ SSN: %-14s/ Address: %-24s/ Date Of Birth: %-24s"  
				,getName(), getAge() , getGender() ,getAppointmentDate(), getSsn() , getAddress(), getDateOfBirth());
	}


}