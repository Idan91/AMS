package sqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;

public class SqliteDB {
	private static SqliteDB instance=null;
	Connection c = null;
	Statement stmt = null;
	
	public Stadium stadium;
	public int userSize=0;
	public Section[] section;
	public int sectionSize=0;
	public int seasonSize=0;
	public int sponsorsSize=0;
	public int securitySize=0;
	public int maintenanceSize=0;
	//Constructor:
	private SqliteDB() {
		//try to connect to DB:
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:AMS_DB.sqlite");
			System.out.println("Connected Successfully to DB");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// get instance to initialize DB:
	public static SqliteDB getInstance() {
		if (instance==null) {
			instance = new SqliteDB();
		}
		return instance;
	}
	
	// Methods:
	
	// initialize methods:
	public User[] initializeUsers() {
		
		User[] user=null;

		try {

			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from User");
			
			user = new User[100];
			userSize=0;
			while(rs.next()) {
				user[userSize]=new User(rs.getString("userName"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("password"), rs.getString("email"));
				userSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return user;

	}
	
	public void initializeStadium () {
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Stadium");
			int stadiNumOfSeats=0;
			initializeSections();
			for (int i = 0; i < this.sectionSize; i++) {
				stadiNumOfSeats+=section[i].getNumOfSeats();
			}
			this.stadium = Stadium.getInstance(Integer.parseInt(rs.getString("stadiumId")), rs.getString("stadiumName"), rs.getString("homeTeam"), stadiNumOfSeats, rs.getString("address"),Integer.parseInt(rs.getString("numOfSections")), section);

			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void initializeSections() {
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Section");
			
			while(rs.next()) {
				sectionSize++;
			}
			rs = stmt.executeQuery("select * from Section");
			section = new Section[sectionSize];
			sectionSize=0;
			while(rs.next()) {
				this.section[sectionSize]=new Section(Integer.parseInt(rs.getString("sectionNumber")), rs.getString("sectionName"), rs.getString("sectionRanking"), Float.parseFloat(rs.getString("ticketPrice")), rs.getBoolean("isRoofed"), Integer.parseInt(rs.getString("numOfSeats")), rs.getString("sectionType"));
				sectionSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public ArrayList<Season> initializeSeasons() {
		ArrayList<Season> season=null;
//		Season[] season=null;
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Season");
			while(rs.next()) {
				seasonSize++;
			}
			rs = stmt.executeQuery("select * from Season");
			season = new ArrayList<Season>();
			seasonSize=0;
			while(rs.next()) {
				season.add(new Season(rs.getString("name"), rs.getString("leagueName")));
				season.get(seasonSize).games=initializeGames(season.get(seasonSize));
				seasonSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return season;
	}

	public ArrayList<Sponsor> initializeSponsors() {
		ArrayList<Sponsor> sponsors=null;
		try {
			this.stmt=c.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Sponsor");
			while(rs.next()) {
				sponsorsSize++;
			}
			rs=stmt.executeQuery("select * from Sponsor");
			sponsors=new ArrayList<Sponsor>();
			sponsorsSize=0;
			while(rs.next()) {
				sponsors.add(new Sponsor(rs.getString("name"), rs.getString("contractStartDate"),rs.getString("contractEndDate"),rs.getFloat("totalContractValue")));
				sponsorsSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return sponsors;
	}
	
	public ArrayList<Security> initializeSecurity() {
		ArrayList<Security> security=null;
		try {
			this.stmt=c.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Security");
			while(rs.next()) {
				securitySize++;
			}
			rs=stmt.executeQuery("select * from Security");
			security=new ArrayList<Security>();
			securitySize=0;
			while(rs.next()) {
				security.add(new Security(rs.getString("name"), rs.getString("contractStartDate"),rs.getString("jobDescription"),rs.getFloat("salary"), this.stadium));
				securitySize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return security;
	}
	
	public ArrayList<Maintenance> initializeMaintenance() {
		ArrayList<Maintenance> maintenance=null;
		try {
			this.stmt=c.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Maintenance");
			while(rs.next()) {
				maintenanceSize++;
			}
			rs=stmt.executeQuery("select * from Maintenance");
			maintenance=new ArrayList<Maintenance>();
			maintenanceSize=0;
			while(rs.next()) {
				maintenance.add(new Maintenance(rs.getString("name"), rs.getString("maintenanceStartdate"),rs.getString("maintenanceReason"),rs.getInt("priority"), this.stadium));
				maintenanceSize++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return maintenance;
	}
	
	public ArrayList<Game> initializeGames(Season season) {
		ArrayList<Game> game=null;
		int index=0;
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Game where season='"+season.getName()+"'");
			while(rs.next()) {
				index++;
			}
			season.setNumOfGames(index);
			rs = stmt.executeQuery("select * from Game where season='"+season.getName()+"'");
			game = new ArrayList<Game>();
			index=0;
			while(rs.next()) {
				game.add(new Game(rs.getString("name"), rs.getString("date"),this.stadium.getCapacity(), 100, 50, 20, 300, this.stadium));
				game.get(index).gameSections=initializeGameSections(game.get(index), season);
				index++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return game;
	}
	public ArrayList<GameSection> initializeGameSections(Game game, Season season) {
		ArrayList<GameSection> gameSection=null;
		int index=0;
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from GameSection where game='"+game.getName()+"' and seasonName='"+season.getName()+"'");
			while(rs.next()) {
				index++;
			}
			rs = stmt.executeQuery("select * from GameSection where game='"+game.getName()+"' and seasonName='"+season.getName()+"'");
			gameSection = new ArrayList<GameSection>();
			index=0;
			while(rs.next()) {
				gameSection.add(new GameSection(stadium.getArenaSection(rs.getInt("sectionNumber")-1/* to set the index and not the number */), rs.getInt("soldTickets")));
				setTotalRevenue(season, game, gameSection.get(index), index);
				index++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
		return gameSection;
	}
	
	//create methods:
	public void createNewUserDB(String userName, String firstName, String lastName, char[] pf_password, String email) {
		try {
			this.stmt = c.createStatement();
			String password = new String(pf_password);
			System.out.println("insert into User values('"+userName+"', '"+firstName+"', '"+lastName+"', '"+password+"', '"+email+"')");
			stmt.executeUpdate("insert into User values('"+userName+"', '"+firstName+"', '"+lastName+"', '"+password+"', '"+email+"')");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void createNewSeasonDB(String name, String leagueName) {
		try {
			this.stmt = c.createStatement();
			System.out.println("insert into Season values('"+name+"', '"+leagueName+"', "+0+", "+0+")");
			stmt.executeUpdate("insert into Season values('"+name+"', '"+leagueName+"', "+0+", "+0+")");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void createNewSponsorDB(String name, String contractStartDate, String contractEndDate, float totalContractValue) {
		try {
			this.stmt = c.createStatement();
			System.out.println("insert into Sponsor values('"+name+"', '"+contractStartDate+"', '"+contractEndDate+"', "+totalContractValue+")");
			stmt.executeUpdate("insert into Sponsor values('"+name+"', '"+contractStartDate+"', '"+contractEndDate+"', "+totalContractValue+")");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void createNewSecurityDB(String name, String contractStartDate, String jobDescription, float salary) {
		try {
			this.stmt = c.createStatement();
			System.out.println("insert into Security values('"+name+"', '"+contractStartDate+"', '"+jobDescription+"', "+salary+")");
			stmt.executeUpdate("insert into Security values('"+name+"', '"+contractStartDate+"', '"+jobDescription+"', "+salary+")");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void createNewMaintenanceDB(String name, String maintenanceStartdate, String maintenanceReason, int priority) {
		try {
			this.stmt = c.createStatement();
			System.out.println("insert into Maintenance values('"+name+"', '"+maintenanceStartdate+"', '"+maintenanceReason+"', "+priority+")");
			stmt.executeUpdate("insert into Maintenance values('"+name+"', '"+maintenanceStartdate+"', '"+maintenanceReason+"', "+priority+")");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void createGameDB(String name, String date, Season season, Game game) {
		try {
			this.stmt = c.createStatement();
			System.out.println("insert into Game values('"+name+"', '"+date+"', "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", '"+season.getName()+"')"); //Initialize values to 0 in the DB
			stmt.executeUpdate("insert into Game values('"+name+"', '"+date+"', "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", "+0+", '"+season.getName()+"')");
			createGameSectionsDB(game ,season);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	public void createGameSectionsDB(Game game, Season season) {
		try {
			this.stmt = c.createStatement();
			for (int i = 0; i < stadium.getNumOfSections(); i++) {
				System.out.println("insert into GameSection values("+(i+1)+", '"+game.getName()+"', "+game.gameSections.get(i).getSoldTickets()+", '"+season.getName()+"')");
				stmt.executeUpdate("insert into GameSection values("+(i+1)+", '"+game.getName()+"', "+game.gameSections.get(i).getSoldTickets()+", '"+season.getName()+"')");

			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	// delete methods:
	public void deleteGivenSponsorDB(String name) {
		try {
			if(name!="") {
			this.stmt =c.createStatement();
			System.out.println("delete from Sponsor where name=('"+name+"')");
			stmt.executeUpdate("delete from Sponsor where name=('"+name+"')");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void deleteGivenSecurityDB(String name) {
		try {
			if(name!="") {
			this.stmt =c.createStatement();
			System.out.println("delete from Security where name=('"+name+"')");
			stmt.executeUpdate("delete from Security where name=('"+name+"')");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void deleteGivenMaintenaceDB(String name) {
		try {
			if(name!="") {
			this.stmt =c.createStatement();
			System.out.println("delete from Maintenance where name=('"+name+"')");
			stmt.executeUpdate("delete from Maintenance where name=('"+name+"')");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	
	//update methods:
	public void updateProperties(int stadiumIdToUpdate, String stadiumName, String homeTeam, int capacity, String address, int numOfSections) {
		try {
			this.stmt = c.createStatement();
			System.out.println("update Stadium set stadiumName='"+stadiumName+"', homeTeam='"+homeTeam+"', capacity="+capacity+", address='"+address+"', numOfSections="+numOfSections+" where stadiumId="+stadiumIdToUpdate);
			stmt.executeUpdate("update Stadium set stadiumName='"+stadiumName+"', homeTeam='"+homeTeam+"', capacity="+capacity+", address='"+address+"', numOfSections="+numOfSections+" where stadiumId="+stadiumIdToUpdate);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	
	public void updateSections(int sectionNumToUpdate, String newSectionType, int newNumOfSeats, String newIsRoofed, String newSectionRanking) {
		try {
			this.stmt = c.createStatement();
			System.out.println("update Section set sectionType='"+newSectionType+"', numOfSeats="+newNumOfSeats+", isRoofed='"+newIsRoofed+"', sectionRanking='"+newSectionRanking+"' where sectionNumber="+sectionNumToUpdate);
			stmt.executeUpdate("update Section set sectionType='"+newSectionType+"', numOfSeats="+newNumOfSeats+", isRoofed='"+newIsRoofed+"', sectionRanking='"+newSectionRanking+"' where sectionNumber="+sectionNumToUpdate);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	public void updateSectionPrice(float newVipPrice,float newClubLevelPrice, float newBleachersPrice) {
		try {
			this.stmt = c.createStatement();
			System.out.println("update Section set ticketPrice="+newVipPrice+" where sectionType='VIP'");
			stmt.executeUpdate("update Section set ticketPrice="+newVipPrice+" where sectionType='VIP'");
			System.out.println("update Section set ticketPrice="+newClubLevelPrice+" where sectionType='Club Level'");
			stmt.executeUpdate("update Section set ticketPrice="+newClubLevelPrice+" where sectionType='Club Level'");
			System.out.println("update Section set ticketPrice="+newBleachersPrice+" where sectionType='Bleachers'");
			stmt.executeUpdate("update Section set ticketPrice="+newBleachersPrice+" where sectionType='Bleachers'");
		
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	
	
	public void updateGameSectionSoldTicketsDB(int totalSoldTickets, String seasonName, String gameName, int sectionNumber) {
		try {
			this.stmt = c.createStatement();
			System.out.println("update gameSection set soldTickets="+totalSoldTickets+" where game='"+gameName+"' and seasonName='"+seasonName+"' and sectionNumber="+sectionNumber);
			stmt.executeUpdate("update gameSection set soldTickets="+totalSoldTickets+" where game='"+gameName+"' and seasonName='"+seasonName+"' and sectionNumber="+sectionNumber);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}
	// other methods:
	public void setTotalRevenue(Season season, Game game, GameSection gameSection, int index){
		//set the total revenue and sold tickets from DB:
		if(gameSection.getSectionType().equals("VIP")) {
			game.setVipTicketsSold(gameSection.getSoldTickets());
			float vipRevenue = gameSection.getSoldTickets()*this.stadium.getArenaSection(index).getTicketPrice();
			game.setVipRevenue(vipRevenue);
			game.setTotalSingleTickets(gameSection.getSoldTickets());
			game.setSingleTicketsRevenue(vipRevenue);
		}
		else if(gameSection.getSectionType().equals("Bleachers")) {
			game.setBleachersTicketsSold(gameSection.getSoldTickets());
			float bleachersRevenue = gameSection.getSoldTickets()*this.stadium.getArenaSection(index).getTicketPrice();
			game.setBleachersRevenue(bleachersRevenue);
			game.setTotalSingleTickets(gameSection.getSoldTickets());
			game.setSingleTicketsRevenue(bleachersRevenue);
		}
		else {
			game.setClubLevelTicketsSold(gameSection.getSoldTickets());
			float clublevelRevenue = gameSection.getSoldTickets()*this.stadium.getArenaSection(index).getTicketPrice();
			game.setClubLevelRevenue(clublevelRevenue);
			game.setTotalSingleTickets(gameSection.getSoldTickets());
			game.setSingleTicketsRevenue(clublevelRevenue);
			}
	}

	
	// close connection:
	public void closeConnection() {
		try {
			c.close();

		} catch (Exception e) {
			System.out.println("Failed to close the connection to DB");
		}
	}
	
}
