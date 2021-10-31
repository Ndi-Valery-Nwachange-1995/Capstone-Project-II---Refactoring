// calling all the methods of ProjectForm and persons inside the project main.

// importing all java.utill function
import java.text.ParseException;
import java.util.*;

class Project {

	public static String getStringData(String message){

		//creating a scanner to get the message through the use of keyboard.
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	private static int getIntData(String message){

		// Handling any error inputed by the user in oder for the program not to scratch in do while
		//loop in other for the error message to keep displaying on the console until the user input
		//the correct message. 
		do{
			try{
				System.out.println(message);
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				int num = input.nextInt();
				if( num > 0)
					return num;
				else 
					System.out.println("Your number must be greater than 0");

			}
			catch(Exception e){
				System.out.println("Error, You have entered invalid input, Please try again.");
			}
		}while(true);
	}

	private  static double getDoubleData(String message){
		do{
			try{
				System.out.println(message);
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				double num = input.nextDouble();
				if( num > 0)
					return num;
				else 
					System.out.println("Your number must be greater than 0");
			}
			catch(Exception e){
				System.out.println("Error, You have entered invalid input, Please try again.");
			}
		}while(true);
	}


	//getting the project form from the getString scanner through the keyboard and pass it in 
	//each variable to be display to the console.
	private static ProjectForm getProjectForm(){
		int projectNumber = getIntData("Please enter the number of the project.");
		String projectName = getStringData("Please enter the name of the project.");
		String buildingType = getStringData("Please enter the type of the building for the project.\n"
				+ "House\n"
				+ "Apartment\n"
				+ "Store\n");
		String physicalAddress = getStringData("Please enter the physical address of the project.");
		String numberERF = getStringData("Please enter the ERF number of the project.");
		double totalFeeCharge = getDoubleData("Please enter the total fee beein charge of the project.");
		double totalAmountPaid =getDoubleData("Please enter the total amount paide  to date of the project.");
		String projectDeadline = getStringData("Please enter the deadline of the project YYYY/MM/DD.");

		//persons objects created.
		System.out.println("capturing the Contractor details.\n================================\n");
		Persons contractor = getPerson();
		System.out.println("\n");

		System.out.println("Capturing the Customer details. \n==============================");
		Persons customer = getPerson();
		System.out.println("\n");

		System.out.println("Capturing the Architect details. \n==============================");
		Persons architect = getPerson(); 
		System.out.println("\n");

		// creating all the objects of ProjectForm
		return new ProjectForm(projectNumber, projectName, buildingType, physicalAddress, numberERF, totalFeeCharge, 
				totalAmountPaid, projectDeadline, contractor, customer, architect);
	}	    

	public static Persons getPerson(){

		//getperson method of persons which are constructor, costumer and architect
		//through the keyboard.
		String surname = getStringData("Please enter the surname of the preson.");
		String name = getStringData("Please enter the name of the person.");
		String contactNumber = getStringData("Please nter the contact number of the person.");
		String emailAddress = getStringData("Please enter the email address of the person.");
		String physicalAddress = getStringData("Please enter the physical address of the person.");

		// creating all the objects of persons
		return new Persons(surname, name, contactNumber, emailAddress, physicalAddress);

	}   


	public static void main(String[] args) throws ParseException{

		//Initialize getBfInfor in to a variable called project
		ProjectForm project = getProjectForm();
		System.out.println(project);

		//creating a menu for the project
		String menu = "\n================ M E N U ================ \n"
				+ "\n Please enter 1 to change the Deadline of the project:"
				+ "\n Please enter 2 to change the total amount of the fee paid."
				+ "\n Please enter 3 to change the detials of the contractor:"
				+ "\n Please enter 4 to finalise the project";

		//Initialize userinput.netInt() to update
		int update = getIntData(menu);

		//if the option selected is 1 from the menu above to get the new deadline from the 
		//projectForm to make the changes of projectForm details.	
		if (update == 1) {
			String newDeadline = getStringData("Please enter the new Deadline of the project.");
			project.setProjectDeadline(newDeadline);	
			System.out.println(project);


		}

		//if the option selected is 1 from the menu above to get the new amount fee paid from the 
		//projectForm to make the changes of projectForm details.
		else if (update == 2) {
			double newAmount = getDoubleData("Please enter the new amount fee paid.");
			project.setTotalAmount(newAmount);
			System.out.println(project);

		}

		//if update is equal to 4, get the total fee charge which is cast to double and the total amount 
		//and perform the calculation to get the total balance of the project by the customer.
		else if (update == 4) {
			double totalFee = project.getTotalFeeCharge();
			double totalPaid = project.getTotalAmount();
			double grandTotal = totalFee - totalPaid;

			//generating the receipt of the customer by getting the customer details, the total fee charge,
			//and the total amount paid and the balance of the projectForm.
			System.out.println("customer reciept. \n=================");
			System.out.println(project.getCustomer());
			System.out.println("The total fee charge of the project is: R"+ project.getTotalFeeCharge());
			System.out.println("The total amount being paid of the project is: R"+ project.getTotalAmount());
			System.out.println("The total balance to be paid is: R"+ grandTotal);

		}	

		//else if option is equal to 3 from the menu above display another menu below to make changes
		//from the contractor details.
		else if (update == 3) {
			System.out.println("Please enter new contractor details");
			System.out.println("\n================= M E N U =================: \n"
					+ "\n Please enter 1 to change the contractor contact number."
					+ "\n Please enter 2 to change the contractor email address."
					+ "\n Please enter 3 to change the contractor physical address.");

			// Initialize userinput.netInt() to syscont
			int sysCont = getIntData("");

			// if the option selected is 1 from the menu above to get the new contact number from the 
			//contractor to make the changes of contractor details.
			if (sysCont == 1) {
				String newContractorDetails = getStringData("Please enter new contact of the contractor");
				project.getContractor().setContactNumber(newContractorDetails);
				System.out.print(project);


			}

			//else if the option selected is 1 from the menu above to get the new email address from the 
			//contractor to make the changes of contractor details.
			else if (sysCont == 2) {
				String newContractorDetails = getStringData("Please enter new email address of the contractor");
				project.getContractor().setEmailAddress(newContractorDetails);
				System.out.print(project);


			}

			//if the option selected is 1 from the menu above to get the new physical address from the 
			//contractor to make the changes of contractor details.
			else if (sysCont == 3) {
				String newContractorDetails = getStringData("Please enter new physical address of the contractor");
				project.getContractor().setPhysicalAddress(newContractorDetails);
				System.out.println(project);

			}

		}
	}
}