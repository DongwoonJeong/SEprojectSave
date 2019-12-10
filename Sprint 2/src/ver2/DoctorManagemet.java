  
package ver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DoctorManagemet {

	private Set<Patient> patients;

	private Set<Doctor> doctors;
	Date today = new Date();
    //..
	public static void main(String[] args) throws Exception 
	{ 
		
       Scanner input = new  Scanner(System.in);
       
	
       File file = new File("appointmentFile.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine())
			System.out.println(scan.nextLine());
			System.out.print("Appointment list");
		System.out.println();
		
		
		
		while(true) {
			
			System.out.println("\n**************************Welcome Doctor!****************************\n");
			System.out.println(" what would you like to do ?  \n"
					 +    " 1. Write notes for patients   \n"
					 +    " 2. charge fees to patients    \n"
			         +    " 3. Exit");
			int command = input.nextInt();
			
			//write notes
			if (command == 1) 
				writeNotesAsInstructed();
			if (command == 2)
				chargeFees();
			if 	(command ==3)
				break;
			
		}
                
	}
	//writing notes for patients
	public static void writeNotesAsInstructed() throws FileNotFoundException{
		Date today = new Date();

		Scanner input = new  Scanner(System.in);
		System.out.println("Log in doctor");
		System.out.println("1. Dongwoon Jeong");
		System.out.println("2. Hoyong Lee");
		System.out.println("3. Utsav Patel");
		System.out.println("4. Tarun Patel");
		System.out.println("5. Kevin Patel");
		System.out.println("\nPlease log in ");
		System.out.println("Choose the correct doctor number. ");
		
		int Option = input.nextInt();
		String doctorname =null;
		if (Option ==1) {
			doctorname = "Dongwoon Jeong";
		}
		else if (Option ==2) {
			doctorname = "Hoyong Lee";
		}
		else if (Option ==3) {
			doctorname = "Utsav Patel";
		}
		else if (Option ==4) {
			doctorname = "Tarun Patel";
		}
		else if (Option ==5) {
			doctorname = "Kevin Patel";
		}
		
		if (Option == 1) {
			System.out.println("Enter a patient name: ");
			String name = input.next();
			
			System.out.println("Choice - 1 : Enter the Diagnosis of the Patient"+"\n");
			System.out.println("Choice - 2 : Do you want to write a prescription"+"\n");
			System.out.println("Choide - 3 : Patient diagnosis done\n");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.printf("Enter the Diagnosis: ");
				Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();

				} catch (IOException e) {

				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}

				System.out.printf("The diagnosis has been saved ");
			}
			if (choice == 2) {
				System.out.println("What presistion do you want to prescribe for the Patient");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter reason which needs prescription for: ");
				String reason = sc.nextLine();
				System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}}else if (choice == 3) {
					try{
						File inputFile = new File("Dongwoon Jeong List.txt");
						File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
						BufferedReader br = new BufferedReader(new FileReader("Dongwoon Jeong List.txt"));
						PrintWriter pw = new PrintWriter(tempFile);
						String line = null;
					      while ((line = br.readLine()) != null) {
					        if (!line.trim().contains(name)) {
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
				}

			}

		
		if (Option == 2) {
			System.out.println("Enter a patient name: ");
			String name = input.next();

			System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
			System.out.println("Choice - 2 : Do you want to write a prescription");
			System.out.println("Choide - 3 : Patient diagnosis done\n");

			int choice = input.nextInt();
			if (choice == 1) {
				System.out.printf("Enter the Diagnosis:");
				Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();

				} catch (IOException e) {

				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
				System.out.printf("The diagnosis has been saved ");
			}
			if (choice == 2) {
				System.out.println("What presistion do you want to prescribe for the Patient");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter reason which needs prescription for: ");
				String reason = sc.nextLine();
				System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}}else if (choice == 3) {
					try{
						File inputFile = new File("Hoyong Lee List.txt");
						File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
						BufferedReader br = new BufferedReader(new FileReader("Hoyong Lee List.txt"));
						PrintWriter pw = new PrintWriter(tempFile);
						String line = null;
					      while ((line = br.readLine()) != null) {
					        if (!line.trim().contains(name)) {
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
				}

			}

		
		if (Option == 3) {
			System.out.println("Enter a patient name: ");
			String name = input.next();

			System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
			System.out.println("Choice - 2 : Do you want to write a prescription");
			System.out.println("Choide - 3 : Patient diagnosis done\n");

			int choice = input.nextInt();
			if (choice == 1) {
				System.out.printf("Enter the Diagnosis:");
				Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();

				} catch (IOException e) {

				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}

				System.out.printf("The diagnosis has been saved ");
			}
			if (choice == 2) {
				System.out.println("What presistion do you want to prescribe for the Patient");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter reason which needs prescription for: ");
				String reason = sc.nextLine();
				System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}else if (choice == 3) {
				try{
					File inputFile = new File("Utsav Patel List.txt");
					File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
					BufferedReader br = new BufferedReader(new FileReader("Utsav Patel List.txt"));
					PrintWriter pw = new PrintWriter(tempFile);
					String line = null;
				      while ((line = br.readLine()) != null) {
				        if (!line.trim().contains(name)) {
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
			}

		}
		if (Option == 4) {
			System.out.println("Enter a patient name: ");
			String name = input.next();

			System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
			System.out.println("Choice - 2 : Do you want to write a prescription");
			System.out.println("Choide - 3 : Patient diagnosis done\n");

			int choice = input.nextInt();
			if (choice == 1) {
				System.out.printf("Enter the Diagnosis:");
				Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();

				} catch (IOException e) {

				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
				System.out.printf("The diagnosis has been saved ");
			}
			if (choice == 2) {
				System.out.println("What presistion do you want to prescribe for the Patient");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter reason which needs prescription for: ");
				String reason = sc.nextLine();
				System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}else if (choice == 3) {
					try{
						File inputFile = new File("Tarun Patel List.txt");
						File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
						BufferedReader br = new BufferedReader(new FileReader("Tarun Patel List.txt"));
						PrintWriter pw = new PrintWriter(tempFile);
						String line = null;
					      while ((line = br.readLine()) != null) {
					        if (!line.trim().contains(name)) {
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
				}

			}

		
		if (Option == 5) {
			System.out.println("Enter a patient name: ");
			String name = input.next();

			System.out.println("Choice - 1 : Enter the Diagnosis of the Patient");
			System.out.println("Choice - 2 : Do you want to write a prescription");
			System.out.println("Choide - 3 : Patient diagnosis done\n");

			int choice = input.nextInt();
			if (choice == 1) {
				System.out.printf("Enter the Diagnosis:");
				Scanner sc = new Scanner(System.in);
				String reason = sc.nextLine();
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();

				} catch (IOException e) {

				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}

				System.out.printf("The diagnosis has been saved ");
			}
			if (choice == 2) {
				System.out.println("What presistion do you want to prescribe for the Patient");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter reason which needs prescription for: ");
				String reason = sc.nextLine();
				System.out.println("Patient: " + name + " Has following problem which needs prescibed: " + reason);
				String textToAppend = "Patient name: " + name + " The Reason for the visit: " + reason +" by doctor "+ doctorname + 
						" Date: " +today;
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter( name + " chart.txt", true));
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Updated.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}

			}else if (choice == 3) {
				try{
					File inputFile = new File("Kevin Patel List.txt");
					File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
					BufferedReader br = new BufferedReader(new FileReader("Kevin Patel List.txt"));
					PrintWriter pw = new PrintWriter(tempFile);
					String line = null;
				      while ((line = br.readLine()) != null) {
				        if (!line.trim().contains(name)) {
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
			}

		} 
		

	}

	public static void chargeFees() throws FileNotFoundException {
		System.out.println("Welcome to Fee Manager");
		System.out.println("Based on doctorNotes the following charges are presented. ");
		File file = new File("Updated.txt");
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
			String textToAppend = "Patient name: " + name + " Total cost: $45";
			try {
				BufferedWriter writer = new BufferedWriter(

						new FileWriter("Bill List.txt", true));
						
				writer.newLine(); // Add new line
				writer.write(textToAppend);
				writer.close();
			} catch (IOException e) {
			}
		}
		if (Option == 1) {
			System.out.println("Please pick injury from the below list");
			System.out.println("1: Shoulder Injury");
			System.out.println("2: Hamstring Injury");
			System.out.println("3: Groin Pull Injury");
			System.out.println("Any other Option is not validated and terminated");
			int pick = input.nextInt();
			if (pick == 1) {
				System.out.println("Shoulder Injury");
				int num1 = 500, num2 = 45, sum;
				sum = num1 + num2;
				System.out.println(name + " has Bill of $ " + sum);
				System.out.println("The Regular price: 45$");
				System.out.println("Injury Cost: 500$");
				String textToAppend = "Patient name: " + name + " Total cost: $" + sum; 
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Bill List.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}
			if (pick == 2) {
				System.out.println("Hamstring");
				int num1 = 600, num2 = 45, sum;
				sum = num1 + num2;
				System.out.println(name + " has Bill of $ " + sum);
				System.out.println("The Regular price: 45$");
				System.out.println("Injury Cost: 600$");
				String textToAppend = "Patient name: " + name + " Total cost: $" + sum; 
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Bill List.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}
			if (pick == 3) {
				System.out.println("Groin Pull");
				int num1 = 700, num2 = 45, sum;
				sum = num1 + num2;
				System.out.println(name + " has Bill of $ " + sum);
				System.out.println("The Regular price: 45$");
				System.out.println("Injury Cost: 700$");
				String textToAppend = "Patient name: " + name + " Total cost: $" + sum; 
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Bill List.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
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
			if (pick == 1) {
				System.out.println("Flu");
				int num1 = 100, num2 = 45, sum;
				sum = num1 + num2;
				System.out.println(name + " has Bill of $ " + sum);
				System.out.println("The Regular price: 45$");
				System.out.println("Injury Cost: 100$");
				String textToAppend = "Patient name: " + name + " Total cost: $" + sum; 
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Bill List.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}
			if (pick == 2) {
				System.out.println("Sore Throat");
				int num1 = 55, num2 = 45, sum;
				sum = num1 + num2;
				System.out.println(name + " has Bill of $ " + sum);
				System.out.println("The Regular price: 45$");
				System.out.println("Injury Cost: 55$");
				String textToAppend = "Patient name: " + name + " Total cost: $" + sum; 
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Bill List.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}
			if (pick == 3) {
				System.out.println("Cough");
				int num1 = 85, num2 = 45, sum;
				sum = num1 + num2;
				System.out.println(name + " has Bill of $ " + sum);
				System.out.println("The Regular price: 45$");
				System.out.println("Injury Cost: 85$");
				String textToAppend = "Patient name: " + name + " Total cost: $" + sum; 
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Bill List.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}
			if (pick == 4) {
				System.out.println("Ear Pain");
				int num1 = 155, num2 = 45, sum;
				sum = num1 + num2;
				System.out.println(name + " has Bill of $ " + sum);
				System.out.println("The Regular price: 45$");
				System.out.println("Injury Cost: 155$");
				String textToAppend = "Patient name: " + name + " Total cost: $" + sum; 
				try {
					BufferedWriter writer = new BufferedWriter(

							new FileWriter("Bill List.txt", true));
							
					writer.newLine(); // Add new line
					writer.write(textToAppend);
					writer.close();
				} catch (IOException e) {
				}
			}

		}
	}

}