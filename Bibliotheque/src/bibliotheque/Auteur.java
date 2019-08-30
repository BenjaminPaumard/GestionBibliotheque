package bibliotheque;

import java.util.ArrayList;

public class Auteur {
	private String nom;
	private String prenom;
	private ArrayList<Livre> listeLivreEcrit;
	
	
	public Auteur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void ecrireUnLivre(Livre livre) {
		this.listeLivreEcrit.add(livre);
	}
}
