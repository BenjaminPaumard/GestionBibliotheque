package bibliotheque;
import java.awt.Dimension;

import javax.swing.*;

@SuppressWarnings("serial")
public class Fenetre extends JFrame{
  private JPanel pan = new JPanel();

  private JButton bouton = new JButton("Mon bouton");


  public static void main(String[] args) {
    new Fenetre();
  }
  
  public Fenetre(){
	JTextField textField = new JTextField();
	textField.setPreferredSize( new Dimension( 50, 20 ) );
	pan.add(textField);
	JLabel lab = new JLabel("Test");

	pan.add(lab);
    this.setTitle("Animation");
    this.setSize(300, 150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    //Ajout du bouton à notre content pane
    pan.add(bouton);
    this.setContentPane(pan);
    this.setVisible(true);
  }       
}