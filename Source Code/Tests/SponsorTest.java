package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Sponsor;

public class SponsorTest {
	
	private ArrayList<Sponsor> sponsorList = new ArrayList<Sponsor>();
	private String sponsorName;
	private String startDate;
	private String endDate;
	private float value;
	private Sponsor sponsor;


	@BeforeEach
	void setUp() throws Exception {
		sponsorName = "Test";
		startDate = "01/01/2020";
		endDate = "01/01/2021";
		value = 1000;
		sponsor = new Sponsor(sponsorName,startDate,endDate,value);
		sponsorList.add(sponsor);	
		}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void sponsorTest() {
		
		try
		{
			assertEquals(sponsor, sponsorList.get(0));
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(sponsorName, sponsorList.get(0).getName());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(startDate, sponsorList.get(0).getContractStartDate());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(endDate, sponsorList.get(0).getContractEndDate());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
		
		try
		{
			assertEquals(value, sponsorList.get(0).getTotalContractValue());
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
	}

}
