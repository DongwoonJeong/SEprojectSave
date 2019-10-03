import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Receptionist {
	
	private String name;
	
	private Set<Patient> patients;
	
	private Set<Doctor> doctors;


	private String appointment;

	private String address;

	private String parameter;

	private String parameter2;

	private String parameter3;

	private String parameter6;

	private String parameter4;

	private int parameter5;

	private long whole;
 master
	
	Receptionist(String name){
		this.name = name;
	}
	
	//@OneToMany(mappedBy ="receptionist")
	public Set<Doctor> getDoctor() {
		return this.doctors;
	}
	
	//@OneToMany(mappedBy = "receptionist")
	public Set<Patient> getPatients(){
		return this.patients;
	}
	
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	
	
	
	public void addPatient(Patient newPatient) {
		patients.add(newPatient);
	}
	
	public void  bookAppointments() {
		System.out.println("Please Enter Appointment date (in following way: 21 Jan 1998): " );
     	Scanner scan8 = new Scanner(System.in);
			this.appointment = scan8.nextLine();
			
		System.out.println("Please Enter Address: " );
     	Scanner scan9 = new Scanner(System.in);
			this.address = scan9.nextLine();
			System.out.println(address);
		System.out.println("Please Enter first name: " );
         Scanner scan1 = new Scanner(System.in);
  		this.parameter = scan1.nextLine();
        System.out.println("Please Enter middle name: " );
        Scanner scan2 = new Scanner(System.in);
        this.parameter2 = scan2.nextLine();
        System.out.println("Please Enter last name: " );
        Scanner scan3 = new Scanner(System.in);
       this.parameter3 = scan3.nextLine();
        System.out.println("Please Enter Gender: " );
        Scanner scan6 = new Scanner(System.in);
 		this.parameter6 = scan6.nextLine();
        System.out.println("Please Enter DoBirth (in following way: 21 Jan 1998): " );
        	Scanner scan4 = new Scanner(System.in);
 			this.parameter4 =  scan4.nextLine();
 	  	
 		System.out.println("Please Enter SSN: " );
     	Scanner scan5 = new Scanner(System.in);
			this.parameter5 = scan5.nextInt();
			System.out.println("Welcome: " + parameter);
			try {
	            BufferedWriter writer =
	                    new BufferedWriter(new FileWriter("Medical.txt"));

	            writer.write(parameter + " ");
	            System.out.println();
	            writer.write(parameter2 + " ");
	            writer.write(parameter3 + " ");
	            writer.write(parameter4 + " ");
	            writer.write(parameter5 + " ");
	            writer.write(parameter6 + " ");
	            writer.write(address + " ");
	            writer.write(appointment + " ");

	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}
	
	public void cancelOrChangeAppointments() {
		
	}
	
	public void patientInformation() throws FileNotFoundException {
		File file = 
			      new File("Medical.txt"); 
			    Scanner sc = new Scanner(file); 
			  
			    while (sc.hasNextLine()) 
			      System.out.println(sc.nextLine()); 
			  } 
	
	public void patientFileRecords() {
	}

}