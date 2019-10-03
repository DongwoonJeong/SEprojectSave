package ver2;
import java.sql.*;
import java.util.Scanner;

public class JBS {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/PATIENTS1";

    //credentials
    static final String USER = "root";
    static final String PASS = "Tarun@2101";
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)throws SQLException{
    	Connection conn = null;
    	Statement stmt = null;
        try {
            try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            System.out.println("Connecting to database.");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            stmt = conn.createStatement();
            System.out.println("Welcome to Appointment Maker");
            System.out.println("Choice - 1 : To create new appoitment");
            System.out.println("Choice - 2 : To view patient info based on their SSN");
            System.out.println("Choice - 3 : To delete patient info based on their SSN");
            System.out.println("Choice - 4 : To view patient database");
            System.out.println("Please enter choice # to view its contents? ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();        
      
            if (number == 1){
       
        		System.out.println("Please Enter Appointment date (in following way: 21 Jan 1998): " );
	         	Scanner scan8 = new Scanner(System.in);
	  			String appointment = scan8.nextLine();
	  			
        		System.out.println("Please Enter Address: " );
	         	Scanner scan9 = new Scanner(System.in);
	  			String address = scan9.nextLine();
	  			System.out.println(address);
        		System.out.println("Please Enter first name: " );
    	         Scanner scan1 = new Scanner(System.in);
    	  		String parameter = scan1.nextLine();
    	        System.out.println("Please Enter middle name: " );
    	        Scanner scan2 = new Scanner(System.in);
    	        String parameter2 = scan2.nextLine();
    	        System.out.println("Please Enter last name: " );
    	        Scanner scan3 = new Scanner(System.in);
    	        String parameter3 = scan3.nextLine();
    	        System.out.println("Please Enter Gender: " );
   	         Scanner scan6 = new Scanner(System.in);
   	  		String parameter6 = scan6.nextLine();
    	        System.out.println("Please Enter DoBirth (in following way: 21 Jan 1998): " );
   	         	Scanner scan4 = new Scanner(System.in);
   	  			String parameter4 =  scan4.nextLine();
   	  	  	
   	  		System.out.println("Please Enter SSN: " );
	         	Scanner scan5 = new Scanner(System.in);
	  			int parameter5 = scan5.nextInt();
	  			System.out.println("Welcome: " + parameter);
    	        String sql1 = "INSERT INTO  patient1 "
    	        		+ "VALUES ('"+parameter +"', '"+parameter2+"', '"+parameter3+"', '"+parameter4+"', '"+parameter5+"', '"+parameter6+"','"+address+"', 22222, 'hdgj' ,'"+appointment+"')";
    	         stmt.executeUpdate(sql1);
            }
            else if (number == 2){ 	
    	  		
    	   System.out.println("Please Enter SSN to view that patient? " );
            Scanner scan4 = new Scanner(System.in);
           int parameter3 = scan4.nextInt();
          
            	String sql = "SELECT firstName, middleName,"
            			+ "lastName, dateOfBirth, ssn, sex, address, patientId, patientNotes, appointmentDate FROM patient1 Where "
            			+ "ssn = " + "'" + parameter3 +"'" ; 
            	System.out.println(parameter3);
    	         ResultSet rs = stmt.executeQuery(sql);
    	         		while(rs.next()) {
    	         		    		   String firstName = rs.getString("firstName");
    	         		    		   String middleName = rs.getString("middleName");
    	         		    		  String lastName = rs.getString("lastName");
    	         		    		  String dateOfBirth = rs.getString("dateOfBirth");
    	         		    		  int SSN = rs.getInt("ssn");
    	         		    		  String sex = rs.getString("sex");
    	         		    		 String address = rs.getString("address");
    	         		    		int patientId = rs.getInt("patientId");
    	         		    		 String patientNotes = rs.getString("patientNotes");
     	         		    		String appointmentDate = rs.getString("appointmentDate");
     	         		    		System.out.println("Patient Info in following order: ");
     	         		    		System.out.println("FirstName MiddleName lastName daeOfBirth SSN Sex Address PatientID patientNotes AppointmentDate");
    	         		    		   System.out.println("PatientInfo: " + firstName + " "  + middleName + " " 
    	         		    				   + lastName + " " + dateOfBirth+ " "  + SSN+ " "  + sex+ " "  + address
    	         		    				  + " " + patientId + " " 
    	         		    				   + patientNotes+ " "  + appointmentDate+ " " );
    	         		    		   System.out.println();
    	         		} 
    	         		    	   }
            else if (number == 3){
    	         		System.out.println("Please Enter SSN to delete that patient? " );
    	                Scanner scan5 = new Scanner(System.in);
    	               int parameter4 = scan5.nextInt();
    	              System.out.println(parameter4);
    	                	String sql2 = "delete FROM patient1 Where ssn = " + "'" + parameter4 +"'" ; 
    	        	          stmt.executeUpdate(sql2);
    	       String sql5 = "SELECT firstName, middleName, "
    	       		+ "lastName, dateOfBirth, ssn, sex, address, patientId, patientNotes, appointmentDate FROM patient1" ;	 
    	       ResultSet rs2 = stmt.executeQuery(sql5);
    	       System.out.println("The patient has succesfully been deleted from database");
       		while(rs2.next()) {
       			
       		    		 
       		    	   }
    	  }
            
            else if (number ==4) {
            	String sql = "SELECT firstName, middleName, lastName, dateOfBirth, ssn,  "
            			+ " sex, address, patientId, patientNotes, appointmentDate from patient1"; 
            	ResultSet rs = stmt.executeQuery(sql);
            	while(rs.next()) {
            	String firstName = rs.getString("firstName");
            	String middleName = rs.getString("middleName");
            	String lastName = rs.getString("lastName");
            	String dateOfBirth = rs.getString("dateOfBirth");
            	int ssn = rs.getInt("ssn");
            	 String sex = rs.getString("sex");
	    		 String address = rs.getString("address");
	    		int patientId = rs.getInt("patientId");
	    		 String patientNotes = rs.getString("patientNotes");
		    		String appointmentDate = rs.getString("appointmentDate");
		    		System.out.println("FirstName MiddleName lastName daeOfBirth SSN Sex Address PatientID patientNotes AppointmentDate");	
            	System.out.println(firstName +  " " + middleName+  " " + lastName +
            		" " + dateOfBirth + " " + ssn + " " + sex + " " + address + " " +patientId + " " +patientNotes
            		+ " " + appointmentDate);
            	}
         }
            else {
            	System.out.println("Please pick apporiate choice");
            	
            }
        }
        catch (SQLException e){
            System.out.print(e.getMessage());
        }
        
    }
        
}