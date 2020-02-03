package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Game;
import model.Season;
import model.Section;
import model.Stadium;

public class SeasonTest {

	private Stadium stadium;
	private Section[] sectionArray;
	private Season season;
	private Game game1;
	private Game game2;
	private int stadiumCapacity=300;
	private Section section1;
	private Section section2;
	private Section section3;
	
	private int numOfBleachersSold1 = 100;
	private int numOfClubLevelSold1 = 100;
	private int numOfVipSold1 = 50;
	
	private int numOfBleachersSold2 = 90;
	private int numOfClubLevelSold2 = 30;
	private int numOfVipSold2 = 10;
	
	private float bleachersPrice = 20;
	private float clubPrice = 50;
	private float vipPrice = 100;
	private float seasonTicketPrice = 1000;
	
	private float expectedTotalSeasonRevenue;
	
	@BeforeEach
	void setUp() throws Exception {
		sectionArray = new Section[3];
		section1 = new Section(1, "1", "High", vipPrice, true, 50, "VIP");
		section2 = new Section(2, "2", "Medium", clubPrice, false, 100, "Club Level");
		section3 = new Section(3, "3", "Low", bleachersPrice, false, 150, "Bleachers");
		sectionArray[0] = section1;
		sectionArray[1] = section2;
		sectionArray[2] = section3;
		stadium = Stadium.getInstance(0, "test", "team", stadiumCapacity, "Bdika 1", sectionArray.length, sectionArray);
		game1 = new Game("1", "1/1/2001", stadiumCapacity, vipPrice, clubPrice, bleachersPrice, seasonTicketPrice, stadium);
		game2 = new Game("2", "8/1/2001", stadiumCapacity, vipPrice, clubPrice, bleachersPrice, seasonTicketPrice, stadium);

		
		game1.vipTicketsSold(numOfVipSold1, 0);
		game1.clubLevelTicketsSold(numOfClubLevelSold1, 1);
		game1.bleachersTicketsSold(numOfBleachersSold1, 2);
		
		game2.vipTicketsSold(numOfVipSold2, 0);
		game2.clubLevelTicketsSold(numOfClubLevelSold2, 1);
		game2.bleachersTicketsSold(numOfBleachersSold2, 2);
		
		season = new Season("Season 1", "League1");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void seasonTest() {
		season.createGame("1", "1/1/2001", stadiumCapacity, vipPrice, clubPrice, bleachersPrice, seasonTicketPrice, stadium);
		season.createGame("2", "8/1/2001", stadiumCapacity, vipPrice, clubPrice, bleachersPrice, seasonTicketPrice, stadium);
		
		season.games.get(0).vipTicketsSold(numOfVipSold1, 0);
		season.games.get(0).clubLevelTicketsSold(numOfClubLevelSold1, 1);
		season.games.get(0).bleachersTicketsSold(numOfBleachersSold1, 2);
		
		season.games.get(1).vipTicketsSold(numOfVipSold2, 0);
		season.games.get(1).clubLevelTicketsSold(numOfClubLevelSold2, 1);
		season.games.get(1).bleachersTicketsSold(numOfBleachersSold2, 2);
		
		
		expectedTotalSeasonRevenue = game1.getTotalGameRevenue() + game2.getTotalGameRevenue();
		
		
		try
		{
			assertEquals(expectedTotalSeasonRevenue, season.getGamesRevenue());

		}
		catch(AssertionError e)
		{
			e.getMessage();
			fail("Expected values do not match the actual ones.");
		}
			}

}
