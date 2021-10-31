// Java program that consist of a persons class which contain an attribute, constructor, getter method, 
//setter method and a toString method.

public class Persons {
	//attributes
	private String surname;
	private String name;
	private String contactNumber;
	private String emailAddress;
	private String physicalAddress;



	//constructor
	public Persons(String surname, String name, String contactNumber, String emailAddress, String physicalAddress){
		this.surname = surname;
		this.name = name; 
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;

	}

	//Accessory / getter methods	  
	public String getSurname(){
		return surname;
	}
	public String getContactNumber(){
		return contactNumber;
	}

	public String getName(){
		return name;
	}

	public String getEmail(){
		return emailAddress;
	}

	public String getPhysicalAddress(){
		return physicalAddress;
	}

	//Accessory / setter methods
	public void setSurname(String surname){
		this.surname = surname;
	}

	public void setname(String name){
		this.name = name;
	}

	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}

	public void setEmailAddress(String email){
		this.emailAddress = email;
	}

	public void setPhysicalAddress(String physicalAddress){
		this.physicalAddress = physicalAddress;
	}

	//The toString method
	public String toString(){
		return "Surname: "+surname +
				"\nName: "+ name +
				"\ncontact Number: " + contactNumber +
				"\nEmail Address: "+ emailAddress +
				"\nPysical Address: "+ physicalAddress;

	}

}
