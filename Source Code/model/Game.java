package model;

import java.util.ArrayList;

public class Game {
	private String name;
	private String date;
	public ArrayList<GameSection> gameSections;
	private int stadiumCapacity;
	private int unsoldTickets;
	private int soldTickets;               // for the attendance in sale panel
	private int vipTicketsSold;
	private int clubLevelTicketsSold;
	private int bleachersTicketsSold;
	private int totalSingleTickets;        // club+bleachers+vip
	
	private float vipTicketPrice;
	private float clubLevelTicketPrice;
	private float bleachersTicketPrice;
	
	private float vipRevenue;
	private float clubLevelRevenue;
	private float bleachersRevenue;
	private float singleTicketsRevenue; // club+bleachers+vip revenue
	private float totalGameRevenue;
	//Constructor
		public Game (String name, String date, int stadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
			this.name=name;
			this.date=date;
			this.unsoldTickets=stadiumCapacity;
			this.soldTickets=0;
			this.vipTicketsSold=0;
			this.clubLevelTicketsSold=0;
			this.bleachersTicketsSold=0;
			this.totalSingleTickets=0;
			this.totalGameRevenue=0;
			this.vipTicketPrice=vipTicketPrice;
			this.clubLevelTicketPrice=clubLevelTicketPrice;
			this.bleachersTicketPrice=bleachersTicketPrice;
			this.gameSections=new ArrayList<GameSection>();
			for (int i = 0; i < stadium.getNumOfSections(); i++) {
				gameSections.add(new GameSection(stadium.getArenaSection(i), 0));
			}
		}
		
		//Methods
		public void vipTicketsSold(int numOfTicketsSold, int sectionIndex) {
			this.vipTicketsSold+=numOfTicketsSold;
			this.vipRevenue+=(numOfTicketsSold*vipTicketPrice);
			this.totalGameRevenue+=this.vipRevenue;
			this.unsoldTickets-=numOfTicketsSold;
			this.soldTickets+=numOfTicketsSold;
			this.totalSingleTickets+=numOfTicketsSold;
			this.singleTicketsRevenue+=this.vipRevenue;
		}
		public void clubLevelTicketsSold(int numOfTicketsSold, int sectionIndex) {
			this.clubLevelTicketsSold+=numOfTicketsSold;
			this.clubLevelRevenue+=(numOfTicketsSold*clubLevelTicketPrice);
			this.totalGameRevenue+=this.clubLevelRevenue;
			this.unsoldTickets-=numOfTicketsSold;
			this.soldTickets+=numOfTicketsSold;
			this.totalSingleTickets+=numOfTicketsSold;
			this.singleTicketsRevenue+=this.clubLevelRevenue;

		}
		public void bleachersTicketsSold(int numOfTicketsSold, int sectionIndex) {
			this.bleachersTicketsSold+=numOfTicketsSold;
			this.bleachersRevenue+=(numOfTicketsSold*bleachersTicketPrice);
			this.totalGameRevenue+=this.bleachersRevenue;
			this.unsoldTickets-=numOfTicketsSold;
			this.soldTickets+=numOfTicketsSold;
			this.totalSingleTickets+=numOfTicketsSold;
			this.singleTicketsRevenue+=this.bleachersRevenue;

		}

		public String getName() {
			return this.name;
		}
		public int getVipTicketsSold() {
			return this.vipTicketsSold;
		}
		public int getClubLevelTicketsSold() {
			return this.clubLevelTicketsSold;
		}
		public int getBleachersTicketsSold() {
			return this.bleachersTicketsSold;
		}

		public float getVipRevenue() {
			return vipRevenue;
		}

		public float getClubLevelRevenue() {
			return clubLevelRevenue;
		}

		public float getBleachersRevenue() {
			return bleachersRevenue;
		}

		public float getTotalGameRevenue() {
			return totalGameRevenue;
		}

		public int getStadiumCapacity() {
			return stadiumCapacity;
		}

		public int getUnsoldTickets() {
			return unsoldTickets;
		}

		public int getSoldTickets() {
			return soldTickets;
		}

		

		public float getSingleTicketsRevenue() {
			return singleTicketsRevenue;
		}

		public String getDate() {
			return date;
		}

		public int getTotalSingleTickets() {
			return totalSingleTickets;
		}

		public void setTotalSingleTickets(int totalSingleTickets) {
			this.totalSingleTickets += totalSingleTickets;
		}

		public void setVipTicketsSold(int vipTicketsSold) {
			this.vipTicketsSold += vipTicketsSold;
		}

		public void setClubLevelTicketsSold(int clubLevelTicketsSold) {
			this.clubLevelTicketsSold += clubLevelTicketsSold;
		}

		public void setBleachersTicketsSold(int bleachersTicketsSold) {
			this.bleachersTicketsSold += bleachersTicketsSold;
		}

		public void setVipRevenue(float vipRevenue) {
			this.vipRevenue += vipRevenue;
		}

		public void setClubLevelRevenue(float clubLevelRevenue) {
			this.clubLevelRevenue += clubLevelRevenue;
		}

		public void setBleachersRevenue(float bleachersRevenue) {
			this.bleachersRevenue += bleachersRevenue;
		}

		public void setSingleTicketsRevenue(float singleTicketsRevenue) {
			this.singleTicketsRevenue += singleTicketsRevenue;
		}

		
}