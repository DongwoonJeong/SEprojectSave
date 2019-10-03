package ver2;

public class Appointment {
	
	private long appointmentId;
	private String appointmentDate;
	private Patient patient;
	
	public Appointment(Patient patient,String appointmentDate) {
		this.patient = patient;
		this.appointmentDate = appointmentDate;
	}
	
	public String getAppointmentDate() {
		return this.appointmentDate;
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
		return patient.getLastName()+" Date: "+ getAppointmentDate();
	}

}
