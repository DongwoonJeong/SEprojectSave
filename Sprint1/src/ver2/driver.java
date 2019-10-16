package ver2;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner 
		Scanner input = new Scanner(System.in);
		
		//our data
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		
		//what do you want to do?
		while (true) {
		System.out.println("What do you want to do: \n"
				+ "1. make a new appointment\n"
				+ "2. cancel an anppointment\n"
				+ "3. change appointment date\n"
				+ "4. extit \n");
		
		int action = input.nextInt();
		
		//make a new appointment
		if (action == 1 )
			makeAppointment(patients,appointments);
		
		//cancel an appointment (will work later)
		if (action == 2)
			cancelAppointment(appointments);
		
		//change appointment date
		if (action == 3)
			changeAppointmentDate(patients,appointments);
		
		//break
		if (action == 4 )
			break;
		}
		
		System.out.println("new patients list: ");
		System.out.println(patients);
		System.out.println("new Appointment list: ");
		System.out.println(appointments);

	}
	
	public static void makeAppointment(ArrayList<Patient> patients, ArrayList<Appointment> appointments) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a patient name: ");
		String name = input.next();
		
		System.out.println("Enter a patient age: ");
		Integer age = input.nextInt();
		
		System.out.println("Enter a patient gender (M/W): ");
		String gender = input.next();
		
		System.out.println("Enter a appointment date (MM-DD-YYYY): ");
		String appointmentDate = input.next();
		
		System.out.println("Enter a patient ssn: ");
		String ssn = input.next();
		
		System.out.println("Enter a patient address: ");
		String address = input.next();
		
		System.out.println("Enter Date of Bitrh: ");
		String dateOfbirth = input.next();
		
		System.out.println("New Appointment made\n\n");
		
		//let's guess the patient has no previous record
		//make a new patient with information given
		Patient newPatient = new Patient(name, age, gender, appointmentDate,ssn,address,dateOfbirth);
		//make a new appointment with information given
		Appointment newAppointment = new Appointment(newPatient, appointmentDate);
		//make a new set of appointment for the patient (it is his first appointment)
		ArrayList<Appointment> Set_newAppointments = new ArrayList<Appointment>();
		//add the first appointment to the set.
		Set_newAppointments.add(newAppointment);
		
		/* when the patient has previous record(deal it later)
		//get previous appointment that a patient had
		Set<Appointment> PreviousAppointments = new HashSet<Appointment>();
		PreviousAppointments = newPatient.getAppointment();
		PreviousAppointments.add(newAppointment);
		newPatient.setAppointment(PreviousAppointments);
		*/
		
		//add new patient and new appointment to the data.
		patients.add(newPatient);
		appointments.add(newAppointment);
		
		try(FileWriter fw = new FileWriter("appointmentFile.txt", true);
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
			   {
			       out.println(newAppointment.toString());
			   } catch (IOException e) {
			       //exception handling left as an exercise for the reader
			   }
		
		try(FileWriter fw = new FileWriter("patientFile.txt", true);
			       BufferedWriter bw = new BufferedWriter(fw);
			       PrintWriter out = new PrintWriter(bw))
			   {
			       out.println(newPatient.toString());
			   } catch (IOException e) {
			       //exception handling left as an exercise for the reader
			   }

		
	}
	
	public static void cancelAppointment(ArrayList<Appointment> appointments){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ssn: ");
		String ssn = input.next();
		
		//boolean find=false;
		for(int i = 0; i< appointments.size(); i++) {
			if (appointments.get(i).getPatient().getSsn().equals(ssn)) {
				appointments.remove(i);
				//find = true;
			}
		}
		//if (find == false)
			//System.out.println("no such appointment");
		
        try {
            File inputFile = new File("appointmentFile.txt");
            if (!inputFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }
            //Construct the new file that will later be renamed to the original filename.
            File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader("appointmentFile.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line = null;

            //Read from the original file and write to the new
            //unless content matches data to be removed.
            while ((line = br.readLine()) != null) {
                if (!line.trim().contains(ssn)) {
                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            //Delete the original file
            if (!inputFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inputFile))
                System.out.println("Could not rename file");
            }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
	}

	public static void changeAppointmentDate(ArrayList<Patient> patients, ArrayList<Appointment> appointments) {
		
	}
}
