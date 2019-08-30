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
   // this.setTitle("Par titre de livre");
    this.setSize(800, 500);
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
	  	pan.add(bouton);
	  	pan.setLayout(null);
	  	bouton.setBounds(100, 100, 100, 100);
		JTextField textField = new JTextField();
		textField.setPreferredSize( new Dimension( 100, 50 ) );
		textField.setLocation(27, 200);
		pan.add(textField);
		JLabel lab = new JLabel("Resultat de votre recherche : "+nomlivre);
		pan.add(lab);
		lab.setLocation(27, 200);
		lab.setSize(400, 14);
		

		searchResult.setTitle("R�sultat recherche");
		int coo = 220;
	    for (int i = 0; i < array.size(); i++) {
	    	
	    	JLabel labList = new JLabel("<html>"+array.get(i).toString()+"<br/></html>");
			pan.add(labList);
			labList.setLocation(27, coo);
			labList.setSize(400, 14);
			coo += 20;
	      }
		searchResult.setSize(800, 500);
		searchResult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		searchResult.setLocationRelativeTo(null);
		String author = null;
		try
        {           
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from book Where Wording like '%"+nomlivre+"%'");
            
            while(rs.next())
            {
            	
            }
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }

	    bouton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	String x = textField.getText();
	        	Livre.rechercher(x);
	        }
	    });
	    
	    
	    searchResult.setContentPane(pan);
	    searchResult.setVisible(true);

		return "coucou";
	}
  
  
}