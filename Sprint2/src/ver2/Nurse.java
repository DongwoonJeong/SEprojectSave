package ver2;
import java.util.Set;

public class Nurse {

	private Set<Patient> patients;

	private Set<Doctor> doctors;
	/*
	@OneToMany(mappedBy = "nurse")
	public Set<Patient> getPatient(){
		return this.patients;
	}

	@OneToMany(mappedBy = "nurse")
	public Set<Doctor> getDoctors(){
		return this.doctors;
	}
	
   public String getPatient() {
	     return patients;
   }
   
   public Nurse(String firstName, String secondName,String patientId) {
	   super ();
   }
	public void monitorThePatients() {
	
	}
*/

	public void getPatientMedicalHistory() {

	}

	public static void main(String[] args) throws Exception 
	  { 

	      writeNotesAsInstructed();
	}
	public static void writeNotesAsInstructed() throws FileNotFoundException{
		File file = new File("appointmentFile.txt"); 
				    Scanner scan = new Scanner(file); 
				  
				    while (scan.hasNextLine()) 
				      System.out.println(scan.nextLine()); 
	       System.out.println();
	     System.out.println("Please enter the patient name from the AppointmentFile to add notes? ");
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a patient name: ");
			String name = input.next();	
	            System.out.println("Choice - 1 : Patient has injury");
	            System.out.println("Choice - 2 : Patient has illness");
	            System.out.println("Choice - 3 : Or Other Reason");
	            System.out.println("Any other Choice : Try again and it will break");
	      System.out.println("From the List given enter choice of what is the problem and to prescibe appropiate medication : ");
			int choice = input.nextInt();		
	      if  (choice == 1){
	       System.out.println("Which injury has the patient needs to be prescirbed for ");
	       Scanner sc = new Scanner(System.in);
			System.out.println("Enter reason which needs prescription for: ");
	      String reason = sc.nextLine();
	      System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
	       String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
	      try{
	       BufferedWriter writer = new BufferedWriter(
	       
		                                new FileWriter("doctorNotes.txt", true)  
		                            ); 
	                               	    writer.newLine();   //Add new line
		    writer.write(textToAppend);
		    writer.close();
	       } catch (IOException e){
	                               }

	      }	
	        if  (choice == 2){
	       System.out.println("Which illness has the patient needs to be prescirbed for ");
	       Scanner sc = new Scanner(System.in);
			System.out.println("Enter reason which needs prescription for: ");
	      String reason = sc.nextLine();
	      System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
	       String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
	      try{
	       BufferedWriter writer = new BufferedWriter(
	       
		                                new FileWriter("doctorNotes.txt", true)  
		                            ); 
	                               	    writer.newLine();   //Add new line
		    writer.write(textToAppend);
		    writer.close();
	       } catch (IOException e){
	                               }

	      }
	         if  (choice == 3){
	       System.out.println("Which other reason has the patient needs to be prescirbed for ");
	       Scanner sc = new Scanner(System.in);
			System.out.println("Enter reason which needs prescription for: ");
	      String reason = sc.nextLine();
	      System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
	       String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
	      try{
	       BufferedWriter writer = new BufferedWriter(
	       
		                                new FileWriter("doctorNotes.txt", true)  
		                            ); 
	                               	    writer.newLine();   //Add new line
		    writer.write(textToAppend);
		    writer.close();
	       } catch (IOException e){
	                               }

	      }
		}

	

}