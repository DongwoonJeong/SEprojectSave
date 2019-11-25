package ver2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class DoctorManagemet {

	private Set<Patient> patients;

	private Set<Doctor> doctors;


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
			
	            System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
	            System.out.println("Choice - 2 : Do you want to write a presistion"); 
	            

			int choice = input.nextInt();		
	      if  (choice == 1){
	        System.out.printf("Enter the Diagnosis:");
	       Scanner sc = new Scanner(System.in);
			String reason = sc.nextLine();
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
	 
             System.out.printf("The diagnosis has been saved ");
	      }	
	        if  (choice == 2){
	       System.out.println("What presistion do you want to prescribe for the Patient");
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