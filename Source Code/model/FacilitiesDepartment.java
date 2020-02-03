package model;


public abstract class FacilitiesDepartment extends Department{

	protected int[] sectionCoverage;
	protected int occupiedEmployees;

	public FacilitiesDepartment(String i_DepartmentName, Stadium i_Stadium) {
		super(i_DepartmentName);
	}

}
