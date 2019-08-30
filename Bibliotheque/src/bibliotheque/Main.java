package bibliotheque;

import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	    JFrame fenetre = new JFrame();
	    fenetre.setVisible(true);
	    connectBdd();
	}
	
	
	public static void connectBdd()
	{
	 try
        {           
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from config");
            while(rs.next())
            {
                System.out.println(rs.getString("value"));
            }
        }
        catch(SQLException e)
        {
           System.out.println(e);
        }
	}
	


}
