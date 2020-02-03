package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Section;
import model.Stadium;

public class SectionTypeTest extends TestCase {
	
	private Stadium stadium;
	private Section[] sectionArray;
	private Section section1;
	private Section section2;
	private Section section3;
	private String[] expectedSectionTypes;
	
	@BeforeEach
	protected void setUp() throws Exception {
		sectionArray = new Section[3];
		section1 = new Section(1, "1", "High", 20, false, 300, "VIP");
		section2 = new Section(2, "2", "Medium", 20, false, 300, "Club Level");
		section3 = new Section(3, "3", "Low", 20, false, 300, "Bleachers");
		sectionArray[0] = section1;
		sectionArray[1] = section2;
		sectionArray[2] = section3;
		
		expectedSectionTypes = new String[3];
		expectedSectionTypes[0] = "VIP";
		expectedSectionTypes[1] = "Club Level";
		expectedSectionTypes[2] = "Bleachers";
		
		stadium = Stadium.getInstance(1, "stadiumName", "homeTeam", 12000, "address",10, sectionArray);
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetArenaSections() {
		
		for(int i=0 ; i<sectionArray.length ; i++)
		{
			String actualSectionType = stadium.getArenaSection(i).getSectionType();
			if(actualSectionType != null)
			{
				try
				{
					assertEquals(expectedSectionTypes[i], actualSectionType);
				}
				catch(AssertionError e)
				{
					fail("Returned sectionType does not match expected");
				}
			}
			else
			{
				fail("Returned sectionType is null");
			}
		}
	}

}
