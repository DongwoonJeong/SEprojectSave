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
	      chargeFees();
	}
	public static void writeNotesAsInstructed() throws FileNotFoundException{
		File file = new File("appointmentFile.txt"); 
				    Scanner scan = new Scanner(file); 
				  
				    while (scan.hasNextLine()) 
				      System.out.println(scan.nextLine()); 
	       System.out.println();
	       System.out.println("This are the list of avaiable doctors");
	       System.out.println("1. Dongwoon Jeong");
			System.out.println("2. Hoyong Lee");
			System.out.println("3. Utsav Patel");
			System.out.println("4. Tarun Patel");
			System.out.println("5. Kevin Patel");
			System.out.println("Please enter the correct doctor from the AppointmentFile to add notes? ");
			System.out.println("By entering Number correspoding to that Doctor ");
			
	     Scanner input = new Scanner(System.in);
	     int Option = input.nextInt();
	     if (Option == 1) {
	    	 System.out.println("Enter a patient name: ");
				String name = input.next();	
				
				
				
		            System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
		            System.out.println("Choice - 2 : Do you want to write a prescription"); 
		            

				int choice = input.nextInt();		
		      if  (choice == 1){
		        System.out.printf("Enter the Diagnosis:");
		       Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
		      try{
		       BufferedWriter writer = new BufferedWriter(
		       
			                                new FileWriter("Dongwoon Jeong List.txt", true)  
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
		       
			                                new FileWriter("Dongwoon Jeong List.txt", true)  
			                            ); 
		                               	    writer.newLine();   //Add new line
			    writer.write(textToAppend);
			    writer.close();
		       } catch (IOException e){
		                               }

		        }
	 		
	 	}
	     if (Option == 2) {
	    	 System.out.println("Enter a patient name: ");
				String name = input.next();	
				
				
				
		            System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
		            System.out.println("Choice - 2 : Do you want to write a prescription"); 
		            

				int choice = input.nextInt();		
		      if  (choice == 1){
		        System.out.printf("Enter the Diagnosis:");
		       Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
		      try{
		       BufferedWriter writer = new BufferedWriter(
		       
			                                new FileWriter("Hoyong Lee List.txt", true)  
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
		       
			                                new FileWriter("Hoyong Lee List.txt", true)  
			                            ); 
		                               	    writer.newLine();   //Add new line
			    writer.write(textToAppend);
			    writer.close();
		       } catch (IOException e){
		                               }

		        }
	 		
	 	}
	     if (Option == 3) {
	    	 System.out.println("Enter a patient name: ");
				String name = input.next();	
				
				
				
		            System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
		            System.out.println("Choice - 2 : Do you want to write a prescription"); 
		            

				int choice = input.nextInt();		
		      if  (choice == 1){
		        System.out.printf("Enter the Diagnosis:");
		       Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
		      try{
		       BufferedWriter writer = new BufferedWriter(
		       
			                                new FileWriter("Utsav Patel List.txt", true)  
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
		       
			                                new FileWriter("Utsav Patel List.txt", true)  
			                            ); 
		                               	    writer.newLine();   //Add new line
			    writer.write(textToAppend);
			    writer.close();
		       } catch (IOException e){
		                               }

		        }
	 		
	 	}
	     if (Option == 4) {
	    	 System.out.println("Enter a patient name: ");
				String name = input.next();	
				
				
				
		            System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
		            System.out.println("Choice - 2 : Do you want to write a prescription"); 
		            

				int choice = input.nextInt();		
		      if  (choice == 1){
		        System.out.printf("Enter the Diagnosis:");
		       Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
		      try{
		       BufferedWriter writer = new BufferedWriter(
		       
			                                new FileWriter("Tarun Patel List.txt", true)  
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
		       
			                                new FileWriter("Tarun Patel List.txt", true)  
			                            ); 
		                               	    writer.newLine();   //Add new line
			    writer.write(textToAppend);
			    writer.close();
		       } catch (IOException e){
		                               }

		        }
	 		
	 	}
	     if (Option == 5) {
	    	 System.out.println("Enter a patient name: ");
				String name = input.next();	
				
				
				
		            System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
		            System.out.println("Choice - 2 : Do you want to write a prescription"); 
		            

				int choice = input.nextInt();		
		      if  (choice == 1){
		        System.out.printf("Enter the Diagnosis:");
		       Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason: "+ reason;
		      try{
		       BufferedWriter writer = new BufferedWriter(
		       
			                                new FileWriter("Kevin Patel List.txt", true)  
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
		       
			                                new FileWriter("Kevin Patel List.txt", true)  
			                            ); 
		                               	    writer.newLine();   //Add new line
			    writer.write(textToAppend);
			    writer.close();
		       } catch (IOException e){
		                               }

		        }
	 		
	 	}
	     else {
	    	 System.out.println("The choices in incorrect and not given, Try again");
	    	 
	     }
	     
}

	public static void chargeFees() throws FileNotFoundException{
		System.out.println("Welcome to Fee Manager");
		System.out.println("Based on doctorNotes the following charges are presented. ");
		File file = new File("doctorNotes.txt"); 
	    Scanner scan = new Scanner(file); 
	  
	    while (scan.hasNextLine()) 
	      System.out.println(scan.nextLine()); 
	System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a patient name to send billing? ");
		String name = input.next();		
		System.out.println("The Regular Price is 45$ ");
		System.out.println("This price is just for doctor visit the treatments will be charges based on symptons");
		System.out.println("Enter a patient name to send billing? " + name);
		System.out.println("Option - 1 : Regular Price + Billing for Injuries");
		System.out.println("Option - 2 : Regualar Price + Billing for Illness");
		System.out.println("Option - 3 : Regular Price ");
		System.out.println("Any other Option is not validated and terminated");
		System.out.println("From Option pick one : ");
		
		int Option = input.nextInt();	
		if (Option == 3) {
			System.out.println("The Regular price is charged only");
			System.out.println(name + " has Bill of $ 45");
			
		}
		if (Option == 1) {
			System.out.println("Please pick injury from the below list");
			System.out.println("1: Shoulder Injury");
			System.out.println("2: Hamstring Injury");
			System.out.println("3: Groin Pull Injury");
			System.out.println("Any other Option is not validated and terminated");
			int pick = input.nextInt();
			if (pick ==1) {
				System.out.println("Shoulder Injury");
				int num1 = 500, num2 = 45, sum;
				sum = num1 + num2;
			System.out.println(name + " has Bill of $ "+ sum);
			System.out.println("The Regular price: 45$");
			System.out.println("Injury Cost: 500$");
			}
			if (pick ==2) {
				System.out.println("Hamstring");
				int num1 = 600, num2 = 45, sum;
				sum = num1 + num2;
			System.out.println(name + " has Bill of $ "+ sum);
			System.out.println("The Regular price: 45$");
			System.out.println("Injury Cost: 600$");
			} 
			if (pick ==3) {
				System.out.println("Groin Pull");
				int num1 = 700, num2 = 45, sum;
				sum = num1 + num2;
			System.out.println(name + " has Bill of $ "+ sum);
			System.out.println("The Regular price: 45$");
			System.out.println("Injury Cost: 700$");
			}
			
		}
		if (Option == 2) {
			System.out.println("Please pick Illness from the below list");
			System.out.println("1: Flu");
			System.out.println("2: Sore Throat");
			System.out.println("3: Cough");
			System.out.println("4: Ear Pain");
			System.out.println("Any other Option is not validated and terminated");
			int pick = input.nextInt();
			if (pick ==1) {
				System.out.println("Flu");
				int num1 = 100, num2 = 45, sum;
				sum = num1 + num2;
			System.out.println(name + " has Bill of $ "+ sum);
			System.out.println("The Regular price: 45$");
			System.out.println("Injury Cost: 100$");
			}
			if (pick ==2) {
				System.out.println("Sore Throat");
				int num1 = 55, num2 = 45, sum;
				sum = num1 + num2;
			System.out.println(name + " has Bill of $ "+ sum);
			System.out.println("The Regular price: 45$");
			System.out.println("Injury Cost: 55$");
			} 
			if (pick ==3) {
				System.out.println("Cough");
				int num1 = 85, num2 = 45, sum;
				sum = num1 + num2;
			System.out.println(name + " has Bill of $ "+ sum);
			System.out.println("The Regular price: 45$");
			System.out.println("Injury Cost: 85$");
			}
			if (pick ==4) {
				System.out.println("Ear Pain");
				int num1 = 155, num2 = 45, sum;
				sum = num1 + num2;
			System.out.println(name + " has Bill of $ "+ sum);
			System.out.println("The Regular price: 45$");
			System.out.println("Injury Cost: 155$");
			}
			
		}
	}

}