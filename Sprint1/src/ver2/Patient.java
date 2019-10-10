package ver2;
import java.util.Scanner;
import java.util.Set;

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
	 private Set<Appointment> appointment;
	 private Set<Doctor> doctor;
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
	 
	 public Patient(String firstName, String middleName, String lastName, int dateOfBirth, int i, String sex, String address, int patientId, String appointmentDate){
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
	 public Set<Appointment> getAppointment(){
		 return this.appointment;
	 }
	 
	//@ManyToMany(mappedBy = "Patient")
	 public Set<Doctor> getDoctor(){
		 	return this.doctor;
	 }
	 
	 public void setAppointment(Set<Appointment> appointment) {
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
    // patient can book appointments
	public void bookAppointments() {
		System.out.println("enter appointment date :");
		Scanner input= new Scanner(System.in);
		this.appointmentDate = input.nextLine();
	}

    //patient modifies appointments
	public void cancelorChangeAppointments() {
		System.out.println("please tell your patient ID to cancel or change the appointment ?");
		Scanner input = new Scanner (System.in);
		this.patientId = input.nextInt();
		
	}

	public String toString() {
		return "Patient name: "+ getName() +"/ Genter: " + getGender()+ "/ Age: " +getAge();
	}
}