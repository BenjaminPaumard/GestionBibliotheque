package bibliotheque;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Fenetre extends JFrame{

  public static void main(String[] args) {
    new Fenetre();
  }
  
  public Fenetre(){
  	JPanel pan = new JPanel();

  	JButton bouton = new JButton("Mon bouton");
	JTextField textField = new JTextField();
	textField.setPreferredSize( new Dimension( 50, 20 ) );
	pan.add(textField);
	JLabel lab = new JLabel("Test");

	pan.add(lab);
    this.setTitle("Animation");
    this.setSize(300, 150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);


    bouton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        	String x = textField.getText();
        	System.out.println (x);
        }
    });
    
    pan.add(bouton);
    this.setContentPane(pan);
    this.setVisible(true);
  }       
}