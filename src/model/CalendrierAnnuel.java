package model;

public class CalendrierAnnuel {
	private Mois[] mois;
	
	public CalendrierAnnuel() {
        this.mois = new Mois[12];
        
        
        this.mois[0] = new Mois("Janvier", 31);
        this.mois[1] = new Mois("Février", 28);
        this.mois[2] = new Mois("Mars", 31);
        this.mois[3] = new Mois("Avril", 30);
        this.mois[4] = new Mois("Mai", 31);
        this.mois[5] = new Mois("Juin", 30);
        this.mois[6] = new Mois("Juillet", 31);
        this.mois[7] = new Mois("Août", 31);
        this.mois[8] = new Mois("Septembre", 30);
        this.mois[9] = new Mois("Octobre", 31);
        this.mois[10] = new Mois("Novembre", 30);
        this.mois[11] = new Mois("Décembre", 31);
	}
	
	public boolean estLibre(int jour, int moi) {
		return mois[moi-1].estLibre(jour);
	}
	
	public boolean reserver(int jour , int moi) {
		return mois[moi-1].reserver(jour);
	}
	
	
	
	private class Mois{
		private String nom;
		private boolean[] jours;
		
		public Mois(String nom, int jour ) {
			this.nom = nom;
			this.jours = new boolean[jour];
			for(int i = 0; i<jour; i++)
				jours[i] = true;
		}
		
		public boolean estLibre(int jour) {
			return jours[jour -1];
		}
		
		
		 boolean reserver(int jour) {
			if(!estLibre(jour)) {
				throw new IllegalStateException("Le jour choisi n'est pas disponible \n");
				
			}
			return estLibre(jour);
		}
		
		
	}

}
