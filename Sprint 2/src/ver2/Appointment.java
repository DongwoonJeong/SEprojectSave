package ver2;

public class Appointment {
	
	private long appointmentId;
	private String appointmentDate;
	private Patient patient;
	private String doctorname;
	public Appointment(Patient patient,String appointmentDate, String doctorname) {
		this.patient = patient;
		this.appointmentDate = appointmentDate;
		this.doctorname = doctorname;
	}
	
	public String getAppointmentDate() {
		return this.appointmentDate;
	}
	
	public String getDoctorName() {
		return this.doctorname;
	}
	
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	public long getAppointmentId() {
		return this.appointmentId;
	}
	
	//@OneToMany(mappedBy = "Patient", optional = false)
	public Patient getPatient() {
		return this.patient;
	}
	
	public void setAppointmentId(long value) {
		this.appointmentId = value;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public String toString() {
		return String.format("%-20s/%-20s/%-20s/%-20s",patient.getName(), patient.getSsn(),getAppointmentDate(),getDoctorName());
	}

	
}