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

public class Patient {

	private String nameFirst, nameMiddle, nameLast;

	private String addressStreet, addressCity, addressState, addressZIP;

	private String numberPhone;

	private String nameFirstEmergency, nameLastEmergency, numberPhoneEmergency;

// no arg constructor

	public Patient() {
		this.nameFirst = null;
		this.nameMiddle = null;
		this.nameLast = null;

		this.addressStreet = null;
		this.addressCity = null;
		this.addressState = null;
		this.addressZIP = null;

		this.numberPhone = null;

		this.nameFirstEmergency = null;
		this.nameLastEmergency = null;
		this.numberPhoneEmergency = null;

	}

// name-only constructor overload

	public Patient(String first, String middle, String last) {
		this();

		this.nameFirst = first;
		this.nameMiddle = middle;
		this.nameLast = last;
	}

// all-only constructor overload

	public Patient(String first, String middle, String last, String street, String city, String state, String ZIP,
			String phone, String firstEmergency, String lastEmergency, String phoneEmergency) {
		this.nameFirst = first;
		this.nameMiddle = middle;
		this.nameLast = last;

		this.addressStreet = street;
		this.addressCity = city;
		this.addressState = state;
		this.addressZIP = ZIP;

		this.numberPhone = phone;

		this.nameFirstEmergency = firstEmergency;
		this.nameLastEmergency = lastEmergency;
		this.numberPhoneEmergency = phoneEmergency;
	}

// accessor methods

	public String getNameFirst() {
		return this.nameFirst;
	}

	public String getNameMiddle() {
		return this.nameMiddle;
	}

	public String getNameLast() {
		return this.nameLast;
	}

	public String getAddressStreet() {
		return this.addressStreet;
	}

	public String getAddressCity() {
		return this.addressCity;
	}

	public String getAddressState() {
		return this.addressState;
	}

	public String getAddressZIP() {
		return this.addressZIP;
	}

	public String getNumberPhone() {
		return this.numberPhone;
	}

	public String getNameFirstEmergency() {
		return this.nameFirstEmergency;
	}

	public String getNameLastEmergency() {
		return this.nameLastEmergency;
	}

	public String getNumberPhoneEmergency() {
		return this.numberPhoneEmergency;
	}

// mutator methods 

	public void setNameFirst(String first) {
		this.nameFirst = first;
	}

	public void setNameMiddle(String middle) {
		this.nameMiddle = middle;
	}

	public void setNameLast(String last) {
		this.nameLast = last;
	}

	public void setAddressStreet(String street) {
		this.addressStreet = street;
	}

	public void setAddressCity(String city) {
		this.addressCity = city;
	}

	public void setAddressState(String state) {
		this.addressState = state;
	}

	public void setAddressZIP(String zip) {
		this.addressZIP = zip;
	}

	public void setNumberPhone(String phone) {
		this.numberPhone = phone;
	}

	public void setNameFirstEmergency(String nameEmergency) {
		this.nameFirstEmergency = nameEmergency;
	}

	public void setNameLastEmergency(String nameEmergency) {
		this.nameLastEmergency = nameEmergency;
	}

	public void setNumberPhoneEmergency(String phoneEmergency) {
		this.numberPhoneEmergency = phoneEmergency;
	}

// building methods 

	public String buildName() {
		return this.getNameFirst() + " " + this.getNameMiddle() + " " + this.getNameLast(); // could return improperly idk
	}

	public String buildAddress() {
		return this.getAddressStreet() + " " + this.getAddressCity() + " " + this.getAddressState() + " "
				+ getAddressZIP();
	}

	public String buildEmergencyContact() {
		return this.getNameFirstEmergency() + " " + this.getNameLastEmergency() + " " + this.getNumberPhoneEmergency();
	}


// thanos building method

	public String toString() {
		
		return this.buildName() + "\n" + this.buildAddress() + "\n" + this.buildEmergencyContact() + "\n";
	}


}
