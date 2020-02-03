package model;

public class GameSection {

	@SuppressWarnings("unused")
	private int sectionNumber;
	private String sectionType;
	private int capacity;
	private int soldTickets;
	private int unsoldTickets;
	@SuppressWarnings("unused")
	private float ticketPrice;
	
	public GameSection(Section section, int soldTickets) {
		this.sectionNumber=section.getSectionNumber();
		this.sectionType=section.getSectionType();
		this.capacity=section.getNumOfSeats();
		this.ticketPrice=section.getTicketPrice();
		if(soldTickets!=0) {
			this.soldTickets=soldTickets;
		}
		else {
			this.soldTickets=0;
		}
		this.unsoldTickets=capacity;
		this.unsoldTickets=this.capacity-soldTickets;
	}

	public int getSoldTickets() {
		return soldTickets;
	}

	public void setSoldTickets(int soldTickets) {
		this.soldTickets+=soldTickets;
		this.unsoldTickets-=soldTickets;

	}

	public int getUnsoldTickets() {
		return unsoldTickets;
	}

	public String getSectionType() {
		return this.sectionType;
	}

}
