package com.exercice1.tp;

public class Carre extends Forme {
	private double cote;

	public Carre(String couleur, double cote) {
		super(couleur);
		this.cote = cote;
	}

	@Override
	public void dessiner() {
		System.out.println("Dessiner un carre de couleur " 
	            + couleur +  " et de côté " + cote);
		

	}

	@Override
	public double aire() {
		return cote *cote;
	}
	
	
	
}
