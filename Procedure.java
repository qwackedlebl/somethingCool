/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: A basic patient and procedure logging, display, and charges calculation software.
 * Due: 02/19/2024
 * Platform/compiler: Windows, eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: LEV BELOLIPETSKI
*/

public class Procedure {
	
	private String procedureType;
	private String procedureDate;
	private String procedureExecutioner;
	private String procedureCharges;
	
	
	public Procedure() {
		procedureType = null;
		procedureDate = null;
		procedureExecutioner = null;
		procedureCharges = null;
	}
	
	public Procedure(String name, String date) {
		this();
		
		procedureType = name;
		procedureDate = date;
	}
	
	public Procedure(String name, String date, String executioner, String charges) {
		procedureType = name;
		procedureDate = date;
		procedureExecutioner = executioner;
		procedureCharges = charges;
	}
	
	
// accessors

	public String getProcedureType() {
		return procedureType;
	}

	public String getProcedureDate() {
		return procedureDate;
	}
	
	public String getProcedureExecutioner() {
		return procedureExecutioner;
	}
	
	public String getProcedureCharges() {
		return procedureCharges;
	}


// mutators
	public void setProcedureType(String procedureType) {
		this.procedureType = procedureType;
	}

	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}

	public void setProcedureExecutioner(String procedureExecutioner) {
		this.procedureExecutioner = procedureExecutioner;
	}

	public void setProcedureCharges(String procedureCharges) {
		this.procedureCharges = procedureCharges;
	}

// toString build method 
	public String toString() {
		return "Procedure [procedureType=" + procedureType + ", procedureDate=" + procedureDate
				+ ", procedureExecutioner=" + procedureExecutioner + ", procedureCharges=" + procedureCharges + "]";
	}
	
	
	
	
	
}
