// Java program that consist of a project class which contain an attribute, constructor, getter method, 
//setter method and a toString method.

public class ProjectForm {

	//Attributes
	private int projectNumber;
	private String projectName;
	private String buildingType;
	private String physicalAddress;
	private String erfNumber;
	private double totalFeeCharge;
	private double totalAmountPaid;
	private String projectDeadline;

	//person objects
	private Persons contractor;
	private Persons customer;
	private Persons architect;


	//constructor
	public ProjectForm(int ProjNumber, String projName, String buildingType, String physAddress,String erfNumber, double totalFeeCharge, 
			double totalAmountPaid, String projDeadline, Persons contractor, Persons customer, Persons architect){
		this.projectNumber = ProjNumber;
		this.projectName = projName; 
		this.buildingType = buildingType;
		this.physicalAddress = physAddress;
		this.erfNumber = erfNumber;
		this.totalFeeCharge = totalFeeCharge;
		this.totalAmountPaid = totalAmountPaid;
		this.projectDeadline = projDeadline;
		this.contractor = contractor;
		this.customer = customer;
		this.architect = architect;

	}

	//Accessory / getter methods	
	public Persons getContractor() {
		return contractor;
	}

	public Persons getCustomer() {
		return customer;
	}

	public Persons getArchitect() {
		return architect;
	}

	public int getProjectNumber(){
		return projectNumber;
	}
	public String getProjectDateline(){
		return projectDeadline;
	}

	public double getTotalAmount() {
		return 	totalAmountPaid;
	}

	public double getTotalFeeCharge() {
		return totalFeeCharge;
	}

	//Accessory / setter methods	
	public void setProjectNumber(int projectnumber){
		this.projectNumber = projectnumber;
	}

	public void setProjectName(String projectname){
		this.projectName = projectname;
	}

	public void setTotalAmount(double totalamountpaid){
		this.totalAmountPaid = totalamountpaid;
	}

	public void setTotalFeeCharge(double totalfeecharge) {
		this.totalFeeCharge = totalfeecharge;
	}

	public void setProjectDeadline(String projectdeadline){
		this.projectDeadline = projectdeadline;
	}

	public void setCustomer(Persons costomer) {
		this.customer = costomer;
	}

	//The toString method
	public String toString(){
		return "Project Number: "+ projectNumber +
				"\nProject Name: "+ projectName +
				"\nType of building: " + buildingType +
				"\nPhysical Address: "+ physicalAddress +
				"\nERF Number: "+ erfNumber +
				"\nTotal Fee Charge R"+ totalFeeCharge +
				"\nTotal Amount: R"+ totalAmountPaid +
				"\nProject Dateline: "+ projectDeadline +
				"\n\nContractor Details\n==================\n\n"+ contractor +
				"\n\nCostomer Details\n================\n\n"+ customer +
				"\n\nArchitect Details\n=================\n\n"+ architect;


	}

}