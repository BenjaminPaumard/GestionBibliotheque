package bibliotheque;

import java.sql.*;

public class Livre {
	private String titre;
	private Auteur auteur;
	private String editeur;
	private Date datesortie;
	private int quantite;
	private boolean disponible;
	
	public Livre(String titre, Auteur auteur, String editeur, Date datesortie , int quantite , boolean disponible)
	{
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.datesortie = datesortie;
		this.quantite = quantite;
		this.disponible = disponible;
	}
	
	public String getTitre(){
		return this.titre;
	}
	
	public void setTitre(String titre){
		this.titre = titre;
	}
	
	public Auteur getAuteur(){
		return this.auteur;
	}
	
	public void setAuteur(Auteur auteur){
		this.auteur = auteur;
	}
	
	public String getEditeur(){
		return this.editeur;
	}
	
	public void setEditeur(String editeur){
		this.editeur = editeur;
	}
	
	public Date getDatesortie(){
		return this.datesortie;
	}
	
	public void setDatesortie(Date datesortie){
		this.datesortie = datesortie;
	}
	
	public int getQuantite(){
		return this.quantite;
	}
	
	public void setQuantite(int quantite){
		this.titre = quantite;
	}
	
	public boolean getDisponible(){
		return this.disponible;
	}
	

	
	public void rechercher(nomlivre)
	{
		
		
	}
	
	public void louercalcul()
	{
		//depuis la classe client !
		this.quantite -= 1;  
	}
	
	public static void main(String[] args) {
		

	}

}
