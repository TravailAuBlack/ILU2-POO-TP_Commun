package model;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois, int zone, int numChaise) {
		super(jour,mois);
		this.numZone = zone;
		this.numChaise = numChaise;
	}
	
	
	public String toString() {
		return "Le " + jour +"/"+mois +" : place dans la zone  "+ numZone + " a la chaise "+ numChaise +".\n"; 
	}

}
