package prob2;

import java.util.Set;

import com.yattasolutions.umllab.examples.shop.Company;
import com.yattasolutions.umllab.examples.shop.Employee;
import com.yattasolutions.umllab.examples.shop.ManyToMany;

public class Receptionist {
	String patient;
	public static  bookAppointments() {
	}
	public static void cancelOrChangeAppointments() {
	}
	
	public static void patientInformation() {
		
	}
	public static void patientFileRecords() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 @ManyToMany(mappedBy="Receptionist" )
	   public bookAppointments<patient> bookAppointments {
	      return this.patient;

}
