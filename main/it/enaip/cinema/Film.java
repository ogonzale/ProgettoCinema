package it.enaip.cinema;

import java.util.ArrayList;

public class Film {
	private String title, genere;
	private int ageLimit;

	public Film(String title, String genere, int ageLimit) {
		this.title = title;
		this.genere = genere;
		this.ageLimit = ageLimit;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	
	@Override
	public String toString() {
		return "Film [Title = " + title +", Genere = " + genere + " , Age Limit = " + ageLimit + " ]";
	}


}
