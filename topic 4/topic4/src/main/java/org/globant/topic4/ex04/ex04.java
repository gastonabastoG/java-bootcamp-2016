package org.globant.topic4.ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import com.mysql.jdbc.Statement;



public class ex04 {
	
	public static void main (String[] args ){
		int counter=0 , note=0;
		double promedy=0;
		try{
			System.out.println("trying to connect to the server ");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/highschool", "root", "Globant2016");
			System.out.println("successful connection");
			
			Statement state = (Statement) con.createStatement();
			ResultSet result = state.executeQuery("select final from notes");
			
			while (result.next()){
				note  = result.getInt("final");
				if (note>=6){
					counter++;
				}
			}
			 promedy = (counter /30);
			 
			 DecimalFormat decimal = new DecimalFormat("0.0000");

	//		 System.out.println(counter );
			 System.out.println("the promedy of aprubes is : " + decimal.format(promedy) );
				
			
			
		}
		catch(SQLException e){
			System.out.println("mySql error");
		}
		
		
	}

}
