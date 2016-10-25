package org.globant.topic4.ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DecimalFormat;

import com.mysql.jdbc.Statement;

public class Ex05 {
	public static void main (String[] args ){
		
		String name = null,lastName = null, course = null, day=null ;
		Time startHour,finishHour;
		
		
		try{
			System.out.println("trying to connect to the server ");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/highschool", "root", "Globant2016");
			System.out.println("successful connection");
			
			Statement state = (Statement) con.createStatement();
			ResultSet result = state.executeQuery("select course.name , teacher.name, teacher.lastName,schudele.day, schudele.startHour,schudele.finishHour from schudele, course ,teacher where teacher.idteacher =course.idteacher and schudele.idcourse =course.idcourse;"  );
			
			while (result.next()){
				name =result.getString("teacher.name");
				lastName =result.getString("teacher.lastName");
				course =result.getString("course.name");
				day =result.getString("schudele.day");
				startHour = result.getTime("schudele.startHour");
				finishHour = result.getTime("schudele.finishHour");
				
				System.out.println("name :"+ name +" last name: "+ lastName+ " course: "+ course+ " day: "+ day +"start hour " + startHour+ " finish hour: "+ finishHour  );
				
				}
			
			 
				
			
	
		}
		catch(SQLException e){
			System.out.println("mySql error");
		}
		
		
	}
}