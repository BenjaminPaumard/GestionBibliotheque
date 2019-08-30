package bibliotheque;

import java.util.ArrayList;

public class Client {
	private String nom;
	private String prenom;
	private ArrayList<Livre> listeLivreLouer;
	
	
	public Client(String nom, String prenom) {
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
	
	public void louerUnLivre(Livre livre) {
		this.listeLivreLouer.add(livre);
	}
	
	public void rendreLivre(int id){
		this.listeLivreLouer.remove(id);
	}
}
