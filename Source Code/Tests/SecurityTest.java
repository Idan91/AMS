package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Section;
import model.Security;
import model.Stadium;

public class SecurityTest {
	
	private Stadium stadium;
	private ArrayList<Security> securityList = new ArrayList<Security>();
	private String securityName;
	private String startDate;
	private String jobDescription;
	private float salary;
	private Security security;
	private Section section1;
	private Section section2;
	private Section section3;


	@BeforeEach
	void setUp() throws Exception {
		//Stadium setup
		Section[] sectionArray = new Section[3];
		section1 = new Section(1, "1", "High", 20, false, 300, "VIP");
		section2 = new Section(2, "2", "Medium", 20, false, 300, "Club Level");
		section3 = new Section(3, "3", "Low", 20, false, 300, "Bleachers");
		sectionArray[0] = section1;
		sectionArray[1] = section2;
		sectionArray[2] = section3;
		
		stadium = Stadium.getInstance(1, "stadiumName", "homeTeam", 12000, "address",10, sectionArray);
		//
		
		securityName = "John Smith";
		startDate = "01/01/2020";
		jobDescription = "Electrician";
		salary = 1000;
		security = new Security(securityName,startDate,jobDescription,salary,stadium);
		securityList.add(security);	
		}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void securityTest() {
		
		try
		{
			assertEquals(security, securityList.get(0));
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(securityName, securityList.get(0).getName());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(startDate, securityList.get(0).getContractStartDate());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(jobDescription, securityList.get(0).getJobDescription());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(salary, securityList.get(0).getSalary());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
	}

}
