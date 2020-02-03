package model;


public class Security extends FacilitiesDepartment {
	private String name;
	private String contractStartDate;
	private String jobDescription;
	private float salary;

	// Constructor:
	public Security(String name, String contractStartDate, String jobDescription, float salary, Stadium stadium) {
		super("Security", stadium);

		this.name=name;
		this.contractStartDate=contractStartDate;
		this.jobDescription=jobDescription;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}