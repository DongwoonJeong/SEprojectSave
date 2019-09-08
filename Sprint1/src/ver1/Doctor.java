package ver1;

private Set<Patient> patients;

private Set<Nurse> nurses;

private Receptionist receptionist;

@OneToMany(mappedBy = "patient")
@OneToMany(mappedBy = "doctor")
public Set<Patient> getPatient() {
	return this.patient;
	return this.patients;
}

@OneToMany(mappedBy = "doctor")
public Set<Nurse> getNurses(){
	return this.nurses;
}

@OneToOne(mappedBy = "receptionist", optional = false)
public Receptionist() {
@OneToOne(optional = false)
public Receptionist getReceptionist() {
	return this.receptionist;
}

public void getPrescriptions() {
}

public static void wrriteNotesAsInstructed() {
public void wrriteNotesAsInstructed() {
}

}