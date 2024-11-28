package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTableReserve;
	
	
	public ReservationRestaurant( int jour, int mois,int numService, int numTable) {
		super(jour,mois);
		this.numService = numService;
		this.numTableReserve = numTable;
	}
	
	
	public String toString() {
		return "Le " + jour +"/"+mois +"\nTable " + numTableReserve + " pour le service "+ numService + ".";
	}
	
	
//	public class ReservationHotel extends Reservation{
//		private int nbLitsSimple;
//		private int nbLitsDouble;
//		private int numChambre;
//		
//		
//		public ReservationHotel (int jour, int mois, int nbLitsSimple, int nbLitsDouble, int numChambre) {
//			super(jour,mois);
//			this.nbLitsSimple = nbLitsSimple;
//			this.nbLitsDouble = nbLitsDouble;
//			this.numChambre = numChambre;
//			
//		}
//		
//		public String toString() {
//			return "Le " + jour+"/"+mois + " : chambre numero " + numChambre + " avec "+nbLitsSimple +
//					" lits simple et "+ nbLitsDouble + " lits double .\n" ;
//		}
//	}
//	
//	
//	public class ReservationSpectacle extends Reservation{
//		private int numZone;
//		private int numChaise;
//		
//		public ReservationSpectacle(int jour, int mois, int zone, int numChaise) {
//			super(jour,mois);
//			this.numZone = zone;
//			this.numChaise = numChaise;
//		}
//		
//		
//		public String toString() {
//			return "Le " + jour +"/"+mois +" : place dans la zone  "+ numZone + " a la chaise "+ numChaise +".\n"; 
//		}
//
//	}
//	
	

}
