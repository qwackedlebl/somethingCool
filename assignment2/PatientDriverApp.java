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

public class PatientDriverApp {

	
	
	public static void displayPatient(Patient name) {
		
		System.out.println();
		System.out.println("Patient Info:");
		System.out.print("\tName: . . . . . . . . . ");
		System.out.println(name.buildName());
		
		System.out.print("\tAddress:  . . . . . . . ");
		System.out.println(name.buildAddress());
		
		System.out.print("\tEmergency Contact:  . . ");
		System.out.println(name.buildEmergencyContact());
		System.out.println();
	}
	
	public static void displayProcedure(Procedure name) {
		
		System.out.print("\t\tProcedure Type: . . . . ");
		System.out.println(name.getProcedureType());
		System.out.print("\t\tProcedure Date: . . . . ");
		System.out.println(name.getProcedureDate());
		System.out.print("\t\tPractitioner: . . . . . ");
		System.out.println(name.getProcedureExecutioner());
		System.out.print("\t\tCharges:  . . . . . . . ");
		System.out.println(name.getProcedureCharges());
		System.out.println();
	}
	
	public static void displayCharges(Procedure name, Procedure name1, Procedure name2) {
		double charges = 0.0;
		charges += Double.parseDouble(name.getProcedureCharges());
		charges += Double.parseDouble(name1.getProcedureCharges());
		charges += Double.parseDouble(name2.getProcedureCharges());
		
		
		System.out.println("Total charges: $" + charges);
	}
	
	
	public static void displayStudentInfo() {
		System.out.println();
		System.out.println();
		System.out.println("Student name: Lev Belolipetski");
		System.out.println("MC #: 21119519");
		System.out.println("Due Date: 2/19/2024");
	}
	
	
	
	public static void main(String[] args) {

		var patientZero = new Patient("Bob", "The", "Builder", "Construction Lane", "Build City", "Buildingland", "12345",
				"314-159-2653", "Bobina", "Builder", "271-828-1828");

		var procedure1 = new Procedure();
			procedure1.setProcedureType("Botox Injection");
			procedure1.setProcedureDate("1/11/1111");
			procedure1.setProcedureExecutioner("Johnny Depp");
			procedure1.setProcedureCharges("1234567.89");
			
		var procedure2 = new Procedure("Buttocks Lift", "1/21/2121");
			procedure2.setProcedureExecutioner("Robert Downey Jr.");
			procedure2.setProcedureCharges("3.37");
		
		var procedure3 = new Procedure("Nose job", "2/22/2222", "Chris Hemsworth", "69.42");
		
		
		
		

		displayPatient(patientZero);
		
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		displayCharges(procedure1, procedure2, procedure3);
		
		
		displayStudentInfo();
	
		
	}

}
