package bibliotheque;

import java.sql.*;
import java.util.ArrayList;

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
		this.quantite = quantite;
	}
	
	public boolean getDisponible(){
		return this.disponible;
	}
	

	
	public static String rechercher(String nomlivre)
	{
		ArrayList<String> booksList = new ArrayList<String>();
		try
        {           
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from book Where Wording like '%"+nomlivre+"%'");
            
            while(rs.next())
            {
            	System.out.println(rs.getString("Wording"));
                booksList.add(rs.getString("Wording"));
            	ResultSet rsa=st.executeQuery("select * from author Where PK_ID like '"+rs.getInt("FK_ID_Author")+"'");
            	if(rsa.next()) {
            		System.out.println(rsa.getString("First_Name"));
            		System.out.println(rsa.getString("Last_Name"));
            	}
            	Auteur auteur = new Auteur(rsa.getString("First_Name"),rsa.getString("Last_Name"));
            }
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }
		Fenetre.rechercherList(booksList,nomlivre);
		return "temp";
	}
	
	
	public void louercalcul()
	{
		//depuis la classe client !
		this.quantite -= 1;
		if(this.quantite == 0) {
			this.disponible = false;
		}
	}
	
	public static void main(String[] args) {
		

	}

}
