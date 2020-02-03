package model;

public class Stadium {
	private static Stadium instance=null;
	private int stadiumId;
	private String stadiumName;
	private String homeTeam;
	private int capacity;
	private String address;
	private Section[] arenaSection; //should we change it to list?
	private int numOfSections;

	// Constructor:
	private Stadium(int stadiumId, String stadiumName, String homeTeam, int capacity, String address, int numOfSections, Section[] arenaSection) {
		this.stadiumId=stadiumId;
		this.stadiumName=stadiumName;
		this.homeTeam=homeTeam;
		this.capacity=capacity;
		this.address=address;
		this.numOfSections=numOfSections;
		this.arenaSection = arenaSection;

	}
	public static Stadium getInstance(int stadiumId, String stadiumName, String homeTeam, int capacity, String address, int numOfSections, Section[] arenaSection) {
		if (instance==null) {
			instance = new Stadium(stadiumId, stadiumName, homeTeam, capacity, address, numOfSections, arenaSection);
		}
		return instance;
	}
	// Data members getters and setters:
	public int getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int seatAdded) {
		this.capacity += seatAdded;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Section getArenaSection(int sectionNumber) {
		try
		{
			return this.arenaSection[sectionNumber];			
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public int getNumOfSections() {
		return numOfSections;
	}

	public void setNumOfSections(int numOfSections) {
		this.numOfSections = numOfSections;
	}
	public void updateTicketPriceInAllSections(float newVipPrice,float newClubLevelPrice, float newBleachersPrice) {
		for (int i = 0; i < this.numOfSections; i++) {
			if(this.arenaSection[i].getSectionType().equals("VIP")) {
				this.arenaSection[i].setTicketPrice(newVipPrice);
			}
			else if(this.arenaSection[i].getSectionType().equals("Club Level")) {
				this.arenaSection[i].setTicketPrice(newClubLevelPrice);
			}
			else {
				this.arenaSection[i].setTicketPrice(newBleachersPrice);
			}
		}
	}

}
