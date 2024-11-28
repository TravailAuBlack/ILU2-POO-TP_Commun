package model;

public class ReservationHotel extends Reservation {
	private int nbLitsSimple;
	private int nbLitsDouble;
	private int numChambre;
	
	
	public ReservationHotel (int jour, int mois, int nbLitsSimple, int nbLitsDouble, int numChambre) {
		super(jour,mois);
		this.nbLitsSimple = nbLitsSimple;
		this.nbLitsDouble = nbLitsDouble;
		this.numChambre = numChambre;
		
	}
	
	public String toString() {
		return "Le " + jour+"/"+mois + " : chambre numero " + numChambre + " avec "+nbLitsSimple +
				" lits simple et "+ nbLitsDouble + " lits double .\n" ;
	}
	
	
	

}
