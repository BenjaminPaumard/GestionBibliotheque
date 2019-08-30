package bibliotheque;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Fenetre extends JFrame{

  public static void main(String[] args) {
    new Fenetre();
  }
  
  public Fenetre(){
  	JPanel pan = new JPanel();

  	JButton bouton = new JButton("Rechercher");
	JTextField textField = new JTextField();
	textField.setPreferredSize( new Dimension( 50, 20 ) );
	pan.add(textField);
    this.setTitle("Par titre de livre");
    this.setSize(300, 150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);


    bouton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        	String x = textField.getText();
        	Livre.rechercher(x);
        }
    });
    
    pan.add(bouton);
    this.setContentPane(pan);
    this.setVisible(true);
  }  
  
  public static String rechercherList(ArrayList array,String nomlivre)
	{
	  Fenetre searchResult = new Fenetre();
	  JPanel pan = new JPanel();
	  	JButton bouton = new JButton("Rechercher");
		JTextField textField = new JTextField();
		textField.setPreferredSize( new Dimension( 50, 20 ) );
		pan.add(textField);
		JLabel lab = new JLabel("Resultat de votre recherche : "+nomlivre);

		pan.add(lab);
		searchResult.setTitle("Résultat recherche");
	    for (int i = 0; i < array.size(); i++) {
	    	JLabel labList = new JLabel(array.get(i).toString()+ System.lineSeparator());
			pan.add(labList);
	      }
		searchResult.setSize(300, 150);
		searchResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		searchResult.setLocationRelativeTo(null);


	    bouton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	String x = textField.getText();
	        	Livre.rechercher(x);
	        }
	    });
	    
	    pan.add(bouton);
	    searchResult.setContentPane(pan);
	    searchResult.setVisible(true);

		return "coucou";
	}
  
  
}