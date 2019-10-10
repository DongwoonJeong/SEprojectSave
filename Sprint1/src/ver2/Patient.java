package ver2;
import java.util.Scanner;
import java.util.ArrayList;

public class Patient extends Person{

	 // instance variables 
	
	 private String firstName;
	 private String middleName;
	 private String lastName;
	 private int dateOfBirth;
	 private String ssn;
	 private String sex;
	 private String address;
	 private int patientId;
	 private String appointmentDate;
	 private int numOfAppointments;
	 private ArrayList<Appointment> appointment;
	 private ArrayList<Doctor> doctor;
	 //private Set<Nurse> nurse;
	
	  // constructors
	 public Patient(String name,int age, String gender,String appointmentDate,String ssn,String address) {
		 super.setName(name);
		 super.setAge(age);
		 super.setGender(gender);
		 this.appointmentDate = appointmentDate;
		 this.ssn = ssn;
		 this.address = address;
	 }
	 
	 public Patient(String firstName, String middleName, String lastName, int dateOfBirth, String ssn, String sex, String address, int patientId, String appointmentDate){
		 this.firstName= firstName;
		 this.middleName = middleName;
		 this.lastName= lastName;
		 this.dateOfBirth= dateOfBirth;
		 this.ssn= ssn;
		 this.sex =sex;
		 this.address= address;
		 this.patientId=patientId;
		 this.appointmentDate= appointmentDate;
	 }
	 
	 public String getFirstName() {
		 return firstName;	 
	 }
	 
	 public String getMiddleName() {
		 return middleName;
	 }
	 
	 public String getLastName() {
		 return lastName;
	 }
	 
	 public int getDateOfBirth() {
		 return dateOfBirth;
	 }
	 
	 public String getSsn() {
		 return ssn;
	 }
	 
	 public String getPatientGender() {
		 return sex;
	 }
	 
	 public String getPatientAddress() {
		 return address; 
	 }
	 
	 public int getPatientId() {
		 return patientId;
	 }
	 
	 public String getPatntApptDate() {
		 return appointmentDate;
	 }
	 
	 public int getNumOfAppoints() {
		 return appointment.size();
	 }
	 
	 public void addAppointments(Appointment s) {
		 appointment.add(s);
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
	 
	 
	 /*
	 public boolean equals(object o) {
		 Patient i = (Patient)o;
		 return this.ssn.equals(i.ssn);
	 }
	 */
	 
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
     
	public void bookAppointments() {
		System.out.println("enter appointment date :");
		Scanner input= new Scanner(System.in);
		this.appointmentDate = input.nextLine();
	}


	public void cancelorChangeAppointments() {
	}

	public String toString() {
		return "Patient name: "+ getName() +"/ Genter: " + getGender()+ "/ Age: " +getAge();
	}
}