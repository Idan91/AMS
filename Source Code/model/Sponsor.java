package model;


public class Sponsor {
	private String name;
	private String contractStartDate;
	private String contractEndDate;
	private float totalContractValue;

	// Constructor:
	public Sponsor(String name, String contractStartDate, String contractEndDate, float totalContractValue) {
		this.name=name;
		this.contractStartDate=contractStartDate;
		this.contractEndDate=contractEndDate;
		this.totalContractValue=totalContractValue;
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

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public float getTotalContractValue() {
		return totalContractValue;
	}

	public void setTotalContractValue(float totalContractValue) {
		this.totalContractValue = totalContractValue;
	}

}
