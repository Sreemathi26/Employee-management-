package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.sql.*;
public class ConnectionProvider{
	public static Connection getCon()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","Suba@3107");
			return con;
			
			
			
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
}