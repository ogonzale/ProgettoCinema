package it.enaip.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.net.ssl.SSLEngineResult.Status;

import it.enaip.cinema.Film;


public class SalaCinematografica {

	public Optional<Film> find(String film_title) throws SQLException {
		Connection conn = null;
		ResultSet resultSet=null;
		PreparedStatement stmt=null;
		try {
			conn = DataSource.getConnection();
			stmt = conn
				.prepareStatement("SELECT film_title, genere, age, numerospettatori FROM salacinematografica WHERE film_title=?");

		int age = 0;
		int numerospettatori = 0;
		String genere ="";
		stmt.setString(1, film_title);
	    resultSet = stmt.executeQuery();

		if (resultSet.next()) {
			film_title = resultSet.getString(film_title);
			numerospettatori = resultSet.getInt(numerospettatori);
			genere = resultSet.getString(genere);
			age = resultSet.getInt("age");	
		}
		
		return Optional.of(new Film(film_title, numerospettatori, genere, age ));
		}finally {
			 try { resultSet.close(); } catch (Exception e) { /* ignored */ }
			 try { stmt.close(); } catch (Exception e) { /* ignored */ }
			 try { conn.close(); } catch (Exception e) { /* ignored */ }
		}
	}

	
	public List<Film> findAll() throws SQLException {
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet resultSet = null;
		Status type = null;
		List<Film> listfilm = new ArrayList<>();
		int age = 0;
		int numerospettatori = 0;
		String genere ="";
		String film_title ="";
		try {
		 conn = DataSource.getConnection();
		 stmt = conn
				.prepareStatement("SELECT film_title, genere, age, numerospettatori FROM salacinematografica");
		 resultSet = stmt.executeQuery();
		
		 
		while (resultSet.next()) {
			film_title = resultSet.getString(film_title);
			numerospettatori = resultSet.getInt(numerospettatori);
			genere = resultSet.getString(genere);
			age = resultSet.getInt("age");	
			Film film_title = new Film(film_title, genere, age, numerospettatori);
//			User user = new User(id, name, surname, birthdate, creationtime, age, type);
			listuser.add(user);
		}
		return listuser;
		}finally {
			try { resultSet.close(); } catch (Exception e) { /* ignored */ }
			try { stmt.close(); } catch (Exception e) { /* ignored */ }
			try { conn.close(); } catch (Exception e) { /* ignored */ }
			
		}
		
		
		
	}

}

