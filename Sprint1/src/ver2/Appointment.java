//package prob1;

import java.util.Set;

public class Appointment {
	
	private long appointmentId;
	private long appointmentDate;
	private Patient patient;
	
	public Appointment(long appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	public long getAppointmentDate() {
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
