package model;
import java.util.ArrayList;
import sqlite.*;

public class Model {
	//---set DB---//
	public SqliteDB db;
	//---set stadium---//
	public Stadium stadium;
	//-----------------//
	//---set users---//
	public User user[];
	public User signInUser;
	private int userSize;
	//---------------//
	//---set seasons---//
	public ArrayList<Season> season = new ArrayList<Season>();
//	public Season season[];
	public int seasonSize;
	//---------------//
	//---set sponsors---//
	public ArrayList<Sponsor> sponsors = new ArrayList<Sponsor>();
	public int sponsorsSize;
	//-----------------//
	//---set security---//
	public ArrayList<Security> security = new ArrayList<Security>();
	public int securitySize;
	//--set maintenance--//
	public ArrayList<Maintenance> maintenance = new ArrayList<Maintenance>();
	public int maintenanceSize;
	
	public Model() {
		//set DB:
		db = SqliteDB.getInstance();
		// set stadium:
		db.initializeStadium();
		stadium = db.stadium;
		//set users:
		user=db.initializeUsers();
		userSize=db.userSize;
		//set seasons:
		this.season=db.initializeSeasons();
		seasonSize=db.seasonSize;
		
		this.sponsors=db.initializeSponsors();
		sponsorsSize=db.sponsorsSize;
		
		this.security=db.initializeSecurity();
		securitySize=db.securitySize;
		
		this.maintenance=db.initializeMaintenance();
		maintenanceSize=db.maintenanceSize;
	}
	
	//---methods---//
	
	public boolean isUserNameExist(String userName) {
		for(int i=0; i<userSize; i++) {
			if (userName.equals(user[i].getUserName())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isUserExist(String userName, char[] password) {
		String temp = new String(password);
		for(int i=0; i<userSize; i++) {
			if (userName.equals(user[i].getUserName())&&temp.equals(user[i].getPassword())) {
				this.signInUser=user[i];
				return true;
			}
		}
		return false;
	}
	
	public void addUser(String userName, String firstName, String lastName, char[] pf_password, String email) {
		String password = new String(pf_password);
		user[userSize] = new User(userName, firstName, lastName, password, email);
		userSize++;
		db.createNewUserDB(userName, firstName, lastName, pf_password, email);
		
	}
	//create methods:
	
	public void createNewSeason(String name, String leagueName) {
		this.season.add(new Season(name, leagueName));
		this.seasonSize++;
		db.createNewSeasonDB(name, leagueName);
	}
	
	public void createNewSponsor(String name, String contractStartDate, String contractEndDate, float totalContractValue) {

		this.sponsors.add(new Sponsor(name, contractStartDate, contractEndDate, totalContractValue));
		this.sponsorsSize++;
		db.createNewSponsorDB(name, contractStartDate,contractEndDate,totalContractValue);
	}

	public void createNewSecurity(String name, String contractStartDate, String jobDescription, float salary) {
		this.security.add(new Security(name, contractStartDate, jobDescription, salary, this.stadium));
		this.securitySize++;
		db.createNewSecurityDB(name, contractStartDate,jobDescription,salary);
	}
	
	public void createNewMaintenance(String name, String maintenanceStartdate, String maintenanceReason, int priority) {
		this.maintenance.add(new Maintenance(name, maintenanceStartdate, maintenanceReason, priority, this.stadium));
		this.maintenanceSize++;
		db.createNewMaintenanceDB(name, maintenanceStartdate,maintenanceReason,priority);
	}

	public void createNewGame(String name, String date,int seasonIndex, int sadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
		this.season.get(seasonIndex).createGame(name, date, sadiumCapacity, vipTicketPrice, clubLevelTicketPrice, bleachersTicketPrice, seasonTicketPrice, stadium);
		db.createGameDB(name, date, this.season.get(seasonIndex),this.season.get(seasonIndex).games.get(this.season.get(seasonIndex).getNumOfGames()-1));
	}
	
	//update methods:
	
	public void updateGameSection(int gameSectionIndex, int gameIndex, int seasonIndex, int numOfSoldTickets) {
		season.get(seasonIndex).games.get(gameIndex).gameSections.get(gameSectionIndex-1).setSoldTickets(numOfSoldTickets);
		db.updateGameSectionSoldTicketsDB(season.get(seasonIndex).games.get(gameIndex).gameSections.get(gameSectionIndex-1).getSoldTickets(), season.get(seasonIndex).getName(), season.get(seasonIndex).games.get(gameIndex).getName(), gameSectionIndex);
	}
	
	public void updateTicketPrice(float newVipPrice,float newClubLevelPrice, float newBleachersPrice) {
		this.stadium.updateTicketPriceInAllSections(newVipPrice, newClubLevelPrice, newBleachersPrice);
		db.updateSectionPrice(newVipPrice, newClubLevelPrice, newBleachersPrice);
	}
	
	//delete methods:
	
	public void deleteGivenSecurity(int index) {
		this.security.remove(index);
		this.securitySize--;
	}
	
	public void deleteGivenMaintenace(int index) {
		this.maintenance.remove(index);
		this.maintenanceSize--;
	}
	
	public void deleteGivenSponsor(int index) {
		this.sponsors.remove(index);
		this.sponsorsSize--;
	}
	
}
