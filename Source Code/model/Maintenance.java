package model;

public class Maintenance extends FacilitiesDepartment {
	private String name;
	private String maintenanceStartdate;
	private String maintenanceReason;
	private int priority;

	// Constructor:
	public Maintenance(String name, String maintenanceStartdate, String maintenanceReason, int priority, Stadium stadium) {
		super("Maintenance", stadium);

		this.name=name;
		this.maintenanceStartdate=maintenanceStartdate;
		this.maintenanceReason=maintenanceReason;
		this.priority=priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaintenanceStartdate() {
		return maintenanceStartdate;
	}

	public void setMaintenanceStartdate(String maintenanceStartdate) {
		this.maintenanceStartdate = maintenanceStartdate;
	}

	public String getMaintenanceReason() {
		return maintenanceReason;
	}

	public void setMaintenanceReason(String maintenanceReason) {
		this.maintenanceReason = maintenanceReason;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}


}