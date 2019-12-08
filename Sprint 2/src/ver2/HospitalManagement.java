package ver2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

import java.io.*;

public class HospitalManagement {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);//Scanner
		//patients and appointments list
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		//read data from txt files
		readData(patients,appointments);
		
		boolean amty = false;
		//what do you want to do?
		while (true) {
		System.out.println("What do you want to do: \n"
				+ "1. Make a new appointment\n"
				+ "2. Cancel an anppointment\n"
				+ "3. Change appointment date\n"
				+ "4. Check appointment List\n"
				+ "5. Exit \n");
		
		int action = input.nextInt();
		
		//make a new appointment
		if (action == 1 )
			makeAppointment(patients, appointments);
		
		//cancel an appointment (will work later)
		if (action == 2)
			cancelAppointment(appointments);
		
		//change appointment date
		if (action == 3)
			changeAppointmentDate(appointments);
		if (action == 4) {
			amty = appointments.isEmpty(); 
			if (amty == true) {
            System.out.println("There is no appointment\n"); 
			}else {
			System.out.println("patient name     /patient ssn      /appointment date    /with doctor \n");
			System.out.println(appointments+"\n");
			}
		}//break
		if (action == 5 )
			break;
		}
		
		System.out.println("Program ended\n");

	}

	
	public static void readData(ArrayList<Patient> patientsList,ArrayList<Appointment> appointmentsList) throws Exception{
		try {
			File file = new File("patientFile.txt");
			Scanner input = new Scanner(file);
		
			if(file.exists()) {
			
				input.nextLine();
				while (input.hasNextLine()) {
					String line = input.nextLine();
					String[] token = line.split("/");
					String name = token[0].trim();
					int age = Integer.parseInt(token[1].trim());
					String gender = token[2].trim();
					String appointmentDate = token[2].trim();
					String ssn = token[3].trim();
					String address = token[4].trim();
					String dateOfBirth = token[5].trim();
					
					Patient patient = new Patient(name,age,gender,appointmentDate,ssn,address,dateOfBirth);
					patientsList.add(patient);
				}
			}
		}
		catch(IOException e) {
		}
		
		try {
			File file = new File("appointmentFile.txt");
			Scanner input2 = new Scanner(file);
		
			if(file.exists()) {
			
				input2.nextLine();
				while (input2.hasNextLine()) {
					String line = input2.nextLine();
					String[] token = line.split("/");
					String name = token[0].trim();
					String ssn = token[1].trim();
					String appointmentDate = token[2].trim();
					String doctorname = token[3].trim();
					Patient patient = new Patient(name,ssn,appointmentDate);
					
					Appointment appointment = new Appointment(patient,appointmentDate, doctorname);
					appointmentsList.add(appointment);
				}
			}
		}
		catch(IOException e) {
		}
	}
	
	public static void makeAppointment(ArrayList<Patient> patientList, ArrayList<Appointment> appointmentList) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a patient name: ");
		String name = input.nextLine();
		
		System.out.println("Enter a patient age: ");
		Integer age = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter a patient gender (M/W): ");
		String gender = input.nextLine();
		
		System.out.println("Enter a appointment date (MM-DD-YYYY): ");
		String appointmentDate = input.nextLine();
		
		System.out.println("Enter a patient ssn: ");
		String ssn = input.nextLine();
		
		System.out.println("Enter a patient address: ");
		String address = input.nextLine();
		
		System.out.println("Enter Date of Bitrh: ");
		String dateOfbirth = input.nextLine();
		
		System.out.println("Choose a doctor you want to see");
		System.out.println("1. Dongwoon Jeong");
		System.out.println("2. Hoyong Lee");
		System.out.println("3. Utsav Patel");
		System.out.println("4. Tarun Patel");
		System.out.println("5. Kevin Patel");
		String doctornumber = input.next();
		String doctorname =null;
		if (Integer.parseInt(doctornumber) ==1) {
			doctorname = "Dongwoon Jeong";
		}
		else if (Integer.parseInt(doctornumber) ==2) {
			doctorname = "Hoyong Lee";
		}
		else if (Integer.parseInt(doctornumber) ==3) {
			doctorname = "Utsav Patel";
		}
		else if (Integer.parseInt(doctornumber) ==4) {
			doctorname = "Tarun Patel";
		}
		else if (Integer.parseInt(doctornumber) ==5) {
			doctorname = "Kevin Patel";
		}
		
		System.out.println("New Appointment made\n");
		
		Patient newPatient = new Patient(name, age, gender, appointmentDate,ssn,address,dateOfbirth);
		Appointment newAppointment = new Appointment(newPatient, appointmentDate, doctorname);
		
		patientList.add(newPatient);
		appointmentList.add(newAppointment);//
		
		try(FileWriter fw = new FileWriter("patientFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
				out.printf("patient name     /age  /gender /appointmentDate   /ssn               /address                 /date of birth   \n");
			
			for (int i=0; i< patientList.size(); i++) {
				out.println(patientList.get(i));
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
		
		try(FileWriter fw = new FileWriter("appointmentFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
				out.printf("patient name    /patient ssn       /appointment date       /with doctor    \n");
			
			for (int i=0; i< appointmentList.size(); i++) {
				out.println(appointmentList.get(i));
				
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
	if (Integer.parseInt(doctornumber) ==1) {
			try(FileWriter fw = new FileWriter("Dongwoon Jeong List.txt", true);
				       BufferedWriter bw = new BufferedWriter(fw);
				       PrintWriter out = new PrintWriter(bw))
				   {
				out.printf("patient name    /patient ssn       /appointment date       /with doctor \n");
				       out.println(newAppointment.toString());
				   } catch (IOException e) {
				       //exception handling left as an exercise for the reader
				   }
		}else if (Integer.parseInt(doctornumber) ==2) {
			try(FileWriter fw = new FileWriter("Hoyong Lee List.txt", true);
				       BufferedWriter bw = new BufferedWriter(fw);
				       PrintWriter out = new PrintWriter(bw))
				   {
				out.printf("patient name    /patient ssn       /appointment date       /with doctor \n");
				       out.println(newAppointment.toString());
				   } catch (IOException e) {
				       //exception handling left as an exercise for the reader
				   }
		}else if(Integer.parseInt(doctornumber) ==3) {
			try(FileWriter fw = new FileWriter("Utsav Patel List.txt", true);
				       BufferedWriter bw = new BufferedWriter(fw);
				       PrintWriter out = new PrintWriter(bw))
				   {
				out.printf("patient name    /patient ssn       /appointment date       /with doctor \n");
				       out.println(newAppointment.toString());
				   } catch (IOException e) {
				       //exception handling left as an exercise for the reader
				   }
		}else if(Integer.parseInt(doctornumber) ==4) {
			try(FileWriter fw = new FileWriter("Tarun Patel List.txt", true);
				       BufferedWriter bw = new BufferedWriter(fw);
				       PrintWriter out = new PrintWriter(bw))
				   {
				out.printf("patient name    /patient ssn       /appointment date       /with doctor \n");
				       out.println(newAppointment.toString());
				   } catch (IOException e) {
				       //exception handling left as an exercise for the reader
				   }
		}else if(Integer.parseInt(doctornumber) ==5) {
			try(FileWriter fw = new FileWriter("Kevin Patel List.txt", true);
				       BufferedWriter bw = new BufferedWriter(fw);
				       PrintWriter out = new PrintWriter(bw))
				   {
				out.printf("patient name    /patient ssn       /appointment date       /with doctor \n");
				       out.println(newAppointment.toString());
				   } catch (IOException e) {
				       //exception handling left as an exercise for the reader
				   }
		}	
	}
	
	public static void cancelAppointment(ArrayList<Appointment> appointmentsList){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter patient's ssn: ");
		String ssn = input.nextLine();
		
		for(int i = 0; i < appointmentsList.size(); i++) {
			if (appointmentsList.get(i).getPatient().getSsn().equals(ssn))
				appointmentsList.remove(i);
		}
		
		try(FileWriter fw = new FileWriter("appointmentFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
			out.printf("patient name    /patient ssn       /appointment date       /with doctor \n");
			
			for (int i=0; i< appointmentsList.size(); i++) {
				out.println(appointmentsList.get(i));
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
		try{
		File inputFile = new File("Dongwoon Jeong List.txt");
		File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
		BufferedReader br = new BufferedReader(new FileReader("Dongwoon Jeong List.txt"));
		PrintWriter pw = new PrintWriter(tempFile);
		String line = null;
	      while ((line = br.readLine()) != null) {
	        if (!line.trim().contains(ssn)) {
	    	  pw.println(line);
	    	  pw.flush();				
	        }
	      }
	      pw.close();
	      br.close();
	      if(!inputFile.delete()) {
	    	  System.out.println("could not delete file");
	    	  return;
	      }
	      if(!tempFile.renameTo(inputFile)) {
	    	  System.out.println("could not rename file");
	      }
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
		
		try{
			File inputFile = new File("Hoyong Lee List.txt");
			File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
			BufferedReader br = new BufferedReader(new FileReader("Hoyong Lee List.txt"));
			PrintWriter pw = new PrintWriter(tempFile);
			String line = null;
		      while ((line = br.readLine()) != null) {
		        if (!line.trim().contains(ssn)) {
		    	  pw.println(line);
		    	  pw.flush();				
		        }
		      }
		      pw.close();
		      br.close();
		      if(!inputFile.delete()) {
		    	  System.out.println("could not delete file");
		    	  return;
		      }
		      if(!tempFile.renameTo(inputFile)) {
		    	  System.out.println("could not rename file");
		      }
			} catch (IOException e) {
				       //exception handling left as an exercise for the reader
			}
			try{
				File inputFile = new File("Utsav Patel List.txt");
				File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
				BufferedReader br = new BufferedReader(new FileReader("Utsav Patel List.txt"));
				PrintWriter pw = new PrintWriter(tempFile);
				String line = null;
			      while ((line = br.readLine()) != null) {
			        if (!line.trim().contains(ssn)) {
			    	  pw.println(line);
			    	  pw.flush();				
			        }
			      }
			      pw.close();
			      br.close();
			      if(!inputFile.delete()) {
			    	  System.out.println("could not delete file");
			    	  return;
			      }
			      if(!tempFile.renameTo(inputFile)) {
			    	  System.out.println("could not rename file");
			      }
				} catch (IOException e) {
					       //exception handling left as an exercise for the reader
				}
					try{
						File inputFile = new File("Tarun Patel List.txt");
						File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
						BufferedReader br = new BufferedReader(new FileReader("Tarun Patel List.txt"));
						PrintWriter pw = new PrintWriter(tempFile);
						String line = null;
					      while ((line = br.readLine()) != null) {
					        if (!line.trim().contains(ssn)) {
					    	  pw.println(line);
					    	  pw.flush();				
					        }
					      }
					      pw.close();
					      br.close();
					      if(!inputFile.delete()) {
					    	  System.out.println("could not delete file");
					    	  return;
					      }
					      if(!tempFile.renameTo(inputFile)) {
					    	  System.out.println("could not rename file");
					      }
						} catch (IOException e) {
							       //exception handling left as an exercise for the reader
						}
							try{
								File inputFile = new File("Kevin Patel List.txt");
								File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
								BufferedReader br = new BufferedReader(new FileReader("Kevin Patel List.txt"));
								PrintWriter pw = new PrintWriter(tempFile);
								String line = null;
							      while ((line = br.readLine()) != null) {
							        if (!line.trim().contains(ssn)) {
							    	  pw.println(line);
							    	  pw.flush();				
							        }
							      }
							      pw.close();
							      br.close();
							      if(!inputFile.delete()) {
							    	  System.out.println("could not delete file");
							    	  return;
							      }
							      if(!tempFile.renameTo(inputFile)) {
							    	  System.out.println("could not rename file");
							      }
								} catch (IOException e) {
									       //exception handling left as an exercise for the reader
								}
							System.out.println("Appointment canceled successfully");
							}
	
	
	public static void changeAppointmentDate(ArrayList<Appointment> appointmentsList) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter patient's ssn: ");
		String ssn = input.nextLine();
		
		System.out.println("Enter new Date: ");
		String newDate = input.nextLine();
		
		for(int i = 0; i < appointmentsList.size(); i++) {
			if (appointmentsList.get(i).getPatient().getSsn().equals(ssn))
				appointmentsList.get(i).setAppointmentDate(newDate);
		}
		
		try(FileWriter fw = new FileWriter("appointmentFile.txt");
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
		{
			//if (!((new File("patientsFile.txt")).exists()))
			out.printf("patient name    /patient ssn       /appointment date /with doctor \n");
			
			for (int i=0; i< appointmentsList.size(); i++) {
				out.println(appointmentsList.get(i));
			}
		} catch (IOException e) {
			       //exception handling left as an exercise for the reader
		}
	}
}
