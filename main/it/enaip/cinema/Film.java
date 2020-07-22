package it.enaip.cinema;

import java.util.ArrayList;

public class Film {
	Film film_title;
	private String genere;
	private int ageLimit;
	private int numerospettatori;
	
	public Film(Film film_title, String genere, int numeroaspetatori, int ageLimit) {
		this.film_title = film_title;
		this.numerospettatori =numeroaspetatori; 
		this.genere = genere ;
		this.ageLimit = ageLimit;
		
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	
	public Film getFilm_title() {
		return film_title;
	}

	public void setFilm_title(Film film_title) {
		this.film_title = film_title;
	}

	public int getNumerospettatori() {
		return numerospettatori;
	}

	public void setNumerospettatori(int numerospettatori) {
		this.numerospettatori = numerospettatori;
	}

	@Override
	public String toString() {
		return "Film [Title = " + film_title +", Genere = " + genere +"Numero di spettatori"+ numerospettatori + " , Age Limit = " + ageLimit + " ]";
	}


}
