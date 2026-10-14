package com.execice2.tp;

public class Podcast extends Audio {
	 private String hote;

	 public Podcast(String titre, int duree, String hote) {
		super(titre, duree);
		this.hote = hote;
	 }
	 
	 
	 @Override
		public void lire() {
			System.out.println("Lecture du podcast avec : " + hote);
		}
	 
	 public void stop() {
	        System.out.println("Arrêt du podcast : " + titre);
	    }

	 
	 
	 

}
