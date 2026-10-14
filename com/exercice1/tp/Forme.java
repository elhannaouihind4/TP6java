package com.exercice1.tp;

public class Forme {
	protected String couleur;
	

	public Forme(String couleur) {
		super();
		this.couleur = couleur;
	}


	public void dessiner() {
		System.out.println("Dessiner une forme de couleur " + couleur);
		
	}


	 
	public double aire() {
		return 0;
	}


	
	
	
	
	

}
