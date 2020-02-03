package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.Game;
import model.Section;
import model.Stadium;

public class GameTicketTest {
	
	private Stadium stadium;
	private Section[] sectionArray;
	private Game game;
	private int stadiumCapacity=300;
	private int numOfBleachersSold = 100;
	private int numOfClubLevelSold = 100;
	private int numOfVipSold = 50;
	private float bleachersPrice = 20;
	private float clubPrice = 50;
	private float vipPrice = 100;
	private float seasonTicketPrice = 1000;
	private Section section1;
	private Section section2;
	private Section section3;

	@BeforeEach
	protected void setUp() throws Exception {
		sectionArray = new Section[3];
		section1 = new Section(1, "1", "High", vipPrice, true, 50, "VIP");
		section2 = new Section(2, "2", "Medium", clubPrice, false, 100, "Club Level");
		section3 = new Section(3, "3", "Low", bleachersPrice, false, 150, "Bleachers");
		sectionArray[0] = section1;
		sectionArray[1] = section2;
		sectionArray[2] = section3;
		stadium = Stadium.getInstance(0, "test", "team", stadiumCapacity, "Bdika 1", sectionArray.length, sectionArray);
		game = new Game("1", "1/1/2001", stadiumCapacity, vipPrice, clubPrice, bleachersPrice, seasonTicketPrice, stadium);
		
		game.vipTicketsSold(numOfVipSold, 0);
		game.clubLevelTicketsSold(numOfClubLevelSold, 1);
		game.bleachersTicketsSold(numOfBleachersSold, 2);
	}


	@Test
	public void gameTicketTest() {
		int expectedTotalSoldTickets = numOfBleachersSold + numOfClubLevelSold + numOfVipSold;
		int expectedTotalUnsoldTickets = stadiumCapacity - expectedTotalSoldTickets;
		float expcetedTotalRevenue = numOfBleachersSold*bleachersPrice + numOfClubLevelSold*clubPrice + numOfVipSold*vipPrice;
		
		int actualTotalSoldTickets = game.getSoldTickets();
		int actualTotalUnsoldTickets = game.getUnsoldTickets();
		float actualTotalRevenue = game.getTotalGameRevenue();
		
		try
		{
			assertEquals(expectedTotalSoldTickets,actualTotalSoldTickets);
			assertEquals(expectedTotalUnsoldTickets,actualTotalUnsoldTickets);
			assertEquals(expcetedTotalRevenue,actualTotalRevenue);
		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
	}

}
